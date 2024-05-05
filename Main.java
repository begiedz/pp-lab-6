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

    Worker worker5 = new Worker("Jack", 2500, 1, "15-01-2023", "Junior Developer");
    Worker worker6 = new Worker("Sarah", 2800, 6, "20-11-2022", "Senior Developer");
    Worker worker7 = new Worker("Liroy", 2700, 1, "10-03-2023", "DevOps");


    Manager manager2 = new Manager("Adam", 5000, 7, "01-09-2022", "IT Manager");

    ArrayList<Employee> employees = new ArrayList<Employee>();
    employees.add(worker1);
    employees.add(worker2);
    employees.add(worker3);
    employees.add(worker4);
    employees.add(manager);
    
    employees.add(worker5);
    employees.add(worker6);
    employees.add(worker7);
    employees.add(manager2);
    

    int totalSalaryForAllEmployees = 0;
    for (Employee employee : employees) {
      totalSalaryForAllEmployees += employee.getSalary();
    }

    int totalSalaryForAllManagers = 0;
    for (Employee employee : employees) {
      if (employee instanceof Manager) {
          totalSalaryForAllManagers += employee.getSalary();
      }
    }
      int totalSalaryForAllWorkers = 0; 
      for (Employee employee : employees) {
          if (employee instanceof Worker) {
              totalSalaryForAllWorkers += employee.getSalary();
          }
      }
  

  System.out.println("total Salary For All Employees: " + totalSalaryForAllEmployees);
  System.out.println("total Salary For All Managers: " + totalSalaryForAllManagers);
  System.out.println("total Salary For All Workers): " + totalSalaryForAllWorkers);

  System.out.println("");

  for (int i = 0; i < employees.size(); i++) {
    for (int j = i + 1; j < employees.size(); j++) {
        if (employees.get(i).equals(employees.get(j))) {
            System.out.println("Workers " + employees.get(i).getName() + " and " + employees.get(j).getName() + " has the same ID: " + employees.get(i).hashCode());
        }
    }
}
System.out.println("");

    for (Employee employee : employees) {
      employee.work();
      System.out.println("- " + employee.getName() + "Position: " + employee.getPosition() + ", Hire date: " + employee.getHireDate() + ", Salary: " + employee.getSalary());
      System.out.println("");
    }
// zad3

    System.out.println(worker5.getName() + " has ID: " + worker5.hashCode());
    System.out.println(worker6.getName() + " has ID: " + worker6.hashCode());
    System.out.println(worker7.getName() + " has ID: " + worker7.hashCode());
    System.out.println(manager2.getName() + " has ID: " + manager2.hashCode());

    System.out.println("");

    System.out.println(worker5.getName() + " ID equals " + worker6.getName() +" ID: "+ worker5.equals(worker6));

    System.out.println(worker5.getName() + " ID equals " + worker7.getName() +" ID: "+ worker5.equals(worker7));

    System.out.println(worker5.getName() + " ID equals " + manager2.getName() +" ID: "+ worker5.equals(manager2));
  
  }
}
