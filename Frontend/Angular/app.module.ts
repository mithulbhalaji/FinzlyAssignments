import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { EmployeeComponent } from './employee/employee.component';
import { StudentComponent } from './student/student.component';
import { LoginComponent } from './login/login.component';
import { ColorchangeComponent } from './colorchange/colorchange.component';
import { PrimenumberComponent } from './primenumber/primenumber.component';


//We can create custom module file
@NgModule({
  declarations: [
    AppComponent,
    EmployeeComponent,
    StudentComponent,
    LoginComponent,
    ColorchangeComponent,
    PrimenumberComponent
  ],
  //We can import inbuilt modules and also custom modules
  //Module is a collection of component, service, mthod, classess, interface...
  imports: [
    BrowserModule,
    AppRoutingModule
  ],

  //You can register your service, we can use both inbuilt and custom service.
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
