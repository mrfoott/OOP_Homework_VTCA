import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichTienTe extends GiaoDich
{
    private double tiGia;
    private String loaiTien;

    public GiaoDichTienTe()
    {
        super();
        this.tiGia = 0.0;
        this.loaiTien = "null";
    }

    public GiaoDichTienTe(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, int soLuong, double tiGia, String loaiTien)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, soLuong);

        if (tiGia > 0)
        {
            this.tiGia = tiGia;
        }
        else 
        {
            this.tiGia = 0;
        }

        if (!loaiTien.trim().equals(""))
        {
            this.loaiTien = loaiTien;
        }
        else
        {
            this.loaiTien = "null";
        }
    }

    @Override
    public String getLoai()
    {
        return loaiTien;
    }

    @Override
    public double thanhTien()
    {
        if (loaiTien.trim().equals("VN"))
        {
            return soLuong *donGia;
        }
        else if (loaiTien.trim().equals("USD") || loaiTien.trim().equals("Euro"))
        {
            return soLuong * donGia * tiGia;
        }
        else
        {
            return 0;
        }
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-15s %15s %15s %10d %10.2f %15s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), soLuong, tiGia, loaiTien);
    }
}
