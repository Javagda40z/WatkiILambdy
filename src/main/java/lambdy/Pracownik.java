package lambdy;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private int wiek;
    private int zarobki;

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getZarobki() {
        return zarobki;
    }

    public void setZarobki(int zarobki) {
        this.zarobki = zarobki;
    }

    public Pracownik(String imie, String nazwisko, int wiek, int zarobki) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.zarobki = zarobki;
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", zarobki=" + zarobki +
                '}';
    }
}
