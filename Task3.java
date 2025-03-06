import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
        System.out.println("-------------------------");
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Aravind", 50000);
        Employee emp2 = new Employee(2, "Vamsi", 60000);
        Employee emp3 = new Employee(3, "Vandana", 70000);

        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        for (Employee emp : employees) {
            emp.print();
        }
    }
}
