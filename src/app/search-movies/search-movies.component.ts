import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MovieApiService } from '../movie-api.service';
import { Movies } from '../movie-form/Movies';

@Component({
  selector: 'app-search-movies',
  templateUrl: './search-movies.component.html',
  styleUrls: ['./search-movies.component.css']
})
export class SearchMoviesComponent implements OnInit {

  constructor(public _movieClient:MovieApiService) { }

  ngOnInit(): void {
  }

  movies?:any

  searchMovies(genre:any){
    if(genre){
    this._movieClient.searchMoviesByGenre(genre).subscribe(
      data=>this.movies=data
    )
    }
    else{
      alert("Please select Genre!!")
    }

  }

}
