import java.time.LocalDate;

public class HoaDonTienDien
{
    protected String maKhachHang;
    protected String hoTen;
    protected LocalDate ngayLapHoaDon;
    protected double soKwTieuThu;
    protected double donGia;

    public HoaDonTienDien()
    {
        this.maKhachHang = "null";
        this.hoTen = "null";
        this.ngayLapHoaDon = LocalDate.of(2020, 1, 1);
        this.soKwTieuThu = 0.0;
        this.donGia = 0.0;
    }

    public HoaDonTienDien(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, double soKwTieuThu, double donGia)
    {
        if (!maKhachHang.trim().equals(""))
        {
            this.maKhachHang = maKhachHang;
        }
        else
        {
            this.maKhachHang = "null";
        }

        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        this.ngayLapHoaDon = ngayLapHoaDon;
        
        if (soKwTieuThu > 0)
        {
            this.soKwTieuThu = soKwTieuThu;
        }
        else
        {
            this.soKwTieuThu = 0.0;
        }

        if (donGia > 0)
        {
            this.donGia = donGia;
        }
        else
        {
            this.donGia = 0.0;
        }
    }

    public String getMaKhachHang()
    {
        return maKhachHang;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public LocalDate getNgayLapHoaDon()
    {
        return ngayLapHoaDon;
    }

    public double getSoKwTieuThu()
    {
        return soKwTieuThu;
    }

    public double getDonGia()
    {
        return donGia;
    }

    public double thanhTien()
    {
        return 0.0;
    }

    public String getInfo()
    {
        return "";  
    }
}