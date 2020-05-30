import java.util.concurrent.Callable;

public class CallableImpl implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        System.out.println("Dzialanie callable");
        Thread.sleep(5000);
        return 2+2;
    }
}
