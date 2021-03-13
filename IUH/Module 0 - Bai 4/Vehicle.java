public class Vehicle
{
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public Vehicle()
    {
        tenChuXe = "null";
        loaiXe = "null";
        dungTich = 0;
        triGia = 0.0f;
    }

    public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia)
    {
        if (tenChuXe.equals(""))
        {
            this.tenChuXe = "null";
        }
        else
        {
            this.tenChuXe = tenChuXe;
        }

        if (loaiXe.equals(""))
        {
            this.loaiXe = "null";
        }
        else
        {
            this.loaiXe = loaiXe;
        }

        if (dungTich < 0)
        {
            this.dungTich = 0;
        }
        else
        {
            this.dungTich = dungTich;
        }

        if (triGia < 0)
        {
            this.triGia = 0;
        }
        else
        {
            this.triGia = triGia;
        }
    }

    public void setTenChuXe(String tenChuXe)
    {
        if (!tenChuXe.equals(""))
        {
            this.tenChuXe = tenChuXe;
        }
    }
    
    public void setLoaiXe(String loaiXe)
    {
        if (!loaiXe.equals(""))
        {
            this.loaiXe = loaiXe;
        }  
    }

    public void setDungTich(int dungTich)
    {
        if (dungTich > 0)
        {
            this.dungTich = dungTich;
        }
    }

    public void setTriGia(float triGia)
    {
        if (triGia > 0)
        {
            this.triGia = triGia;
        }
    }

    public String getTenChuXe()
    {
        return tenChuXe;
    }

    public String getLoaiXe()
    {
        return loaiXe;
    }

    public int getDungTich()
    {
        return dungTich;
    }

    public double getTriGia()
    {
        return triGia;
    }

    public double tinhThue()
    {
        if (dungTich < 100)
        {
            return triGia / 100.0;
        }

        else if (dungTich >= 100 && dungTich <= 200)
        {
            return triGia * 3 / 100.0;
        }
        else
        {
            return triGia * 5 / 100.0;
        }
    }

    public String toString()
    {
        return String.format("%-20s %-20s %10d %18.2f %18.2f", tenChuXe, loaiXe, dungTich, triGia, tinhThue());
    }
    
}