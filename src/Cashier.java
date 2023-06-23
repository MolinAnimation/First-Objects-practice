public class Cashier extends Employee {

    public Cashier(String id, String name, String job, String employeId) {
        super(id, name, job, employeId);
    }

    @Override
    public double getBonus() {
        double bonus = (getSalary() * 10) / 100;
        return bonus;
    }
}
