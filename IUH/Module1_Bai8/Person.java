public abstract class Person
{
    protected String hoTen;
    protected String diaChi;

    public Person()
    {
        this.hoTen = "null";
        this.diaChi = "null";
    }

    public Person(String hoTen, String diaChi)
    {
        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (!diaChi.trim().equals(""))
        {
            this.diaChi = diaChi;
        }
        else
        {
            this.diaChi = "null";
        }
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public String getInfo()
    {
        return hoTen + ", " + diaChi;
    }

    public abstract String danhGia();
}