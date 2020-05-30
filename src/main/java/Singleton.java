public class Singleton {

    private volatile static Singleton instance;

    private Object bezroznicy = new Object();
    private Object bezroznicy2 = new Object();

    public void metoda() {

        synchronized (bezroznicy) {


        }

    }

    public void metoda2() {

        synchronized (bezroznicy2) {


        }

    }

    private Singleton() {

    }

//    public static Singleton getInstance() {
//        if (instance == null) {
//            synchronized (Singleton.class) {
//                if (instance == null) {
//                    instance = new Singleton();
//                }
//            }
//        }
//        return instance;
//    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public synchronized void doSth() {

    }

    public void doSth1() {

        synchronized (this) {


        }

    }


    public synchronized static void doSth2() {
        //
        //
        //
        //

    }

    public static void doSth3() {

        synchronized (Singleton.class) {
            //
            //
            //
            //
        }

    }


}
