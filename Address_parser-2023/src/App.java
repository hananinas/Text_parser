import Model.*;

public class App {
    String s = "Pilemosevej 40, 2610 Rødovre";

    public static void main(String[] args) throws Exception {
        Address address = new Address("Pilemosevej", 40, 2610, "Rødovre");
        address.print();
    }
}
