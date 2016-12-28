package by.intexsoft.lesson02;

import by.intexsoft.lesson02.pack01.Student01;

public class Executor {
    public static void main(String[] args) {
        Student01 std01 = new Student01("Aplevich", "Alex", (byte)36);
        Student01 std02 = new Student01();

        System.out.println(std01);
        System.out.println(std02);
    }
}
