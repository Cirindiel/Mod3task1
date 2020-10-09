public class Brewery {
    public static void main(String[] args) {
        Beer beer1 = new Beer("1 na 100", "Pale Ale", 1, 500);
        Beer beer2 = new Beer("Waszczukowe Polish Pale Ale", "Pale Ale", 4.9, 500);

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
