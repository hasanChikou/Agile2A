import { Component, OnInit } from '@angular/core';
import { LoginService } from 'app/login.service';
import { User } from 'app/user';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user:User = new User() ; 
  constructor(private loginservice : LoginService) { }

  ngOnInit(): void {
  }
  userLogin(){
    console.log(this.user);
    this.loginservice.loginUser(this.user).subscribe(data=>{
      alert("Successfully Logged ")},error=>alert("Error"));
  }

}
