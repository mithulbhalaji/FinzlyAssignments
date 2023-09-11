import { Vehicle } from "./Vehicle";
export class Car extends Vehicle{
    carNumber:number;
    override move(): void {
        console.log("Car is moving");
    }
}