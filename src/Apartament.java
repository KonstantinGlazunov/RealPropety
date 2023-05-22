import java.util.ArrayList;

public class Apartament extends RealProperty {

    private ArrayList residents;
    private int roomsNumber;
    private Adress adress;

    public Apartament(int cadastralNumber, double price, Person owner,Adress adress, double area, ArrayList residents, int florNumber ) {
        super(cadastralNumber, price, owner, adress, area);
        this.residents = residents;
        this.roomsNumber = florNumber;
        this.adress = adress;
    }

    public ArrayList getResidents() {
        return residents;
    }

    public int getRoomsNumber() {
        return roomsNumber;
    }



    @Override
    public String toString() {
        return "Apartament " +
                getAdress() +
                " residents=" + residents +
                ", roomsNumber=" + roomsNumber +
                "} " + super.toString();
    }

    @Override
    public double getPropertyTax() { ////переропределение налога в зависимости от колличества комнат
        return super.getPropertyTax() + roomsNumber/100;
    }

}

