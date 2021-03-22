import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SachGiaoKhoa extends Sach
{
    private String tinhTrang;

    public SachGiaoKhoa()
    {
        super();
        this.tinhTrang = "null";
    }

    public SachGiaoKhoa(String maSach, LocalDate ngayNhap, double donGia, int soLuong, String nhaXuatBan, String tinhTrang)
    {
        super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
        
        if (!tinhTrang.trim().equals(""))
        {
            this.tinhTrang = tinhTrang;
        }
        else
        {
            this.tinhTrang = "null";
        }
    }

    public double getThanhTien()
    {
        if (tinhTrang.trim().equals("Moi"))
        {
            return soLuong * donGia;
        }
        else if (tinhTrang.trim().equals("Cu"))
        {
            return soLuong * donGia * 0.5;
        }
        else
        {
            return 0;
        }
    }

    public String inThongTinSach()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%-10s %-12s %12.2f %10d %15s %10s", maSach, ngayNhap.format(dtf), donGia, soLuong, nhaXuatBan, tinhTrang);
    }
}