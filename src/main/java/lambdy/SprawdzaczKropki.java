package lambdy;

public class SprawdzaczKropki implements MyFunctionalInterface<String> {
    @Override
    public boolean sprawdz(String o) {
        return o.endsWith(".");
    }
}
