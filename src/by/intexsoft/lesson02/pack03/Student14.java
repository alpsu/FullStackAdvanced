package by.intexsoft.lesson02.pack03;


public class Student14 {
    private static final String DEFAULT = "Default";
    private static final byte DEFAULT_AGE = 19;

    private String lastName;
    private String firstName;
    private byte age;

    public Student14(String lastName, String firstName, byte age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Student14(){
        lastName = DEFAULT;
        firstName = DEFAULT;
        age = DEFAULT_AGE;
    }

    @Override
    public String toString() {
        return Student14.class.getSimpleName() + " " + lastName + " " + firstName + " is " + age + ".";
    }
}
