package lambdy;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Lambdy {

    public static void main(String[] args) {

        String imie = "Mateusz.";

//        wypiszJezeliSprawdzenieOK(imie, new SprawdzaczKropki());

        MyFunctionalInterface<String> lambda = (String przetwarzaneImie) -> {
            return przetwarzaneImie.endsWith(".");
        };

        MyFunctionalInterface<String> lambda2 = (przetwarzaneImie) -> {
            //
            //
            //
            return przetwarzaneImie.endsWith(".");
        };

        MyFunctionalInterface<String> lambda3 = przetwarzaneImie -> przetwarzaneImie.endsWith(".");

//        wypiszJezeliSprawdzenieOK(imie, lambda);

        wypiszJezeliSprawdzenieOK(imie, s -> s.endsWith("."));


    }


    public static void wypiszJezeliSprawdzenieOK(String napis, Predicate<String> sprawdzacz) {

        if (sprawdzacz.test(napis)) {
            System.out.println(napis);
        } else {
            System.out.println("Wynik sprawdzenia niepoprawny.");
        }

    }
}
