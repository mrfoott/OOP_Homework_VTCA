public class Point
{
    private String name;
    private float x;
    private float y;

    public Point()
    {
        x = 0.0f;
        y = 0.0f;
        name = "Toa do goc";
    }

    public Point(float x, float y, String name)
    {
        this.x = x;
        this.y = y;

        if (!name.trim().equals(""))
        {
            this.name = name;
        }
        else
        {
            this.name = "null";
        }
    }

    public void setX(float x)
    {
        this.x = x;
    }

    public void setY(float y)
    {
        this.y = y;
    }

    public void setName(String name)
    {
        if (!name.trim().equals(""))
        {
            this.name = name;
        }
        else
        {
            this.name = "null";
        }
    }

    public float getX()
    {
        return x;
    }

    public float getY()
    {
        return y;
    }

    public String getName()
    {
        return name;
    }

    public String toString()
    {
        return name + "(" + x + ", " + y + ")";
    }
}