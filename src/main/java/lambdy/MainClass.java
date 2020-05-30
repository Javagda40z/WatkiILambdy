package lambdy;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {

    public static void main(String[] args) {
        RejestrPracownikow rejestrPracownikow = new RejestrPracownikow();
//        Pracownik pracownik = new Pracownik("Mateusz", "Kacprzak", 25, 2000000);

//        rejestrPracownikow.addPracownik(new Pracownik("Mateusz", "Kacprzak", 25, 2000000));
        rejestrPracownikow.addPracownik(new Pracownik("Tomasz", "Nowak", 26, 15000));
        rejestrPracownikow.addPracownik(new Pracownik("Kasia", "Powak", 27, 1));
        rejestrPracownikow.addPracownik(new Pracownik("Jozef", "Lowak", 30, 500));
        rejestrPracownikow.addPracownik(new Pracownik("Maryje", "Towak", 35, 9999));

        for (Pracownik pracownik : rejestrPracownikow.getPracownicy()) {
            if (pracownik.getImie().equals("Mateusz")) {
                System.out.println("ZNALEZIONO");
            }
        }

        rejestrPracownikow.getPracownicy().forEach(p -> {
            if (p.getImie().equals("Mateusz")) {
                System.out.println(p.getImie());
            }
        });
        rejestrPracownikow.getPracownicy()
                .stream()
                .filter(p -> p.getImie().equals("Mateusz"))
                .forEach(p -> System.out.println(p.getImie()));


        Optional<Pracownik> mateusz = rejestrPracownikow.getPracownicy()
                .stream()
                .filter(p -> p.getImie().equals("Mateusz"))
                .findFirst();

        Pracownik jakisPracownik = null;
//        jakisPracownik.getImie();

        if(mateusz.isPresent())
        {
            System.out.println("jest present");
            jakisPracownik = mateusz.get();
        }

        if(jakisPracownik==null)
        {
            // cos tam
        }

       Pracownik pracownik = mateusz.orElse(new Pracownik("Mateusz", "", 1, 1));

        System.out.println(pracownik.getImie() + " zarobki " + pracownik.getZarobki());


        List<Pracownik> collect = rejestrPracownikow.getPracownicy()
                .stream()
                .filter(p -> p.getZarobki() > 10000)
                .collect(Collectors.toList());

        rejestrPracownikow.getPracownicy().stream().max(Comparator.comparingInt(Pracownik::getZarobki));
//        rejestrPracownikow.getPracownicy().stream().sorted();

        List<String> collect1 = rejestrPracownikow.getPracownicy().stream().map((Pracownik p) -> {
            return p.getImie();
        }).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> collect2 = rejestrPracownikow.getPracownicy()
                .stream()
                .map(Pracownik::getImie)

                .collect(Collectors.toList());

        rejestrPracownikow.getPracownicy().stream().collect(Collectors.toList());


        System.out.println(collect2);


        Optional<Pracownik> pracownik1 = rejestrPracownikow.znajdzPracownikaWedlugKryteriow(p -> p.getWiek() > 26);
        System.out.println(pracownik1.get());


        System.out.println(rejestrPracownikow.znajdzPracownikowWedlugKryteriow(p -> p.getWiek() > 26));

        System.out.println(rejestrPracownikow.znajdzPracownikowWedlugKryteriow(p -> p.getWiek() > 50));

        Optional<Pracownik> pracownik2 = rejestrPracownikow.znajdzPracownikaWedlugKryteriow(p -> p.getWiek() > 50);
//        System.out.println(pracownik2.get());
        System.out.println(pracownik2.orElse(new Pracownik("", "", 1,1)));



    }

}
