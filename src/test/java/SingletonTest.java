import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {


    @Test
    public void test() throws InterruptedException {
        int threads = 100;
        Set<Singleton> singletons = Collections.newSetFromMap(new ConcurrentHashMap<>());
        ExecutorService executorService = Executors.newFixedThreadPool(threads);

        for(int i = 0 ; i < threads; i++){
            executorService.execute(() ->
            {
                Singleton singleton = Singleton.getInstance();
                singletons.add(singleton);
                System.out.println(Thread.currentThread() + " " + singleton);

            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);

        assertEquals(1, singletons.size());


    }


}
