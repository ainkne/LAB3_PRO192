package lab3ex1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO EMPLOYEE MANAGEMENT");
        while (true) {
            System.out.println();
            System.out.println("""
                    1. Create Doctor
                    2. Create Nurse
                    3. View all employee's information
                    4. Exit program."""
            );
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1 -> EmployeeList.createEmployee(EmployeeType.DOCTOR);
                case 2 -> EmployeeList.createEmployee(EmployeeType.NURSE);
                case 3 -> EmployeeList.printEmployee();
                case 4 -> System.exit(0);
            }
        }
    }
}
