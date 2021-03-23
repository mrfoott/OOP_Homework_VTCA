import java.time.LocalDate;

public class GiaoDich
{
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected double dienTich;

    public GiaoDich()
    {
        this.maGiaoDich = "null";
        this. ngayGiaoDich = LocalDate.of(2020, 1, 1);
        this.donGia = 0.0;
        this.dienTich = 0.0;
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich)
    {
        if (!maGiaoDich.trim().equals(""))
        {
            this.maGiaoDich = maGiaoDich;
        }
        else
        {
            this.maGiaoDich = "null";
        }

        this.ngayGiaoDich = ngayGiaoDich;

        if (donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia =0.0;
        }

        if (dienTich > 0)
        {
            this.dienTich = dienTich;
        }
        else
        {
            this.dienTich = 0.0;
        }
    }

    public void setMaGiaoDich(String maGiaoDich)
    {
        if (!maGiaoDich.trim().equals(""))
        {
            this.maGiaoDich = maGiaoDich;
        }
        else
        {
            this.maGiaoDich = "null";
        }
    }

    public void setNgayGiaoDich(LocalDate ngayGiaoDich)
    {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public void setDonGia(double donGia)
    {
        if (donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia =0.0;
        }
    }

    public void setDienTich(double dienTich)
    {
        if (dienTich > 0)
        {
            this.dienTich = dienTich;
        }
        else
        {
            this.dienTich = 0.0;
        }
    }

    public String getMaGiaoDich()
    {
        return maGiaoDich;
    }

    public LocalDate getNgayGiaoDich()
    {
        return ngayGiaoDich;
    }

    public double getDonGia()
    {
        return donGia;
    }

    public double getDienTich()
    {
        return dienTich;
    }

    public double getThanhTien()
    {
        return 0.0;
    }

    public String getInfo()
    {
        return "";
    }

    public String getLoai()
    {
        return "";
    }
}