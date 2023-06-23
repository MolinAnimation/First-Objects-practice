import java.util.Map;

public class Employee extends Person {
    private double salary;
    private String job;
    private String employeeId;
    private Map<String, String> schedule;
    private Map<String, String> jobs;

    public Employee(String id, String name, String job, String employeId) {
        super(id, name);
        this.job = job;
        this.employeeId = employeId;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getJob() {
        return this.job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public Map<String, String> getSchedule() {
        return this.schedule;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Map<String, String> getJobs() {
        return this.jobs;
    }

    public void setJobs(Map<String, String> jobs) {
        this.jobs = jobs;
    }

    public double getBonus() {
        double bonus = 0;
        return bonus;
    }

    public void setBonus() {
        setSalary(getBonus() + getSalary());
    }
}
