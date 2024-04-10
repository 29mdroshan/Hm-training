import { Component, OnInit } from '@angular/core';
import { MovieApiService } from '../movie-api.service';
import { Movies } from '../movie-form/Movies';

@Component({
  selector: 'app-search-rating',
  templateUrl: './search-rating.component.html',
  styleUrls: ['./search-rating.component.css']
})
export class SearchRatingComponent implements OnInit {

  constructor(public _movieClient:MovieApiService) { }

  ngOnInit(): void {
  }
  movies:Array<Movies>=[]
  ratingText?:any

  searchMovies(rating:any){
    console.log(rating)
    this._movieClient.fetchMovies().subscribe(
      data => {
        this.movies=data
      }
    )
    switch(rating){
      
      case "b": { 
        console.log("dfxgchjmn")
        for(let i of this.movies){
          if(Number(i.rating)>=2)
          this.ratingText=i
        }
        console.log(this.ratingText)
        break; 
     } 

    }
  }

  

}
