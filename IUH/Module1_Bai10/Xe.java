public abstract class Xe 
{
    protected String tenHang;
    protected String loaiXe;
    protected String mauSac;
    protected double giaTien;

    public Xe()
    {
        this.tenHang = "null";
        this.loaiXe = "null";
        this.mauSac = "null";
        this.giaTien = 0.0;
    }

    public Xe(String tenHang, String loaiXe, String mauSac, double giaTien)
    {
        if (!tenHang.trim().equals(""))
        {
            this.tenHang = tenHang;
        }
        else
        {
            this.tenHang = "null";
        }

        if (!loaiXe.trim().equals(""))
        {
            this.loaiXe = loaiXe;
        }
        else
        {
            this.loaiXe = "null";
        }

        if (!mauSac.trim().equals(""))
        {
            this.mauSac = mauSac;
        }
        else
        {
            this.mauSac = "null";
        }

        if (giaTien > 0)
        {
            this.giaTien = giaTien;
        }
        else
        {
            this.giaTien = 0.0;
        }
    }

    public String getTenHang()
    {
        return tenHang;
    }

    public String getLoaiXe()
    {
        return loaiXe;
    }

    public String getMauSac()
    {
        return mauSac;
    }

    public double getGiaTien()
    {
        return giaTien;
    }

    public abstract double tienThue();
    public abstract String getInfo();
}