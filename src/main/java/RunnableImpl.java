public class RunnableImpl implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // obliczenia
        System.out.println("Dzialanie runnable?");

    }
}
