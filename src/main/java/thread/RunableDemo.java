package thread;

public class RunableDemo implements Runnable {

    private static Integer index = 0;

    @Override
    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        index++;
        System.out.println(index);
        Thread thread = new Thread(this);
        if (index != 5) {
            thread.start();
        }

    }

    public static void main(String[] args) {
        RunableDemo runableDemo = new RunableDemo();
        Thread thread = new Thread(runableDemo);
        thread.start();
    }

}
