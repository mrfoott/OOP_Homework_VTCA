public class Main 
{
    public static void main(String[] args)
    {
        Triangle Triangle1 = new Triangle(1, 4, 1);
        Triangle Triangle2 = new Triangle(-3, 5, 1);
        Triangle Triangle3 = new Triangle(2, 3, 4);
        Triangle Triangle4 = new Triangle(4, 4, 3);
        Triangle Triangle5 = new Triangle(7, 7, 7);

        System.out.printf("%-10s %-10s %-10s %-20s %10s %10s\n", "CanhA", "CanhB", "CanhC", "Kieu Tam Giac", "CV", "DT");
        System.out.println(Triangle1.toString());
        System.out.println(Triangle2.toString());
        System.out.println(Triangle3.toString());
        System.out.println(Triangle4.toString());
        System.out.println(Triangle5.toString());
    }
}