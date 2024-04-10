import React, { Component } from 'react'
import axios from 'axios'



export class MusicForm extends Component {
    constructor(props) {
        super(props)

        this.state = {
            music: {
                albumId: '',
                title: '',
                artist: '',
                price: '',
                validId: false,
                validTitle: false,
                validArtist: false,
                validPrice: false,
                validForm: false,
                touch:false,
                
            }
        }
    }
    render() {
        const idError= this.state.touch && !this.state.validId && <p className='text-danger'>Album Id is Required</p>
        const titleError=this.state.touch && !this.state.validTitle && <p className='text-danger'>Album Title is Required</p>
        const artistError=this.state.touch && !this.state.validArtist && <p className='text-danger'>Album Artist is Required</p>
        const priceError=this.state.touch && !this.state.validPrice && <p className='text-danger'>Price is Required</p>
        
      
        return (
            <div className='container main'>
                <h2>Add Album</h2>
                <form onSubmit={(event) => this.saveMusic(event)}>
                    <div className='form-group'>
                        <label className='form-label' htmlFor='albumId'> Album Id : </label>
                        <input type='text' className='form-control' name='albumId' id='albumId' value={this.state.albumId} onChange={(event) => this.handlingFeilds(event)}></input>
                        {idError}
                    </div>
                    <div>
                        <label className='form-label' htmlFor='title'> Title : </label>
                        <input type="text" className='form-control' name='title' id='title' value={this.state.title} onChange={(event) => this.handlingFeilds(event)}></input>
                        {titleError}

                    </div>
                    <div>
                        <label className='form-label' htmlFor='artist'> Artist : </label>
                        <input type='text' className='form-control' name='artist' id='artist' value={this.state.artist} onChange={(event) => this.handlingFeilds(event)}></input>
                        {artistError}
                    </div>
                    <div>
                        <label className='form-label' htmlFor='price'> Price : </label>
                        <input type='text' className='form-control' name='price' id='price' value={this.state.price} onChange={(event) => this.handlingFeilds(event)}></input>
                        {priceError}
                    </div>
                    <br></br>
                    <div>
                        <button type='submit' disabled={!this.state.validForm} className='btn btn-success'>Save Album</button>  
                                           
                    </div>

                </form>
            </div>

        )
    }
    handlingFeilds(event) {
        console.log("handing inputs")
        const name = event.target.name
        const value = event.target.value
        this.setState({
            [name]: value,
            touch:true
        }, () => this.validateFeilds(name, value))
    }

    validateFeilds(name, value) {
        if (name === "albumId") {
            this.setState({ validId: value.length >= 4 && value.length < 6 })
        }
        else if (name === "title") {
            this.setState({ validTitle: value.length > 4 })
        }
        else if (name === "artist") {
            this.setState({ validArtist: value.length > 4 })
        }
        else if (name === "price") {
            this.setState({ validPrice: value.length > 3 })
        }
        this.setState({}, () => this.validateForm())
    }

    validateForm() {
        console.log(this.state)
        const isValid = this.state.validId && this.state.validTitle && this.state.validArtist && this.state.validPrice
        console.log(isValid)
        this.setState({
            validForm: isValid
        })
    }

    saveMusic(event){
        event.preventDefault()
        const album={
            id:this.state.albumId,
            albumId:this.state.albumId,
            title:this.state.title,
            artist:this.state.artist,
            price:this.state.price
        }
        axios.post("http://localhost:5500/music",album)
        .then(alert("Music Album Saved.!"))
        .catch(err=>console.log(err))
    }
    
    

}


export default MusicForm