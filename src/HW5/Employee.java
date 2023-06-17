package HW5;
//Create a class called Person with two instance variables, firstName and lastName.
//      Then create a subclass called Employee that inherits from Person.
//       The Employee class should have an additional instance variable, salary,
//       and an implementation of a method getSalary() that returns the employee's salary.
public class Employee extends Person{
    int salary=5000;
    String firstname;
    String lastname;


    String getSalary(String firstname,String lastname){
        return firstname+lastname+"this person salary is "+salary;
    }




}
