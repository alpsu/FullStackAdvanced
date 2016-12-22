package by.intexsoft.lesson02.block;

public class InitializationTest {
    String name = "Bob";

    {
        System.out.println("In the initialization block");
        System.out.println(name);
        name = "Sasha";
        System.out.println(name);
        System.out.println("After initialization block");
    }

    InitializationTest(String name){
        this.name = name;
        System.out.println("In the constructor");
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        InitializationTest test = new InitializationTest("Alex");
        System.out.println("in the main()");
        System.out.println(test.getName());
    }
}
