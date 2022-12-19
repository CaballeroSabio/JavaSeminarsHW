//Задание 1. Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

package lesson04.firstTask;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println(ll);
        System.out.println(revert(ll));
    }

    private static LinkedList<Integer> revert(LinkedList<Integer> ll) {
        for (int i = 1; i < ll.size(); i++) {
            ll.addFirst(ll.remove(i));
        }
        return ll;
    }
}
