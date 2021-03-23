import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDonTienTienVietNam extends HoaDonTienDien
{
    private String doiTuongKhachHang;
    private double dinhMuc;

    public HoaDonTienTienVietNam()
    {
        super();
        this.doiTuongKhachHang = "null";
        this.dinhMuc = 0.0;
    }

    public HoaDonTienTienVietNam(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, 
                double soKwTieuThu, double donGia, String doiTuongKhachHang, double dinhMuc)
    {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKwTieuThu, donGia);

        if (!doiTuongKhachHang.trim().equals(""))
        {
            this.doiTuongKhachHang = doiTuongKhachHang;
        }
        else
        {
            this.doiTuongKhachHang = "null";
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

    @Override
    public double thanhTien()
    {
        if (soKwTieuThu < dinhMuc)
        {
            return soKwTieuThu * donGia;
        }
        else
        {
            return soKwTieuThu * donGia + (soKwTieuThu - dinhMuc) * donGia * 2.5;
        }
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-10s %-25s %15s %15.1f %10s %15s %15.1f", maKhachHang, hoTen, 
                    ngayLapHoaDon.format(dtf), soKwTieuThu, df.format(donGia), doiTuongKhachHang, dinhMuc);
    }
}
