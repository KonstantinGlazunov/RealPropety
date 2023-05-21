import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        /* Класс RealPropety является родительским по отношению к классу земельный участок (Land), лесной массив(Forest),
дом(House), квартира(Apartment), гараж(Garage).
Назначение земли зафиксировано в Enum Purpose.
 Метод GetPropertyTax()  реализован в родительском RealPropety  и переропределен в каждом из дочерних в зависимости от специфики недвижимости.
 Сортировки производятся с использованием соответствующих компараторов
Для наглядности сортировки по адресу сделан метод printSortedByAdresse
 */

        Land land1 = new Land(123456, 50000, new Person("Karl Scmidt"), 20, Purpose.FARMLAND);

        Forest forest1 = new Forest(123457, 30000, new Person("Maria Scmidt"), 200, true);

        ArrayList<Person> residents1 = new ArrayList<>(List.of(new Person("Li"), new Person("Gombel"), new Person("Becht"))); //массив Person1
        Hause haus1 = new Hause(123454, 150000, new Person("Li"), new Adress("Lindenstrasse", 16), 170, residents1, 3);
        Hause haus2 = new Hause(133455, 170000, new Person("Li"), new Adress("Lindenstrasse", 17), 170, residents1, 3);

        ArrayList<Person> residents2 = new ArrayList<>(List.of(new Person("Chang PO"), new Person("Krisitian"), new Person("Daniel"))); //массив Person2
        Apartament apartament1 = new Apartament(123452, 250000, new Person("Chang"), new Adress("Braunfels Strasse", 17, 1), 150, residents2, 3);
        Apartament apartament2 = new Apartament(127452, 250002, new Person("Chang"), new Adress("Braunfels Strasse", 45, 15), 150, residents2, 3);
        Apartament apartament3 = new Apartament(128452, 250004, new Person("Chang"), new Adress("Braunfels Strasse", 17, 2), 150, residents2, 3);

        Garage garage1 = new Garage(123654, 15000, new Adress("Berliner str", 570), new Person("Hans"), 60, 2);

        ArrayList<RealProperty> realProperties = new ArrayList<>(List.of(land1, forest1, apartament1, garage1, haus1, haus2, apartament2, apartament3)); // массив объектов  realProperties

        realProperties.sort(new PriceComparator()); //сортировка по прайсу

        realProperties.sort(new TaxComparator()); //сортировка по налогу

        realProperties.sort(new AreaComparator()); //сортировка по площади

        realProperties.sort(new AdressComparator()); //сортировка по адресу

// меню сортировки


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       String answer = "5";
        while (!answer.equalsIgnoreCase("0")){

            switch (answer) {
                case "1":
                    realProperties.sort(new PriceComparator()); //сортировка по прайсу
                    System.out.println(realProperties);
                    System.out.println("for one more enter nummer 1-4 or 0");
                    break;
                case "2":
                    realProperties.sort(new TaxComparator());  //сортировка по налогу
                    System.out.println(realProperties);
                    System.out.println("for one more enter nummer 1-4 or 0");
                    break;
                case "3":
                    realProperties.sort(new AreaComparator()); //сортировка по площадиSystem.out.println(realProperties);
                    System.out.println(realProperties);
                    System.out.println("for one more enter nummer 1-4 or 0");
                    break;
                case "4":
                    realProperties.sort(new AdressComparator()); //сортировка по адресу
                    System.out.println(realProperties);
                    System.out.println("for one more enter nummer 1-4 or 0");
                    break;
                case "0":
                    break;

                default:
                    System.out.println("");
                    System.out.println("Enter number of sorting type: ");
                    System.out.println("1 by price \n" +
                            "2 by tax \n" +
                            "3 by area \n" +
                            "4 by address \n" +
                            "0 for exit");

            }

            answer = reader.readLine();
        }
    }


    public static void printSortedByAdresse(ArrayList<RealProperty> list) { //метод вывода для наглядности сортировки по адресу
        list.sort(new AdressComparator());
        for (RealProperty object : list) {
            if (object.getAdress() == null) {
                System.out.println(object.getClass() + " has no address");
            } else
                System.out.println(object.getClass() + " " + object.getAdress().getStreet() + " " + object.getAdress().getNumberOfHaus() + " " + object.getAdress().getNumberOfApartment());
        }
    }


}
