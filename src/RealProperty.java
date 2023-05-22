public abstract class RealProperty {

    private int cadastralNumber;
    private double price;
    private Person owner;
    private double area;

    private Adress adress;

    public RealProperty(int cadastralNumber, double price, Person owner, Adress adress, double area) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
        this.adress = adress;
    }

    public RealProperty(int cadastralNumber, double price, Person owner, double area) {
        this.cadastralNumber = cadastralNumber;
        this.price = price;
        this.owner = owner;
        this.area = area;
    }

    public int getCadastralNumber() {
        return cadastralNumber;
    }

    public double getPrice() {
        return price;
    }

    public Person getOwner() {
        return owner;
    }

    public double getArea() {
        return area;
    }


    public Adress getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return
                " cadastralNumber=" + cadastralNumber +
                ", price=" + price +
                ", owner=" + owner +
                ", area=" + area +
                ", Tax=" + getPropertyTax() + "\n";

    }

    /*Нужно создать метод, который бы рассчитывал налог на имущество. В общем случае налог на имущество
    рассчитывается в размере 0.1 % рыночной стоимости. (меньше одного процента).
    Вы можете уточнить налог, в зависимости от класса, используя Override.*/
    public double getPropertyTax(){
        return price * 0.1;
    }
}
