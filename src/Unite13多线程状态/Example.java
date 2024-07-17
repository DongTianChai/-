package Unite13多线程状态;

public class Example {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new SleepThread()).start();
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {

                Thread.sleep(2000);
                System.out.println("主线程正在输出" + i);
            }
            Thread.sleep(500);
            System.out.println("主线程正在输出" + i);
        }
    }
}

class SleepThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
//                finally {
//                    System.out.println("SleepThread正在输出"+i);
//                }
                System.out.println("SleepThread正在输出" + i);
//            }
//
            System.out.println("SleepThread正在输出"+i);
            }
//            System.out.println("SleepThread正在输出" + i);
        }
    }
}