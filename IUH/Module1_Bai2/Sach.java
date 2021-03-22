import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Sach
{
    protected String maSach;
    protected LocalDate ngayNhap;
    protected double donGia;
    protected int soLuong;
    protected String nhaXuatBan;

    public Sach()
    {
        this.maSach = "null";
        this.ngayNhap = LocalDate.of(2020, 1, 1);
        this.donGia = 0.0;
        this.soLuong = 0;
        this.nhaXuatBan = "null";
    }

    public Sach(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan)
    {
        if (!maSach.trim().equals(""))
        {
            this.maSach = maSach;
        }
        else
        {
            this.maSach = "null";
        }

        this.ngayNhap = ngayNhap;

        if (donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia = 0;
        }

        if (soLuong > 0)
        {
            this.soLuong = soLuong;
        }
        else
        {
            this.soLuong = 0;
        }

        if (!nhaXuatBan.trim().equals(""))
        {
            this.nhaXuatBan = nhaXuatBan;
        }
        else
        {
            this.nhaXuatBan = "null";
        }
    }

    public void setMaSach(String maSach)
    {
        if (!maSach.trim().equals(""))
        {
            this.maSach = maSach;
        }
        else
        {
            this.maSach = "null";
        }
    }

    public void setNgayNhap(LocalDate ngayNhap)
    {
        this.ngayNhap = ngayNhap;
    }

    public void setDonGia(double donGia)
    {
        if (donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia = 0;
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

    public void setNhaXuatBan(String nhaXuatBan)
    {
        if (!nhaXuatBan.trim().equals(""))
        {
            this.nhaXuatBan = nhaXuatBan;
        }
        else
        {
            this.nhaXuatBan = "null";
        }
    }

    public String getMaSach()
    {
        return maSach;
    }

    public LocalDate getNgayNhap()
    {
        return ngayNhap;
    }

    public double getDonGia()
    {
        return donGia;
    }

    public int getSoLuong()
    {
        return soLuong;
    }

    public String getNhaXuatBan()
    {
        return nhaXuatBan;
    }

    public String inThongTinSach()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%-10s %-12s %12.2f %8d %15s", maSach, ngayNhap.format(dtf), donGia, soLuong, nhaXuatBan);
    }

    public double getThanhTien()
    {
        return 0;
    }
}