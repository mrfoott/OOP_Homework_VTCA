public class Main 
{
    public static void main(String[] args)
    {
        Point pt = new Point(5, 5, "O");
        Circle circle = new Circle(pt, 10.5);

        System.out.println(circle.toString());
    }    
}
