//package Unite12Thread;
//
//public class Example6 {
//    public static void main(String[] args) {
//        TW tw = new TW();
//        new Thread(tw, "窗口1").start();
//        new Thread(tw, "窗口2").start();
//        new Thread(tw, "窗口3").start();
//        new Thread(tw, "窗口4").start();
//    }
//}
//
//class TW implements Runnable {
//    private int tickets = 100;
//    Object lock = new Object();
//
//    public void run() {
//        while (true) {
////            synchronized (lock){//定义同步代码块
//////                try {
////                    Thread.sleep(10);
////                }catch (InterruptedException e){
////                    e.printStackTrace();
////                }
////            }
////            if(tickets>0){
////
////                Thread th=Thread.currentThread();//获取当前线程
////                String th_name=th.getName();//获取当前名字
////                System.out.println(th_name+"正在买票"+tickets--+"张票");
////            }else break;
//            sakeTicket();
//            if (tickets<0)break;
//        }
//    }
//
//    private synchronized void sakeTicket() {
//        try {
//            Thread.sleep(10);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//        if(true){
//
//        Thread th = Thread.currentThread();//获取当前线程
//        String th_name = th.getName();//获取当前名字
//        System.out.println(th_name + "正在买票" + tickets-- + "张票");
//    }
//}
