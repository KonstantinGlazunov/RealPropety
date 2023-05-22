public class Garage extends RealProperty {

    private int numberOfParkingSpaces;

    public Garage(int cadastralNumber, double price, Adress adress, Person owner, double area, int numberOfParkingSpaces) {
        super(cadastralNumber, price, owner, adress, area);
        this.numberOfParkingSpaces = numberOfParkingSpaces;
    }

    public int getNumberOfParkingSpaces() {
        return numberOfParkingSpaces;
    }

    @Override
    public String toString() {
        return "Garage " +  getAdress() +
                        " numberOfParkingSpaces=" +
                numberOfParkingSpaces +
                        super.toString();
    }

    @Override
    public double getPropertyTax() { ////переропределение налога в зависимости колличества машиномест
        return super.getPropertyTax() + numberOfParkingSpaces / 100;
    }
}
