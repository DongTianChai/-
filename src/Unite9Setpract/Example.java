package Unite9Setpract;

import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        Student s1=new Student("1","zhangshang");
        Student s2=new Student("2","zhangshang");
        Student s3=new Student("2","zhangshang");
        Student s4=new Student("3","zhangshang");
        HashSet<Student> hs=new HashSet<>();
        hs.add(s1);
        hs.add(s3);
        hs.add(s2);
        hs.add(s4);
        Iterator<Student> it=hs.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getId());
        }
        System.out.println("-------------");
        System.out.println(hs);
    }
}

