package Unite5_Outer_and_Inner;

//成员内部类
public class Outer {
    private int num = 10;

    public class Inner {
        public void show() {
            System.out.println(num);
        }
    }
}

