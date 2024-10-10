
package java_class;
import java.util.Scanner;

 class Third {
   



    String name;
    int id;
    float salary;

    float raise_salary(float percent) {
        return salary += (salary * (percent / 100));
    }

    public static void main(String[] args) {
        Third th = new Third();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name: ");
        th.name = sc.nextLine();

        System.out.println("Enter the id: ");
        th.id = sc.nextInt();

        System.out.println("Enter the salary: ");
        th.salary = sc.nextFloat();

        System.out.println("Enter the percentage to increment salary: ");
        int percentage = sc.nextInt();
        sc.close();

        System.out.println("New Salary: " + th.raise_salary(percentage));
    }
}

