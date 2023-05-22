import java.util.Comparator;

/*Порядок сортировки по убыванию:
без адреса,
с адресом,
улица,
номер дома,
без квартир,
по номеру квартиры
 */

public class AdressComparator implements Comparator<RealProperty> {
    @Override
    public int compare(RealProperty o1, RealProperty o2) {

        if ((o1.getAdress() == null) && (o2.getAdress() == null)) {  // если адресов нет то равны
            return 0;
        }
        if ((o1.getAdress() != null) && (o2.getAdress() == null)) { //без адреса идут впереди, тех что адресами
            return 1;
        }
        if ((o1.getAdress() == null) && (o2.getAdress() != null)) {
            return -1;
        } // адреса есть у обоих, нужно их сравнить:

        if (o1.getAdress().getStreet().equals(o2.getAdress().getStreet())) {   //если улицы равны, проверяем номера домов
            if (o1.getAdress().getNumberOfHaus() == o2.getAdress().getNumberOfHaus()) {//если номера домов равны, проверяем номера квартир

                if ((o1.getAdress().getNumberOfApartment() == 0) && (o2.getAdress().getNumberOfApartment() == 0)) {  // если квартир нет то равны
                    return 0;
                }
                if ((o1.getAdress().getNumberOfApartment() != 0) && (o2.getAdress().getNumberOfApartment() == 0)) { //без квартирные дома идут впереди, тех что с квартирами
                    return 1;
                }
                if ((o1.getAdress().getNumberOfApartment() == 0) && (o2.getAdress().getNumberOfApartment() != 0)) {
                    return -1;
                }
            } else {
                return Integer.compare(o1.getAdress().getNumberOfApartment(), o2.getAdress().getNumberOfApartment()); //сравниваем номера домов
            }
        }
            return o1.getAdress().getStreet().compareTo(o2.getAdress().getStreet());  // сравнение по улице
        }


    }



