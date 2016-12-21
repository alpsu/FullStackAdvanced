package by.intexsoft.lesson02.pack20;


public class Student26 {
    private static final String DEFAULT = "Default";
    private static final byte DEFAULT_AGE = 19;

    private String lastName;
    private String firstName;
    private byte age;

    public Student26(String lastName, String firstName, byte age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public Student26(String lastName, String firstName) {
        this(lastName, firstName, DEFAULT_AGE);
    }

    public Student26(String lastName) {
        this(lastName, DEFAULT, DEFAULT_AGE);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public Student26(){
        lastName = DEFAULT;
        firstName = DEFAULT;
        age = DEFAULT_AGE;
    }

    @Override
    public String toString() {
        return Student26.class.getSimpleName() + " " + lastName + " " + firstName + " is " + age + ".";
    }
}
