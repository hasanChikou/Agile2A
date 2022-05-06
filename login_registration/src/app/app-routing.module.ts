import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { RegistrationCompComponent } from './registration-comp/registration-comp.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'register', component:RegistrationCompComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
