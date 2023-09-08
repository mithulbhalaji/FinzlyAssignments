"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(id, name, department, age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
    }
    Employee.prototype.getId = function () {
        return this.id;
    };
    Employee.prototype.getName = function () {
        return this.name;
    };
    Employee.prototype.getDepartment = function () {
        return this.department;
    };
    Employee.prototype.getAge = function () {
        return this.age;
    };
    Employee.prototype.setDepartment = function (department) {
        this.department = department;
    };
    Employee.prototype.setAge = function (age) {
        this.age = age;
    };
    Employee.prototype.setid = function (id) {
        this.id = id;
    };
    Employee.prototype.setName = function (name) {
        this.name = name;
    };
    return Employee;
}());
exports.Employee = Employee;
