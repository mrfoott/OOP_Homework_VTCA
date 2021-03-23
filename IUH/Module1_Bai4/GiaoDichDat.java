import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GiaoDichDat extends GiaoDich
{
    private String loaiDat;

    public GiaoDichDat()
    {
        super();
        this.loaiDat = "null";
    }

    public GiaoDichDat(String maGiaoDich, LocalDate ngayGiaoDich, double donGia, double dienTich, String loaiDat)
    {
        super(maGiaoDich, ngayGiaoDich, donGia, dienTich);
        if (!loaiDat.trim().equals(""))
        {
            this.loaiDat = loaiDat;
        }
        else
        {
            this.loaiDat = "null";
        }
    }

    @Override
    public double getThanhTien()
    {
        if (loaiDat.trim().equals("A"))
        {
            return dienTich * donGia * 1.5;
        }
        else if (loaiDat.trim().equals("B") || loaiDat.trim().equals("C"))
        {
            return dienTich * donGia;
        }
        else 
        {
            return 0.0;
        }
    }

    @Override
    public String getLoai()
    {
        return loaiDat;
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);
        return String.format("%-12s %-15s %20s %12.1f %10s", maGiaoDich, ngayGiaoDich.format(dtf), nf.format(donGia), dienTich, loaiDat);
    }
}
