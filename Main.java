import models.Manager;
import models.Worker;
import java.util.ArrayList;

import company.abstracts.Employee;

public class Main {
  public static void main(String args[]){
    Worker worker1 = new Worker("John", 2500, 1, "15-01-2023", "Junior Developer");
    Worker worker2 = new Worker("Alice", 2800, 2, "20-11-2022", "Senior Developer");
    Worker worker3 = new Worker("Bob", 2700, 3, "10-03-2023", "DevOps");
    Worker worker4 = new Worker("Eve", 2600, 4, "01-09-2022", "UX/UI Designer");

    Manager manager = new Manager("Michael", 5000, 5, "01-09-2022", "IT Manager");

    ArrayList<Employee> employees = new ArrayList<Employee>();
    employees.add(worker1);
    employees.add(worker2);
    employees.add(worker3);
    employees.add(worker4);
    employees.add(manager);

    for (Employee employee : employees) {
      employee.work();
      System.out.println("- " + employee.getName() + "Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
      System.out.println("");
    }
  }
}
