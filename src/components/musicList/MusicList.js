import React from 'react'
import axios from 'axios'

function MusicList({song}) {
    
    return (
        <>
        <tr>
            <td>{song.albumId}</td>
            <td>{song.title}</td>
            <td>{song.artist}</td>
            <td>{song.price}</td>
            <td><button className='btn btn-warning' onClick={()=>deleteMusic(song.id)}>Delete</button></td>
        </tr>
        </>
      )
      function deleteMusic(id){
        axios.delete(" http://localhost:5500/music/"+id)
        .then(alert("Music Deleted with ID :"+id))
        .catch((err)=>console.log(err))
      }
  
}


export default MusicList