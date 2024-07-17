//
//package Unite13多线程状态;
//public class Example1  {
//    public static void main(String[] args ) throws InterruptedException{
//        Thread t1=new Yield("线程A");
//        Thread t2=new Yield("线程B");
//        t1.start();
//        t2.start();
//
//
//    }
//}
//class Yield extends Thread{
//    public void run(){
//        for (int i=1;i<=10;i++){
//            if(i==3){
//                try{
//                    Thread.sleep(2000);
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
////                finally {
////                    System.out.println("SleepThread正在输出"+i);
////                }
//                System.out.println("SleepThread正在输出"+i);
//            }
//        }
//    }
//}