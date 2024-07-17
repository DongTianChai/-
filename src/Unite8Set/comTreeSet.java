package Unite8Set;

import java.util.TreeSet;

public class comTreeSet {
    public static void main(String[] args) {
        TreeSet<Student> ts=new TreeSet<>();
        Student s1=new Student("wang",26);
        Student s2=new Student("lihua",26);
        Student s3=new Student("zhanglei",26);
        Student s4=new Student("zhaojinmai",26);
        Student s5=new Student("zhaonmai",30);
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student s:ts)
            System.out.println(s.getName()+","+s.getAge());
    }
}
