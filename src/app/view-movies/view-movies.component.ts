import { Component, OnInit } from '@angular/core';
import { MovieApiService } from '../movie-api.service';
import { Movies } from '../movie-form/Movies';

@Component({
  selector: 'app-view-movies',
  templateUrl: './view-movies.component.html',
  styleUrls: ['./view-movies.component.css']
})
export class ViewMoviesComponent implements OnInit {

  constructor(public _movieClient:MovieApiService) { }

  ngOnInit(): void {
    this.displayData()
  }

  movies:Array<Movies>=[]

  displayData(){
    this._movieClient.fetchMovies().subscribe(
      data=>this.movies=data)
  }

}
