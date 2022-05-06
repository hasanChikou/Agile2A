import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-annonceproposer',
  templateUrl: './annonceproposer.component.html',
  styleUrls: ['./annonceproposer.component.css']
})
export class AnnonceproposerComponent implements OnInit {

  title = 'image-gallery';
 public data: any = []
 constructor(private http: HttpClient) {
 }

 getData(){
  const url ='http://localhost:8080/annonce/all'
  this.http.get(url).subscribe((res)=>{
     this.data = res
     console.log(this.data)

   })
 }

 ngOnInit() {
   this.getData()
 }

}
