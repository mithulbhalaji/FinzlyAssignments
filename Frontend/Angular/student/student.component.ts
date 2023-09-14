import { Interpolation } from '@angular/compiler';
import { BindingFlags } from '@angular/compiler/src/core';
import { Component, OnInit } from '@angular/core';
import { fileURLToPath } from 'url';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  constructor() { }

  //It is a interface. It will provide the show files that we need to show first without loading
  ngOnInit(): void {

  }

}

//Data binding
//     Data flow from component to view file
//     1 Sring Interpolation
//     2 Property Binding
//     3 


// Sting Interpolation
// ->It shows in dynamic way