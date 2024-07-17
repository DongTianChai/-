package Unite4_Employee_and_Manager;

public class Manager extends Employee {
    private String rank;

    @Override
    public void payRise(double increase) {
        super.payRise(increase);
    }

    public Manager(String name, String address, String jobNumber, double salary, int age,String rank) {
        super(name, address, jobNumber, salary, age);
        this.rank=rank;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("  级别"+this.rank);
    }

}
