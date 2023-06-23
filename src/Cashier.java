public class Cashier extends Employee {

    @Override
    public double getBonus() {
        double bonus = (getSalary() * 10) / 100;
        return bonus;
    }
}
