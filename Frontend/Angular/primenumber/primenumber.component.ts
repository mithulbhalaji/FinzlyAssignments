import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-primenumber',
  templateUrl: './primenumber.component.html',
  styleUrls: ['./primenumber.component.css']
})
export class PrimenumberComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  result:boolean | null= null;

  isPrimeNumber(num:string){
    const actualNumber:number = parseInt(num);
    if(actualNumber<=1){
      this.result =  false;
    }else{
      for(let i:number=2;i<actualNumber/2;i++){
        if(actualNumber%i==0){
          this.result =  false;
          return;
        }
      }
      this.result = true;
    }
    
  }

}
