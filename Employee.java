class Employee {
    public void display() {
        System.out.println("Name of class is Employee.");
    }

    public void calcSalary() {
        System.out.println("Salary of employee is 10000.");
    }
}
public class Engineer extends Employee {
    public void calcSalary() {
        super.display();
        super.calcSalary();
        System.out.println("Salary of engineer is 20000.");
    }
    public static void main(String[] args) {
        Engineer engineer = new Engineer();
        engineer.calcSalary();
    }
}


