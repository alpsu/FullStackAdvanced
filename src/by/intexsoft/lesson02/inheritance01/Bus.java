package by.intexsoft.lesson02.inheritance01;

public class Bus extends Vehicle {

    protected String value = "Bus";

    public static void main(String[] args) {
        Vehicle wehicle = new Vehicle("Wehicle");
        Vehicle bus = new Bus("Bus");
        System.out.println(wehicle.value);
        System.out.println(bus.value);
    }

    @Override
    protected void printProtected() {
        System.out.println("I protected my parent " + value);
    }

    Bus(String s) {
        super(s);
        printProtected();
    }
}
