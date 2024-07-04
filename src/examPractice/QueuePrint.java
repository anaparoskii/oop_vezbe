package examPractice;

public class QueuePrint {

    public static void main(String[] args) {
        String[] queue1 = {"A", "B", "C", "D", "E"};
        print(queue1);
        int[] queue2 = {1, 2, 3, 4, 5};
        print(queue2);
        double[] queue3 = {1.1, 2.2, 3.3, 4.4, 5.5};
        print(queue3);
    }

    public static void print(Object[] queue) {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(i + " " + queue[i]);
        }
    }

    public static void print(int[] queue) {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(i + " " + queue[i]);
        }
    }

    public static void print(double[] queue) {
        for (int i = 0; i < queue.length; i++) {
            System.out.println(i + " " + queue[i]);
        }
    }
}
