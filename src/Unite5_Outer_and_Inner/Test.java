package Unite5_Outer_and_Inner;

public class Test {
    public static void main(String[] args) {
        Outer.Inner oi=new Outer().new Inner();
        oi.show();
    }
}
