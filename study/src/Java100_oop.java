class FarmMachine{

    int price;
    int year;
    String color;

    void move() {
        System.out.println(("Farm-machine is moving"));
    }

    void dig() {
        System.out.println("Farm-machine is digging.");
    }

    void grind() {
        System.out.println("Farm-machine is grinding.");
    }

}

public class Java100_oop {
    public static void main(String [] args) {

        FarmMachine fm = new FarmMachine();
        System.out.println(fm);

        fm.price = 1000000;
        fm.year = 2020;
        fm.color = "red";

        String fm_price = String.format("%,d", 1000000);
        System.out.println(fm_price);
        System.out.println(fm.price);

        fm.move();
    }
}
