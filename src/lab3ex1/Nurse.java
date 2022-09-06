package lab3ex1;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Nurse extends Employee{
    private String department;
    private float allowance;
    public Nurse(){}
    public Nurse(String id, String name, String phone, String email, EmployeeType type, String department, float allowance) {
        super(id, name, phone, email, type);
        this.department = department;
        this.allowance = allowance;
    }
    @Override
    public String toString() {
        return super.toString() + getDepartment() + " | " + getAllowance();
    }
}
