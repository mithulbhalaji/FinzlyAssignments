import { Person } from "./Person";

class Student extends Person{
    id:number;
    grade:number;

    override talk(): void {
        console.log("Im a student");
    }

}

let student = new Student;
student.name="mithul";
student.age=14;
student.gender="male";
student.id = 12201;
student.grade = 8

console.log(student);
student.talk();