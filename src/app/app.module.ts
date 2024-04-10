import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import {HttpClientModule} from '@angular/common/http'


import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { HeaderComponent } from './header/header.component';
import { ViewMoviesComponent } from './view-movies/view-movies.component';
import { SearchMoviesComponent } from './search-movies/search-movies.component';
import { ErrorPageComponent } from './error-page/error-page.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { SearchRatingComponent } from './search-rating/search-rating.component';

@NgModule({
  declarations: [
    AppComponent,
    MovieFormComponent,
    HeaderComponent,
    ViewMoviesComponent,
    SearchMoviesComponent,
    ErrorPageComponent,
    HomeComponent,
    LoginComponent,
    SearchRatingComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
