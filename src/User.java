public abstract class User {
    private String imie;
    private String nazwisko;
    public User(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    public String getFirstName() {
        return imie;
    }
    public String getLastName() {
        return nazwisko;
    }
}