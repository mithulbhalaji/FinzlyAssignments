import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  result:string='';

  onKeyDown(data:any){
    if(data.length>20){
      alert("Only 20 digits are allowed");
    }
  }

  onClick(email:any,password:any){
    if(email == "mithulhpj@gmail.com" && password=="qwerty"){
      this.result = "Logged in successfully";
    }else{
      this.result = "Login failed";
    }
  }

}
