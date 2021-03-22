import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SachThamKhao extends Sach
{
    private double thue;

    public SachThamKhao()
    {
        super();
        this.thue = 0;
    }

    public SachThamKhao(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue)
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);

        if (thue > 0)
        {
            this.thue = thue;
        }
        else
        {
            this.thue = 0;
        }
    }

    public double getThanhTien()
    {
        return soLuong * donGia + thue;
    }

    public String inThongTinSach()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%-10s %-12s %12.2f %10d %15s %6.2f", maSach, ngayNhap.format(dtf), donGia, soLuong, nhaXuatBan, thue);
    }
}