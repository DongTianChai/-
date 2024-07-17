package Unite4_Employee_and_Manager;

public class Employee {
    private String name;
    private String address;
    private String jobNumber;
    private double salary;
    private  int age;
    public void payRise(double increase){
        this.salary=this.salary*(1+increase);
    }

    public Employee(String name, String address, String jobNumber, double salary, int age) {
        this.name = name;
        this.address = address;
        this.jobNumber = jobNumber;
        this.salary = salary;
        this.age = age;
    }
    public void info(){
        System.out.print("名字"+this.name);
        System.out.print("  地址"+this.address);
        System.out.print("  工号"+this.jobNumber);
        System.out.print("  工资"+this.salary);
        System.out.print("  工龄"+ this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getJobNumber() {
        return jobNumber;
    }

    public void setJobNumber(String jobNumber) {
        this.jobNumber = jobNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
