import java.util.HashSet;

/**
 * Created by Ronni on 26-11-2016.
 */
public class Four {
    public static void main(String[] args)
    {
        HashSet set1 = new HashSet();
        HashIntSet set2 = new HashIntSet();
        set1.add(1);
        set1.add(2);
        set1.add(0);
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println(set2);
        set2.removeAll(set1);
        System.out.println(set2);
    }
}
