import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Movies } from './movie-form/Movies';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MovieApiService {

  constructor(public _http:HttpClient) { }

  url='http://localhost:5000/movies'
  
  saveMovie(movie:Movies):Observable<Movies>{
    return this._http.post<Movies>(this.url,movie)
  }

  fetchMovies():Observable<Array<Movies>>{
    return this._http.get<Array<Movies>>(this.url)
  }

  searchMoviesByGenre(genre:any):Observable<Movies>{
    return this._http.get<Movies>(this.url+"/?genre="+genre)
  }

  
}
