import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(public _route:Router) { }

  ngOnInit(): void {
  }
  userCreds={
    username:'roshan',
    password:'roshan@123'
  }

  loginUser(user:any){
    if(user.username===this.userCreds.username && user.password===this.userCreds.password){
      sessionStorage.setItem("user",user.username)
      this._route.navigate(['/add-movies'])
    }
    else{
      alert("Please check the username and Password !!")
    }


  }

}
