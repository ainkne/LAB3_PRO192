package lab3ex1;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Doctor extends Employee{
    private float coefficient;
    public Doctor(){}
    public Doctor(String id, String name, String phone, String email, EmployeeType type, float coefficient) {
        super(id, name, phone, email, type);
        this.coefficient = coefficient;
    }

    @Override
    public String toString() {
        return super.toString() + getCoefficient();
    }
}
