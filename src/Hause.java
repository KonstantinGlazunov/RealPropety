import java.util.ArrayList;

public class Hause extends RealProperty {

    private ArrayList residents;
    private int florNumber;



    public Hause(int cadastralNumber, double price, Person owner, Adress adress, double area, ArrayList residents,int florNumber ) {
        super(cadastralNumber, price, owner, adress, area);
        this.residents = residents;
        this.florNumber = florNumber;

    }

    public ArrayList getResidents() {
        return residents;
    }



    public int getFlorNumber() {
        return florNumber;
    }

    @Override
    public String toString() {
        return "Hause "  +
                  getAdress() +
                " residents=" + residents +
                ", florNumber=" + florNumber
                +
                super.toString();
    }

    @Override  ////переропределение налога в зависимости колличества этажей
    public double getPropertyTax() {
        return super.getPropertyTax() + florNumber/100;
    }



}
