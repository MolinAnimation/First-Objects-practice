import java.util.Map;

public class Manager extends Employee {

    public Manager(String id, String name, String job, String employeId) {
        super(id, name, job, employeId);
    }

    @Override
    public double getBonus() {
        double bonus = getSalary();
        return bonus;
    }

}
