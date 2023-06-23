import java.util.Map;

public class Manager extends Employee {
    @Override
    public double getBonus() {
        double bonus = getSalary();
        return bonus;
    }

}
