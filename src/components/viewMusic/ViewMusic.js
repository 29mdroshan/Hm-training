import React, { Component } from 'react'
import MusicList from '../musicList/MusicList'
import '../style.css'
import axios from 'axios'

export class ViewMusic extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         albums:[],
         search:''
      }
    }
    componentDidMount(){
        this.fetchData()
    }
    fetchData(){
        axios.get("http://localhost:5500/music")
        .then(songs=>{
            this.setState({
                albums:songs.data
            })
        })
        .catch((err)=>console.log(err))
    }
  render() {
    
    return (
      <div className='container'>
        <button className='btn btn-dark refresh' onClick={()=>this.fetchData()}>Refresh</button>
        <div>
            <input type='search' name='search' id='search' placeholder='Enter Id' value={this.state.search} onChange={(event)=>this.takingFeild(event)}></input>
            
            <button className='btn btn-primary' onClick={()=>this.searchMusic(this.state.search)} >search</button>
        </div>
       
        <table className='table table-striped'>
          <thead>
            <th>Album Id</th>
            <th>Title</th>
            <th>Artist</th>
            <th>Price</th>
            <th>Action</th>
            </thead>
            <tbody>  
            {this.state.albums.map((songs) => <MusicList  song={songs}></MusicList>)}
            </tbody>
        </table>

      </div>
    )
  }
  takingFeild(event){
  
    this.setState({
        search:event.target.value
    })

  }
  searchMusic(id){
    console.log(id)
    for(let i of this.state.albums){
        if(i.id==id)
        return alert("Found")
    }
    return alert("not found")
  
  }

}

export default ViewMusic