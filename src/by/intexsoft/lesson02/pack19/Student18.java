package by.intexsoft.lesson02.pack19;


public class Student18 {
    private static final String DEFAULT = "Default";
    private static final byte DEFAULT_AGE = 19;

    private String lastName;
    private String firstName;
    private byte age;

    public Student18(String lastName, String firstName, byte age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Student18(){
        lastName = DEFAULT;
        firstName = DEFAULT;
        age = DEFAULT_AGE;
    }

    @Override
    public String toString() {
        return Student18.class.getSimpleName() + " " + lastName + " " + firstName + " is " + age + ".";
    }
}
