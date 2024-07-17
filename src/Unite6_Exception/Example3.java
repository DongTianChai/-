package Unite6_Exception;

public class Example3 {
    public static void main(String[] args) {
//            int result = divide(4, 0);//ArithmeticException
//            System.out.println(result);
        try {
            int result = divide(4, -2);//ArithmeticException
//            System.out.println(result);

        }catch (DivideByMinusException e){
            System.out.println(e.getMessage());
        }


    }

    public static int divide(int x, int y) throws DivideByMinusException {
        if(y<0)
        {
            throw new DivideByMinusException("除数是负数");
        }
        int result = x / y;
        return result;
    }
}
