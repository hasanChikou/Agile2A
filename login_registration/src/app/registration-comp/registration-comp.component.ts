import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { RegisterService } from '../register.service';

@Component({
  selector: 'app-registration-comp',
  templateUrl: './registration-comp.component.html',
  styleUrls: ['./registration-comp.component.css']
})
export class RegistrationCompComponent implements OnInit {
user:User = new User() ; 
  constructor(private registerservice : RegisterService) { }

  ngOnInit(): void {
  }

  userRegister(){
    console.log(this.user);
    this.registerservice.registerUser(this.user).subscribe(data=>{
      alert("Successfully Registration ")},error=>alert("Error"));
  }
}
