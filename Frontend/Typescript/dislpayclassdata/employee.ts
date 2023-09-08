export class Employee{
    private id:number|undefined;
    private name:string|undefined;
    private department:string|undefined;
    private age:number|undefined;

    constructor(id:number,name:string,department:string,age:number){
        this.id=id;
        this.name=name;
        this.department= department;
        this.age=age;
    }

    public getId(){
        return this.id;
    }
    public getName(){
        return this.name;
    }
    public getDepartment(){
        return this.department;
    }
    public getAge(){
        return this.age;
    }

    public setDepartment(department:string){
        this.department=department;
    }

    public setAge(age:number){
        this.age=age;
    }

    public setid(id:number){
        this.id=id;
    }

    public setName(name:string){
        this.name=name;
    }


    

}