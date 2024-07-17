package 生产者消费者;

public class Producer implements Runnable {
    private Box b;
    @Override
    public void run() {
        for(int i=1;i<5;i++){
            b.put(i);
        }

    }

    public Producer(Box b) {
        this.b=b;
    }
}
