import React from 'react'
import '../style.css'
import {NavLink} from 'react-router-dom'

function Header() {
  return (
    <div className='container header'>
        <h1>Music Store App</h1><br></br>
        
        <ul className="nav">
          <li className="nav-item">
            <NavLink   className="nav-link" to="home">Home</NavLink>
          </li>
          <li className="nav-item">
            <NavLink  className="nav-link" to="add-album">Add Album</NavLink>
          </li>
          <li className="nav-item">
            <NavLink  className="nav-link" to='view-album'>View Album</NavLink>
          </li>
        
        </ul>
    </div>
  )
}

export default Header