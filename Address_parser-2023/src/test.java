import Model.*;

public class test {

    public static void main(String[] args) throws Exception {
        String s = "Pilemosevej 40 2610 Rødovre";

        Parser parser = new Parser();
        Address address = parser.parse(s);
        address.print();
    }
}
