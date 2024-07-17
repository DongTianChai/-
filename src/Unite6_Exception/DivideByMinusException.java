package Unite6_Exception;

public class DivideByMinusException extends Exception{
    public DivideByMinusException(){
        super();
    }
    public DivideByMinusException(String message){
        //调用父类有参构造方法
        super(message);
    }

}
