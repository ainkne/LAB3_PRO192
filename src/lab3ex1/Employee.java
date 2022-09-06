package lab3ex1;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {
    private String id, name, phone, email;
    private EmployeeType type;
    public Employee() {}
    public Employee(String id, String name, String phone, String email, EmployeeType type) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.type = type;
    }
    @Override
    public String toString() {
        return getId() + " | " + getName() + " | " + getPhone() + " | " + getEmail() + " | ";
    }
}
