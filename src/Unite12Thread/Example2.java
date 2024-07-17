package Unite12Thread;

public class Example2 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        while (true){
            System.out.println("Main方法在运行");
        }
    }
}
class MyThread extends Thread{
@Override
    public void run(){
        while (true){
            System.out.println("MyThread的run（）方法在运行");
        }
    }
}
