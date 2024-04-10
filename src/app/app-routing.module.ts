import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuardGuard } from './auth-guard.guard';
import { ErrorPageComponent } from './error-page/error-page.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { MovieFormComponent } from './movie-form/movie-form.component';
import { SearchMoviesComponent } from './search-movies/search-movies.component';
import { SearchRatingComponent } from './search-rating/search-rating.component';
import { ViewMoviesComponent } from './view-movies/view-movies.component';

const routes: Routes = [
  {
    path:'home', component:HomeComponent
  },
  {
    path:'', component:HomeComponent
  },{
    path:'login', component:LoginComponent
  },
  {
    path: 'add-movies', component: MovieFormComponent, canActivate:[AuthGuardGuard]
  },
  {
    path: 'view-movies', component: ViewMoviesComponent
  },
  {
    path: 'search-movies', component: SearchMoviesComponent
  },
  {
    path:'search-rating',component:SearchRatingComponent
  }, {
    path: 'error', component: ErrorPageComponent
  }, {
    path: '**', redirectTo: '/error'
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
