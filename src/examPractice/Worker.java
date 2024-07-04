package examPractice;

public class Worker extends Person {

    private String name;

    public Worker(String name) {
        super(name);
        this.name = name;
    }

    @Override
    public String add(String txt) {
        return txt + this.name;
    }

    public String add2(String txt) {
        this.name = super.add(txt);
        return add(txt);
    }
}
