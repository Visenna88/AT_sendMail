public class Start {
    public static void main(String[] args) {
        Phone samsung = new Phone(1234, 0.25, "7A");

        Phone xiaomi = new Phone(2345, 0.3, "N3N4");

        Phone nokia = new Phone(3456, 0.275, "N3N4");

        System.out.println("\n" + "Samsung: ");
        samsung.modelData();
        samsung.receiveCall( "Olha");
        samsung.getNumber();

        System.out.println("\n" + "Xiaomi: ");
        xiaomi.modelData();
        xiaomi.receiveCall( "Yulia");
        xiaomi.getNumber();

        System.out.println("\n" + "Nokia: ");
        nokia.modelData();
        nokia.receiveCall( "Tania");
        nokia.getNumber();
    }
}
