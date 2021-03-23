import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HoaDonTienDienNuocNgoai extends HoaDonTienDien
{
    private String quocTich;

    public HoaDonTienDienNuocNgoai()
    {
        super();
        quocTich = "null";
    }

    public HoaDonTienDienNuocNgoai(String maKhachHang, String hoTen, LocalDate ngayLapHoaDon, 
    double soKwTieuThu, double donGia, String quocTich)
    {
        super(maKhachHang, hoTen, ngayLapHoaDon, soKwTieuThu, donGia);
        if (!quocTich.trim().equals(""))
        {
            this.quocTich = quocTich;
        }
        else
        {
            this.quocTich = "null";
        }
    }

    @Override
    public double thanhTien()
    {
            return soKwTieuThu * donGia;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-10s %-25s %15s %15.1f %10s %25s", maKhachHang, hoTen, 
                ngayLapHoaDon.format(dtf), soKwTieuThu, df.format(donGia), quocTich);
    }
}
