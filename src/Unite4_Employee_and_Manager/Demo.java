package Unite4_Employee_and_Manager;


import java.text.DecimalFormat;

public class Demo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.0");
        Employee employee=new Employee("魏辰睿","16栋321","2022",3000.0,20);
        Manager manager=new Manager("李浩楠","16栋322","1111",6000.0,25,"一级");
        System.out.print("员工");
        employee.info();
        System.out.print("\n"+"经理");
        manager.info();

        employee.payRise(0.1);
        manager.payRise(0.2);
        System.out.println("涨工资后员工和经理的工资");
        System.out.println("员工工资"+df.format(employee.getSalary())+"经理工资"+ manager.getSalary());
    }
}
