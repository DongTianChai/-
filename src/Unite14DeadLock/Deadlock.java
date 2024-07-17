package Unite14DeadLock;

import java.util.concurrent.locks.Lock;

public class Deadlock {


    public static void main(String[] args) {

        Thread t1=new Thread(new MyThread(),"a");
        Thread t2= new Thread(new MyThread(),"b");

        t1.start();
        t2.start();
    }
}
class MyThread extends Thread{
      static Object a=new Object();
      static Object b=new Object();
    @Override
    public void run(){

       while (true) {
           if ("a".equals(currentThread().getName())) {
               synchronized (a) {
                   System.out.println("锁1申请锁2");
                   try {
                       Thread.sleep(1000);
                   }catch (InterruptedException e){
                       e.printStackTrace();
                   }

               synchronized (b) {
                   System.out.println("申请锁2成功线程完毕");
               }
               }
           } else if ("b".equals(currentThread().getName())) {
               synchronized (b) {
                   System.out.println("锁2申请锁1");
                   try {
                       Thread.sleep(3000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }

                   synchronized (a) {
                       System.out.println("申请锁1成功线程完毕");

                   }
               }
           }
       }
    }
}