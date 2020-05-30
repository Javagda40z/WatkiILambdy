import java.util.Map;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Application {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        Singleton singleton = Singleton.getInstance();
//        Singleton singleton1 = Singleton.getInstance();
//
//
//        System.out.println(singleton);
//        System.out.println(singleton1);
//        System.out.println(singleton == singleton1);
//        System.out.println(singleton.equals(singleton1));
//
//
//        Map<String, String> mapaBezpiecznaDlaWatkow = new ConcurrentHashMap<>();


//        Queue<Zadanie> listaZadan = new ArrayBlockingQueue<>(100);

        ExecutorService executorService = Executors.newFixedThreadPool(5);
//        executorService = Executors.newSingleThreadExecutor();
//        executorService = Executors.newCachedThreadPool();
//        ScheduledExecutorService executorService1 = Executors.newScheduledThreadPool(5);

//        executorService.submit(() -> listaZadan.poll().run());

        executorService.submit(new RunnableImpl());
        Future<Integer> przyszlyWynik = executorService.submit(new CallableImpl());

        System.out.println(przyszlyWynik.get());

        System.out.println("Ok koniec");


        int liczba = 0;
        liczba++; // tak na prawde to nie jest pojedyncza operacja pobranie, dodanie, zapisanie
        AtomicInteger liczba2 = new AtomicInteger(0);
        liczba2.incrementAndGet();
        //Lepiej uzyc zmiennej "atomowej" niz synchronized jezeli tego nie potrzebujecie


//        CompletableFuture completableFuture = new CompletableFuture();
//        completableFuture.thenAccept(generujRaport()).thenAccept(zapiszRaport());
        //Ciekawostka - ktorej kiedys mozliwe ze uzyjecie bo jest fajne i nowsze i nieblokujace

//        this.wait();
//        this.notify();
        //Nizszy poziom

    }

    //Runnable nic nie zwraca
    //Callable zwraca future ktory mozna potem pobrac przy pomocy get i blokuje nam watek ktory robi get()


}
