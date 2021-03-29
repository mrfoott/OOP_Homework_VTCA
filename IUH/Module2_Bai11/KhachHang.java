import java.text.DecimalFormat;

public class KhachHang
{
    private String soCMND;
    private String hoTen;
    private String gaDen;
    private double giaTien;

    public KhachHang()
    {
        this.soCMND = "null";
        this.hoTen = "null";
        this.gaDen = "null";
        this.giaTien = 0.0;
    }

    public KhachHang(String soCMND, String hoTen, String gaDen, double giaTien)
    {
        if (!soCMND.trim().equals(""))
        {
            this.soCMND = soCMND;
        }
        else
        {
            this.soCMND = "null";
        }

        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (!hoTen.trim().equals(""))
        {
            this.gaDen = gaDen;
        }
        else
        {
            this.gaDen = "null";
        }

        if (giaTien > 0.0)
        {
            this.giaTien = giaTien;
        }
        else
        {
            this.giaTien = 0.0;
        }
    }

    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-20s %-25s %20s %20s", soCMND, hoTen, gaDen, df.format(giaTien));
    }

    public String getSoCMND()
    {
        return soCMND;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getGaDen()
    {
        return gaDen;
    }

    public double getGiaTien()
    {
        return giaTien;
    }

    public boolean equals(KhachHang kh)
    {
        if (soCMND.equals(kh.getSoCMND()))
            return true;
        return false;
    }

    public void capNhat(String hoTen, String gaDen, double giaTien)
    {
        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (!hoTen.trim().equals(""))
        {
            this.gaDen = gaDen;
        }
        else
        {
            this.gaDen = "null";
        }

        if (giaTien > 0.0)
        {
            this.giaTien = giaTien;
        }
        else
        {
            this.giaTien = 0.0;
        }
    }
}