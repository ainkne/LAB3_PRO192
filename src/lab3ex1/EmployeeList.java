package lab3ex1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
public class EmployeeList {
    private static final List<Employee> employeeList = new ArrayList<>();
    public static void createEmployee(EmployeeType type){
        Scanner input = new Scanner(System.in);
        Employee employee = new Employee();
        System.out.print("Enter id> ");
        String id = input.nextLine();
        employee.setId(id);
        System.out.print("Enter name> ");
        String name = input.nextLine();
        employee.setName(name);
        System.out.print("Enter phone number> ");
        String phone = input.nextLine();
        employee.setPhone(phone);
        System.out.print("Enter email> ");
        String email = input.nextLine();
        employee.setEmail(email);
        switch (type){
            case DOCTOR -> createDoctor(employee);
            case NURSE -> createNurse(employee);
        }
    }
    private static void createDoctor(Employee employee){
        Scanner input = new Scanner(System.in);
        Doctor doctor = new Doctor();
        System.out.print("Enter doctor's coefficient> ");
        float coefficient = input.nextFloat();
        doctor.setCoefficient(coefficient);
        employeeList.add(new Doctor(employee.getId(), employee.getName(), employee.getPhone(), employee.getEmail(),
                EmployeeType.DOCTOR, doctor.getCoefficient()));
    }
    private static void createNurse(Employee employee){
        Scanner input = new Scanner(System.in);
        Nurse nurse = new Nurse();
        System.out.print("Enter nurse's department> ");
        String department = input.nextLine();
        nurse.setDepartment(department);
        System.out.print("Enter nurse's allowance> ");
        float allowance = input.nextFloat();
        nurse.setAllowance(allowance);
        employeeList.add(new Nurse(employee.getId(), employee.getName(), employee.getPhone(), employee.getEmail(),
                EmployeeType.NURSE, nurse.getDepartment(), nurse.getAllowance()));
    }
    public static void printEmployee(){
        Map<EmployeeType, List<Employee>> groupByType = employeeList
                .stream()
                .collect(Collectors.groupingBy(Employee::getType));
        groupByType.forEach((type, employees) -> {
            System.out.println("======"+type+"======");
            employees.forEach(System.out::println);
            System.out.println();
        });
    }
}
