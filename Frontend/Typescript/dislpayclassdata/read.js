"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var employee_1 = require("./employee");
var emp = new employee_1.Employee(1, "Mithul", "dev", 22);
console.log(emp);
emp.setAge(23);
console.log(emp);
