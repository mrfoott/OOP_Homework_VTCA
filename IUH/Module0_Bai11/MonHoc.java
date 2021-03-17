public class MonHoc 
{
    private String tenMonHoc;
    private double diemMonHoc;
    
    public MonHoc()
    {
        tenMonHoc = "null";
        diemMonHoc = 0.0;
    }

    public MonHoc(String tenMonHoc, double diemMonHoc)
    {
        if (!tenMonHoc.trim().equals(""))
        {
            this.tenMonHoc = tenMonHoc;
        }
        else
        {
            this.tenMonHoc = "null";
        }

        if (diemMonHoc >= 0.0 && diemMonHoc <= 10.0)
        {
            this.diemMonHoc = diemMonHoc;
        }
        else
        {
            this.diemMonHoc = 0.0;
        }
    }

    public String getTenMonHoc()
    {
        return tenMonHoc;
    }

    public double getDiemMonHoc()
    {
        return diemMonHoc;
    }
}
