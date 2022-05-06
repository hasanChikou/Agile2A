import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  baseurl="http://localhost:8080/UserLogin";
  constructor(private httpclient : HttpClient ) { 
  }

  loginUser(user : User): Observable<Object>{
    console.log(user);
   return this.httpclient.post(`${this.baseurl}`,user) ;
  }
}
