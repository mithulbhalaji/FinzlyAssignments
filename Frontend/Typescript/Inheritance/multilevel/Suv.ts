import {Car} from "./Car";
class Suv extends Car{
    fourWheel : boolean;
     override move(): void {
         console.log("Suv is moving");
    }
}

let suv = new Suv();
suv.fourWheel = true;
suv.carNumber = 5412;
suv.name = "Isuzu";

console.log(suv);
suv.move();