//package Unite12Thread;
//
//public class Example {
//    public static void main(String[] args) {
//        new TW().start();
//        new TW().start();
//        new TW().start();
//        new TW().start();
//    }
//}
//class TW extends Thread{
//    private  static int tickets=10;
//    public void run(){
//        while (true){
//            if(tickets>0){
//                Thread th=Thread.currentThread();//获取当前线程
//                String th_name=th.getName();//获取当前名字
//                System.out.println(th_name+"正在买票"+tickets--+"张票");
//            }
//        }
//    }
//}