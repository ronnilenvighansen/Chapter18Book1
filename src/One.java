import java.util.HashSet;

/**
 * Created by Ronni on 14-10-2016.
 */
public class One
{
    public static void main(String[] args)
    {
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        HashIntSet set2 = new HashIntSet();
        set2.addAll(set1);
        System.out.println(set2);
    }
}
