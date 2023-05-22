public class Forest extends RealProperty{
    private boolean isProtectedZone;

    public Forest(int cadastralNumber, double price, Person owner, double area, boolean isProtectedZone) {
        super(cadastralNumber, price, owner,  area);
    this.isProtectedZone = isProtectedZone;

    }

    public boolean isProtectedZone() {
        return isProtectedZone;
    }

    @Override
    public String toString() {
        return "Forest " +
                " isProtectedZone=" + isProtectedZone
                + " " +
                super.toString();
    }

    @Override
    public double getPropertyTax() {   //переропределение налога в зависимости от статуса охраны
        if (isProtectedZone) {
            return getPrice() * 0.5;
        }
        return super.getPropertyTax();

    }
}
