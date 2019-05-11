package recap.lecture9;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> waitingQueue = new LinkedList<>();
        waitingQueue.add("Kaspar");
        waitingQueue.add("Pavel");
        waitingQueue.add("Vladimir");
        waitingQueue.add("Heidi");

        System.out.println(waitingQueue);

        String name = waitingQueue.remove(); // udaljaet
        System.out.println(name);

        name = waitingQueue.poll(); // posle etogo prosto ne sushestvuet (does not exist)= null. raznica mezdu remove
        System.out.println(name);
        System.out.println(waitingQueue);
    }
}
