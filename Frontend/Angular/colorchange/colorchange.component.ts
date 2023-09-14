import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-colorchange',
  templateUrl: './colorchange.component.html',
  styleUrls: ['./colorchange.component.css']
})
export class ColorchangeComponent implements OnInit {

  constructor() { }


  isGreen:boolean = false;
  ngOnInit(): void {
  }

  colorChange(){
    if(this.isGreen){
      this.isGreen = false;
    }else{
      this.isGreen=true;
    }
    
  }


}
