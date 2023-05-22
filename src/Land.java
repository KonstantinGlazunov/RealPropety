public class Land extends RealProperty {

    /*Земля имеет такой атрибут как назначение (String purpose):

земли сельскохозяйственного назначения;
земли населенных пунктов;
земли промышленности;*/

    private Purpose purpose;

    public Land(int cadastralNumber, double price, Person owner, double area, Purpose purpose) {
        super(cadastralNumber, price, owner, area);
        this.purpose = purpose;
    }

    public Purpose getPurpose() {
        return purpose;
    }

    @Override
    public String toString() {
         return  "Land " +
                " purpose=" + purpose
                 +
                 super.toString();
    }

    @Override
    public double getPropertyTax() {   //переропределение налога в зависимости он назначения земли
        switch (purpose){
            case FARMLAND -> {
                return getPrice() * 0.5;
            }
            case COMMUNITULAND ->{
                return getPrice() * 0.15;
            }
            case INDASTRIALLANDS -> {
                return getPrice() * 0.2;
            }
            default -> {
                return super.getPropertyTax();  // а без default нельзя?  ???????????????????
            }
        }

    }
}
