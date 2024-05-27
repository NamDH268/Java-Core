import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Cat> cats = new LinkedList<>();

        cats.add(new Cat(3,"A"));
        cats.add(new Cat(7,"P"));
        cats.add(new Cat(5,"E"));
        cats.add(new Cat(1,"H"));

        Comparator<Cat> comparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat c1, Cat c2) {
                return Integer.compare(c1.getId(),c2.getId());
            }
        };
        Collections.sort(cats,comparator);
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }
}
