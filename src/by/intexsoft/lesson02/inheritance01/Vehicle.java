package by.intexsoft.lesson02.inheritance01;

import by.intexsoft.lesson02.exp.CustomException;

public class Wehicle {

    protected String value = "Wehicle";

    private Wehicle() {

    }

    public Wehicle(String s) {

    }

    public void printPublic() {
        System.out.println("I am public method");
    }

    protected void printProtected() {
        System.out.println("I am protected method " + value);
        throw new CustomException();
    }

    private void printPrivate() {
        System.out.println("I am private method");
    }

    void printDefault() {
        System.out.println("I am default method");
    }
}
