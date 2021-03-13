public class Point
{
    private float x;
    private float y;
    private String tenToaDo;

    public void setX(float x)
    {
        this.x = x;
    }
    
    public float getX()
    {
        return x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public float getY()
    {
        return y;
    }

    public String getTenToaDo()
    {
        return tenToaDo;
    }

    public Point()
    {
        x = 0.0f;
        y = 0.0f;
        tenToaDo = "Toa Do Goc";
    }

    public Point(float x, float y, String tenToaDo)
    {
       this.x = x;
       this.y = y;
       this.tenToaDo = tenToaDo;
    }

    public String toString()
    {
        return String.format("%s (%.2f, %.2f)", tenToaDo, x, y);
    }

}