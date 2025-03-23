package Interface;


import java.util.Scanner;

public class EmployeeManagmentInterface implements timeEmployeement{
    private int id;
    private String name;
    private int salary;

    private int hour_rate;
    private int hour_work;

    public EmployeeManagmentInterface(int id, String name, int salary, int hour_rate, int hour_work) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hour_rate = hour_rate;
        this.hour_work = hour_work;
    }

    public EmployeeManagmentInterface() {

    }

    @Override
    public String FullTimeEmployee() {
        return "ID: "+this.getId()+",Name: "+this.getName()+",Salary: "+this.getSalary();
    }

    @Override
    public String PartTimeEmployee() {
        return "ID: "+this.getId()+",Name: "+this.getName()+",Salary: "+this.getHour_rate()*this.getHour_work();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(int hour_rate) {
        this.hour_rate = hour_rate;
    }

    public int getHour_work() {
        return hour_work;
    }

    public void setHour_work(int hour_work) {
        this.hour_work = hour_work;
    }

    public static void main(String[] args) {

        Scanner In = new Scanner(System.in);
        System.out.println("Enter Number of Employee");
        int number_Employee= In.nextInt();
        EmployeeManagmentInterface emi = new EmployeeManagmentInterface();
       for(int i=1; i<=number_Employee;i++){
           System.out.println("Enter Employee Type (full/part): ");
           String full_part = In.next();
           switch(full_part) {
               case "full":
                   System.out.println("Enter Name: ");
                   String firstName = In.next();
                   emi.setName(firstName);
                   System.out.println("Enter Id: ");
                   int Id = In.nextInt();
                   emi.setId(Id);
                   System.out.println("Enter Salary");
                   int salary = In.nextInt();
                   emi.setSalary(salary);
                   break;
               case "part":
                   System.out.println("Enter Name: ");
                   String partFirstName = In.next();
                   emi.setName(partFirstName);
                   System.out.println("Enter Id: ");
                   int partId = In.nextInt();
                   emi.setId(partId);
                   System.out.println("Enter Hourly Rate");
                   int hourRate = In.nextInt();
                   emi.setHour_rate(hourRate);
                   System.out.println("Enter Hourly work");
                   int hourWork = In.nextInt();
                   emi.setHour_work(hourWork);
                   break;
               default:
                   System.out.println("Not found");
           }
       }
        System.out.println(emi.FullTimeEmployee());
        System.out.println(emi.PartTimeEmployee());

    }


}
