package vezbe5;

public abstract class Person {
    private String firstName;
    private String lastName;
    private String jmbg;

    public Person() {}

    public Person(String firstName, String lastName, String jmbg) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.jmbg = jmbg;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

}
