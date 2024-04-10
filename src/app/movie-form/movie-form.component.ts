import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { MovieApiService } from '../movie-api.service';
import { Movies } from './Movies';

@Component({
  selector: 'app-movie-form',
  templateUrl: './movie-form.component.html',
  styleUrls: ['./movie-form.component.css']
})
export class MovieFormComponent implements OnInit {

  constructor(public _router: Router, public _movieClient: MovieApiService) { }

  ngOnInit(): void {
  }
  saveData(movie: Movies) {
    this._movieClient.saveMovie(movie).subscribe(
      data => {
        alert("Movie saved")
        this._router.navigate(['/view-movies']) 
      }
    )


  }

}
