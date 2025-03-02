import java.util.Scanner;

public class Main {
    public String name;
    public int age;

    public Main(String name) {
        this.name = name;
        this.age = 18;
    }

    public Main(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter name for person 1: ");
        String name1 = scanner.nextLine();
        Main person1 = new Main(name1);
        person1.display();

        System.out.print("Enter name for person 2: ");
        String name2 = scanner.nextLine();
        System.out.print("Enter age for person 2: ");
        int age2 = scanner.nextInt();
        Main person2 = new Main(name2, age2);
        person2.display();
        scanner.close();
    }
}

