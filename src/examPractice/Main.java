package examPractice;

public class Main {

        public static void main(String[] args) {
            Worker worker = new Worker("Ivan");
            System.out.println(worker.add(" is a worker "));
            System.out.println(worker.add2(" is a worker "));
            Person person = new Person("Peter");
            System.out.println(person.add(" is a person "));
        }
}
