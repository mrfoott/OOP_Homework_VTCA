import java.util.TreeSet;

public class Main
{
    private static TreeSet<Integer> a = new TreeSet<>();
    private static TreeSet<Integer> b = new TreeSet<>();

    private static TreeSet<Integer> addAll(TreeSet<Integer> a, TreeSet<Integer> b)
    {
        TreeSet<Integer> result = (TreeSet<Integer>) a.clone();

        for (int x : b)
            result.add(x);

        return result;
    }

    public static TreeSet<Integer> removeAll(TreeSet<Integer> a, TreeSet<Integer> b)
    {
        TreeSet<Integer> result = new TreeSet<Integer>();

        for (int x : a)
        {
            if (!b.contains(x))
            {
                result.add(x);
            }
        }
        return result;
    }

    public static TreeSet<Integer> retainAll(TreeSet<Integer> a, TreeSet<Integer> b)
    {
        TreeSet<Integer> result = new TreeSet<Integer>();

        for (int x : a)
        {
            if (b.contains(x))
            {
                result.add(x);
            }
        }
        return result;
    }

    public static void main(String[] args) 
    {
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);

        TreeSet<Integer> ketQuaHop = addAll(a, b);
        for (int x : ketQuaHop)
            System.out.print(x + " ");
        System.out.println();

        TreeSet<Integer> ketQuaHieu = removeAll(a, b);
        for (int x : ketQuaHieu)
            System.out.print(x + " ");
        System.out.println();

        TreeSet<Integer> ketQuaGiao = retainAll(a, b);
        for (int x : ketQuaGiao)
            System.out.print(x + " ");
        System.out.println();
    }
}