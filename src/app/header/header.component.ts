import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  constructor(public _route: Router) { }

  ngOnInit(): void {
  }

  logOut() {
    if(confirm("Are you sure you want to log out !!")){
      sessionStorage.removeItem("user")
      alert("Log out")
      this._route.navigate(['/'])

    }
  }

}
