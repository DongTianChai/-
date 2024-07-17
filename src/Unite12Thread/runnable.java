package Unite12Thread;

public class runnable {
    public static void main(String[] args) {
        myRunnable myRunnable=new myRunnable();
        Thread t1=new Thread(myRunnable,"高");
        Thread t2=new Thread(myRunnable,"飞");
        t1.start();
        t2.start();

    }
}
class myRunnable implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}