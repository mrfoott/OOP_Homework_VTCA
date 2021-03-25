public class Main
{
    public static void main(String[] args)
    {
        Drawing dw = new Drawing();
        dw.drawShape(new Circle());
        dw.drawShape(new Quad());
        dw.drawShape(new Triangle());
        dw.drawShape(new Polygon());
        dw.drawShape(new Rectangle());
    }
}