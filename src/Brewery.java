public class Brewery {
    public static void main(String[] args) {
        Beer beer1 = new Beer();
        beer1.name = "1 na 100";
        beer1.type = "Pale Ale";
        beer1.voltage = 1;
        beer1.amount = 500;

        Beer beer2 = new Beer();
        beer2.name = "Waszczukowe Polish Pale Ale";
        beer2.type = "Pale Ale";
        beer2.voltage = 4.9;
        beer2.amount = 500;

        System.out.println("Nazwa piwa: " + beer1.name);
        System.out.println("Rodzaj: " + beer1.type);
        System.out.println("Woltaż: " + beer1.voltage);
        System.out.println("Objętość: " + beer1.amount);
        
        System.out.println("Nazwa piwa: " + beer2.name);
        System.out.println("Rodzaj: " + beer2.type);
        System.out.println("Woltaż: " + beer2.voltage);
        System.out.println("Objętość: " + beer2.amount);

    }
}
