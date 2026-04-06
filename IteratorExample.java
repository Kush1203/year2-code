import java.util.ArrayList;
import java.util.Iterator;
public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) al.add(i);
        Iterator<Integer> it = al.iterator();
        while (it.hasNext()) {
            Integer i = it.next();
            System.out.print(i + " ");
            if (i % 2 == 0) it.remove();
        }
        System.out.println("\nAfter removals: " + al);
    }}

