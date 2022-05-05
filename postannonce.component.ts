import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { CrudService } from 'app/crud/crud.service';

@Component({
  selector: 'app-postannonce',
  templateUrl: './postannonce.component.html',
  styleUrls: ['./postannonce.component.css',"./postannonce.component.scss"]
})
export class PostannonceComponent implements OnInit {
  selectedFile=null;
  add = { telephone_annonceur: '', email_annonceur: '', animal_AGE: '',animal_ID:'5',animal_RACE:'', animal_genre:'',vaccin:'',animal_NOM:'',date_ANONCE:'2022-01-04',description:'az'};
    constructor(private http:HttpClient,public crudService: CrudService) { }

  ngOnInit(): void {
    
  }
  addAnnonce(data: any) {
    this.crudService.addAnnonce(this.add).subscribe((data: {}) => {
     /* this.add.id_groupe="";
      this.add.nom_groupe="";
      this.add.ordre="";*/
      
    })
  }
  
  onFileSelected(event){
    this.selectedFile=<File>event.target.files[0];}
    
  onUpload(){
    const fd=new FormData();
    fd.append('image',this.selectedFile,this.selectedFile.name)
    this.http.post('./src/assets/img/annonce',fd).subscribe(res =>{console.log(res);})
  }

}
