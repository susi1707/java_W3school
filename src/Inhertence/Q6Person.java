package Inhertence;
class Person{
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
class Employeee extends Person{
String employeeId;
String title;

    public Employeee(String firstName, String lastName,String employeeId,String title) {
        super(firstName, lastName);
        this.employeeId=employeeId;
        this.title = title;
    }
    public String getLastName(){
        return super.lastName +","+title;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
public class Q6Person {
    public static void main(String[] args) {
        Employeee employee1 = new Employeee("Kortney", "Rosalee", "4451", "HR Manager");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + " (" + employee1.getEmployeeId() + ")");
        Employeee employee2 = new Employeee("Junior", "Philipa", "4452", "Software Manager");
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + " (" + employee2.getEmployeeId() + ")");
    }
    }

