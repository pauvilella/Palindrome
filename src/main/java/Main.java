import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    static boolean checkPalindrome1(LinkedList<Character> list) {
        Iterator it = list.descendingIterator();
        Iterator it2 = list.iterator();
        while(it.hasNext()) {
            if(!it.next().equals(it2.next())) {
                return false;
            }
        }

        return true;
    }
    static boolean checkPalindrome2(LinkedList<Character> list) {
        LinkedList<Character> aux = new LinkedList<>();
        Iterator it = list.iterator();
        while(it.hasNext()) {
            aux.addFirst((Character) it.next());
        }
        it = list.iterator();
        Iterator it2 = aux.iterator();
        while(it.hasNext()) {
            if(!it.next().equals(it2.next())) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList<Character> list = new LinkedList<>();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('f');
        list.add('c');
        list.add('b');
        list.add('a');
        System.out.println(checkPalindrome1(list));
        System.out.println(checkPalindrome2(list));
    }
}
