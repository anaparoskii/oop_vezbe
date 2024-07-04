package examPractice;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String add(String txt) {
        return this.name + txt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
