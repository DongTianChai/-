package Unite13多线程状态;

public class Join {
    public static void main(String[] args)  {
        joinThread t1=new joinThread();
        t1.setName("康熙");
        Thread t2=new Thread(new joinThread(),"四阿哥");
        Thread t3=new Thread(new joinThread(),"八阿哥");
//        t1.setDaemon(true);
//        t2.setDaemon(true);//设置守护线程
//        t3.setDaemon(true);
        t1.start();




        t2.start();
        t3.start();
        try {
            t1.join();//执行完
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

//        for (int i=0;i<10;i++){
//            System.out.println(Thread.currentThread().getName()+i);
//        }
    }
}
class joinThread extends Thread{
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(currentThread().getName()+":"+i);
        }

    }
}