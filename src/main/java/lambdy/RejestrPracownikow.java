package lambdy;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class RejestrPracownikow {

    private List<Pracownik> pracownicy;

    public RejestrPracownikow() {
        pracownicy = new ArrayList<>();
    }

    public void addPracownik(Pracownik pracownik) {
        pracownicy.add(pracownik);
    }

    public List<Pracownik> getPracownicy() {
        return pracownicy;
    }

    public List<Pracownik> znajdzPracownikowWedlugKryteriow(Predicate<Pracownik> filtr) {
        return pracownicy.stream().filter(filtr).collect(Collectors.toList());
    }

    public Optional<Pracownik> znajdzPracownikaWedlugKryteriow(Predicate<Pracownik> filtr) {
        return pracownicy.stream().filter(filtr).findFirst();
    }

    public Optional<Pracownik> znajdzPracownikaWedlugKryteriowZPetla(Predicate<Pracownik> filtr) {
        for (Pracownik pracownik : pracownicy) {
            if (filtr.test(pracownik)) {
                return Optional.of(pracownik);
            }
        }
        return Optional.empty();
    }
}
