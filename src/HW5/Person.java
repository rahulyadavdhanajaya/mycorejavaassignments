package HW5;

//Create a class called Person with two instance variables, firstName and lastName.
  //      Then create a subclass called Employee that inherits from Person.
 //       The Employee class should have an additional instance variable, salary,
 //       and an implementation of a method getSalary() that returns the employee's salary.
public class Person {
    String firstname;

     String lastname;


    public void person(String firstname, String lastname){
         this.firstname=firstname;
         this.lastname=lastname;
     }
}
