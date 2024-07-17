package Unite9Setpract;

import java.util.Objects;

public class Student {
    String id;
    String name;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return id+","+name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
//    @Override
//    public int hashCode() {
//        return id.hashCode();
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        boolean result;
//        if (this == obj) {
//            result = true;
//        } else if (obj instanceof Student) {
//            result = false;
//        } else {
//            Student stu = (Student) obj;
//            boolean b = this.id.equals(stu.id);
//            result = b;
//        }
//        return result;
//    }
}
