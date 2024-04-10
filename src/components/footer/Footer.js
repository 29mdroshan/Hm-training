import React, { Component } from 'react'

export class Footer extends Component {
    constructor(props) {
      super(props)
    
      this.state = {
         today:new Date()
      }
    }

  render(props) {
    setInterval(()=>{
        this.setState({
           today:new Date()
        })
        
    },1000)
    return (
        <div className='container footer'>
        <br></br>
        <p>@copyRights @ Music-Store</p>
        <p>{this.state.today.toTimeString()}</p>
    </div>
    )
  }
}

export default Footer