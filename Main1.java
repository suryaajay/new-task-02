// Base class
class Person {
    String name;
    int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Employee that inherits from Person
class Employee extends Person {
    int employeeID;
    double salary;

    // Constructor for Employee using super()
    public Employee(String name, int age, int employeeID, double salary) {
        super(name, age); // Calls the constructor of Person
        this.employeeID = employeeID;
        this.salary = salary;
    }

    // Method to display details including Employee-specific attributes
    @Override
    public void display() {
        super.display(); // Calls display method from Person
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }
}

// Main class to test
public class Main1 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 30, 101, 50000.0);
        emp.display(); // Display employee details
    }
}
