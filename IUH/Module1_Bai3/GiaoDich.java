import java.time.LocalDate;

public abstract class GiaoDich
{
    protected String maGiaoDich;
    protected LocalDate ngayGiaoDich;
    protected double donGia;
    protected int soLuong;

    public GiaoDich()
    {
        this.maGiaoDich = "null";
        this.ngayGiaoDich = LocalDate.of(2020, 6, 1);
        this.donGia = 0.0;
        this.soLuong = 0;
    }

    public GiaoDich(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong)
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
            this.donGia = 0.0;
        }

        if (soLuong > 0)
        {
            this.soLuong = soLuong;
        }
        else
        {
            this.soLuong = 0;
        }
    }

    public void setMaGiaDich(String maGiaoDich)
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
            this.donGia = 0.0;
        }
    }

    public void setSoLuong(int soLuong)
    {
        if (soLuong > 0)
        {
            this.soLuong = soLuong;
        }
        else
        {
            this.soLuong = 0;
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

    public int getSoLuong()
    {
        return soLuong;
    }

    public String getLoai()
    {
        return "";
    }

    public String getInfo()
    {
        return "";
    }

    protected abstract double thanhTien();
}