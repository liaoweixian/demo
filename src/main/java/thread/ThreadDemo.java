package thread;

public class ThreadDemo extends Thread {

    private static final Integer i = 1;

    private static Integer index =0;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            index++;
            System.out.println(index);
            Thread thread = new Thread(this);
            if (index != 5)
            {
                thread.start();
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        Thread thread = new Thread(threadDemo);
        thread.isDaemon();
        thread.start();
    }
}
