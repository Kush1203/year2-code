import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul"); names.add("Rajat"); names.add("Ram"); names.add("Paul");
        System.out.println("Forward traversal:");
        ListIterator<String> it = names.listIterator();
        while (it.hasNext()) System.out.println(it.next());
        System.out.println("Backward traversal:");
        while (it.hasPrevious()) System.out.println(it.previous());
    }}

