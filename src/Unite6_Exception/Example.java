package Unite6_Exception;

public class Example {
    public static void main(String[] args) {
//            int result = divide(4, 0);//ArithmeticException
//            System.out.println(result);
        try {
            int result = divide(4, 0);//ArithmeticException
//            System.out.println(result);

        }catch (ArithmeticException e){
            System.out.println("输入错误");
            e.printStackTrace();
            System.out.println("捕获的错误信息"+e.getMessage());
            return;

        }
        finally {
            System.out.println("finally语句执行");

        }
        System.out.println("程序继续执行");

    }
    public static int divide(int x,int y){
        int result=x/y;
        return result;
    }
}
