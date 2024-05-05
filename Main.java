import models.Manager;
import models.Worker;

public class Main {
  public static void main(String args[]){
    Worker worker1 = new Worker("John", 2500, 1);
    Worker worker2 = new Worker("Alice", 2800, 2);
    Worker worker3 = new Worker("Bob", 2700, 3);
    Worker worker4 = new Worker("Eve", 2600, 4);

    Manager manager = new Manager("Michael", 5000, 5);

    System.out.println("Worker 1 salary: " + worker1.getSalary());
    System.out.println("Worker 2 salary: " + worker2.getSalary());
    System.out.println("Worker 3 salary: " + worker3.getSalary());
    System.out.println("Worker 4 salary: " + worker4.getSalary());
    System.out.println("Manager salary: " + manager.getSalary());

    worker1.work();
    worker2.work();
    worker3.work();
    worker4.work();
    manager.work();
  }
}
