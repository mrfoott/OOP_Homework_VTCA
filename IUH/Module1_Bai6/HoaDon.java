import java.time.LocalDate;

public abstract class HoaDon 
{
    protected String maHoaDon;
    protected LocalDate ngayHoaDon;
    protected String tenKhachHang;
    protected String maPhong;
    protected double donGia;

    public HoaDon()
    {
        this.maHoaDon = "null";
        this.ngayHoaDon = LocalDate.of(20220, 1, 1);
        this.tenKhachHang = "null";
        this.maPhong = "null";
        this.donGia = 0.0;
    }

    public HoaDon(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, String maPhong, double donGia)
    {
        if (!maHoaDon.trim().equals(""))
        {
            this.maHoaDon = maHoaDon;
        }
        else
        {
            this.maHoaDon = "null";
        }

        this.ngayHoaDon = ngayHoaDon;
        
        if (!tenKhachHang.trim().equals(""))
        {
            this.tenKhachHang = tenKhachHang;
        }
        else
        {
            this.tenKhachHang = "null";
        }

        if (!maPhong.trim().equals(""))
        {
            this.maPhong = maPhong;
        }
        else
        {
            this.maPhong = "null";
        }

        if (donGia > 0.0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia = 0.0;
        }
    }

    public String getMaHoaDon()
    {
        return maHoaDon;
    }

    public LocalDate getNgayHoaDon()
    {
        return ngayHoaDon;
    }

    public String getTenKhachHang()
    {
        return tenKhachHang;
    }

    public String getMaPhong()
    {
        return maPhong;
    }

    public double getDonGia()
    {
        return donGia;
    }

    public abstract double thanhTien();
    public abstract String getInfo();
    public abstract boolean equals(HoaDon obj);
}