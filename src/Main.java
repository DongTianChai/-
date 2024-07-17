import java.util.ArrayList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ArrayList<car> a=new ArrayList<>();
        a.add(new car("aa"));
        a.add(new car("bb"));
        a.add(new car("vv"));
        System.out.println(a.toString());
        a.get(1).setS("sd");
        System.out.println(a.toString());
    }

}
class car{
    private String s;

    @Override
    public String toString() {
        return "car{" +
                "s='" + s + '\'' +
                '}';
    }

    public car(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
class Mythread  {
    private ArrayList<String> a=new ArrayList<>();

    public Mythread(ArrayList<String> a) {
        this.a = a;
    }
    public void run(){
        a.add("ss");

    }
}
