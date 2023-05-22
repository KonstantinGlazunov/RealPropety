public class Adress {

    private String street;
    private int numberOfHaus;

    private int numberOfApartment;

    public Adress(String street, int numberOfHaus) {
        this.street = street;
        this.numberOfHaus = numberOfHaus;
    }
    public Adress(String street, int numberOfHaus,int numberOfApartment) {
        this.street = street;
        this.numberOfHaus = numberOfHaus;
        this.numberOfApartment = numberOfApartment;
    }

    public String getStreet() {
        return street;
    }

    public int getNumberOfHaus() {
        return numberOfHaus;
    }

    public int getNumberOfApartment() {
        return  numberOfApartment;
    }

    @Override
    public String toString() {
        return " " + street  +
                ", Haus=" + numberOfHaus +
                ", Apartment=" + numberOfApartment;

    }
}
