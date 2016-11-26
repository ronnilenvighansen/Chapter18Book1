import java.util.HashSet;

/**
 * Created by Ronni on 26-11-2016.
 */
public class Three {
    public static void main(String[] args)
    {
        HashSet set1 = new HashSet();
        HashIntSet set2 = new HashIntSet();
        set2.add(0);
        set1.add(1);
        set1.add(2);
        set2.addAll(set1);
        set1.add(0);
        System.out.println(set2.equals(set1));
    }
}
