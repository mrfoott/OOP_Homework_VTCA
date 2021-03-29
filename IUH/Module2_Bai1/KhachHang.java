import java.text.DecimalFormat;

public class KhachHang 
{
    private String tenKhachHang;
    private double doanhSo;

    public KhachHang()
    {
        this.tenKhachHang = "null";
        this.doanhSo = 0.0;
    }
    
    public KhachHang(String tenKhachHang, double doanhSo)
    {
        if (!tenKhachHang.trim().equals(""))
        {
            this.tenKhachHang = tenKhachHang;
        }
        else
        {
            this.tenKhachHang = "null";
        }

        if (doanhSo > 0.0)
        {
            this.doanhSo = doanhSo;
        }
        else
        {
            this.doanhSo = 0.0;
        }
    }

    public String getTenKhachHang()
    {
        return tenKhachHang;
    }

    public double getDoanhSo()
    {
        return doanhSo;
    }

    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-25s %25s", tenKhachHang, df.format(doanhSo));
    }
}