public class ChuyenXe 
{
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double doanhThu;
    
    public ChuyenXe()
    {
        this.maSoChuyen = "null";
        this.hoTenTaiXe = "null";
        this.soXe = "null";
        this.doanhThu = 0.0;
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu)
    {
        if (!maSoChuyen.trim().equals(""))
        {
            this.maSoChuyen = maSoChuyen;
        }
        else
        {
            this.maSoChuyen = "null";
        }

        if (!hoTenTaiXe.trim().equals(""))
        {
            this.hoTenTaiXe = hoTenTaiXe;
        }
        else
        {
            this.hoTenTaiXe = "null";
        }

        if (!soXe.trim().equals(""))
        {
            this.soXe = soXe;
        }
        else
        {
            this.soXe = "null";
        }

        if (doanhThu > 0)
        {
            this.doanhThu = doanhThu;
        }
        else
        {
            this.doanhThu = 0.0;
        }
    }

    public void setMaSoChuyen(String maSoChuyen)
    {
        if (!maSoChuyen.trim().equals(""))
        {
            this.maSoChuyen = maSoChuyen;
        }
        else
        {
            this.maSoChuyen = "null";
        }
    }

    public void setHoTenTaiXe(String hoTenTaiXe)
    {
        if (!hoTenTaiXe.trim().equals(""))
        {
            this.hoTenTaiXe = hoTenTaiXe;
        }
        else
        {
            this.hoTenTaiXe = "null";
        }
    }

    public void setSoXe(String soXe)
    {
        if (!soXe.trim().equals(""))
        {
            this.soXe = soXe;
        }
        else
        {
            this.soXe = "null";
        }
    }

    public void setDoanhThu(double doanhThu)
    {
        if (doanhThu > 0)
        {
            this.doanhThu = doanhThu;
        }
        else
        {
            this.doanhThu = 0.0;
        }
    }

    public String getMaSoChuyen()
    {
        return maSoChuyen;
    }

    public String getHoTenTaiXe()
    {
        return hoTenTaiXe;
    }

    public String getSoXe()
    {
        return soXe;
    }

    public double getDoanhThu()
    {
        return doanhThu;
    }
}
