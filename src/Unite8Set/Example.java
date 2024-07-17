package Unite8Set;

import java.util.HashSet;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        HashSet<Student> hs=new HashSet<>();
        hs.add(new Student("zhangsan",12));
        hs.add(new Student("lisi",12));
        hs.add(new Student("wangwu",12));
        Iterator<Student> it=hs.iterator();
        while (it.hasNext()){
            Student s=it.next();
            System.out.println(s.getName()+","+s.getAge());
        }

    }
}
