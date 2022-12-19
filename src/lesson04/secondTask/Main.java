//Задание 2. Реализуйте очередь с помощью LinkedList со следующими методами:
//        - enqueue() - помещает элемент в конец очереди,
//        - dequeue() - возвращает первый элемент из очереди и удаляет его,
//        - first() - возвращает первый элемент из очереди, не удаляя.

package lesson04.secondTask;
import java.util.LinkedList;
public class Main {
    private LinkedList elements = new LinkedList();

    public Main () {
    }

    public Main (LinkedList elements) {
        this.elements = elements;
    }

    public void enqueue(Object element) {
        elements.add(element);
    }

    public Object dequeue() {
        Object first = elements.getFirst();
        elements.removeFirst();
        return first;
    }

    public Object first() {
        return elements.getFirst();
    }

    public LinkedList getElements() {
        return elements;
    }

    public void setElements(LinkedList elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        Main queue = new Main ();
        queue.enqueue(1);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(5);
        System.out.println(queue.getElements());
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());
        System.out.println(queue.first());
    }
}

