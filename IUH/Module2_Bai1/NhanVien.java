public class NhanVien
{
    private String maSoNhanVien;
    private String tenNhanVien;
    private String diaChi;
    private String soDienThoai;

    public NhanVien()
    {
        this.maSoNhanVien = "null";
        this.tenNhanVien = "null";
        this.diaChi = "null";
        this.soDienThoai = "null";
    }

    public NhanVien(String maSoNhanVien, String tenNhanVien, String diaChi, String soDienThoai)
    {
        if (!maSoNhanVien.trim().equals(""))
        {
            this.maSoNhanVien = maSoNhanVien;
        }
        else
        {
            this.maSoNhanVien = "null";
        }

        if (!tenNhanVien.trim().equals(""))
        {
            this.tenNhanVien = tenNhanVien;
        }
        else
        {
            this.tenNhanVien = "null";
        }

        if (!diaChi.trim().equals(""))
        {
            this.diaChi = diaChi;
        }
        else
        {
            this.diaChi = "null";
        }
        
        if (!soDienThoai.trim().equals(""))
        {
            this.soDienThoai = soDienThoai;
        }
        else
        {
            this.soDienThoai = "null";
        }
    }

    public String getMaSoNhanVien()
    {
        return maSoNhanVien;
    }

    public String getTenNhanVien()
    {
        return tenNhanVien;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public String getSoDienThoai()
    {
        return soDienThoai;
    }

    public String getInfo()
    {
        return String.format("%-15s %-25s %-20s %20s", maSoNhanVien, tenNhanVien, diaChi, soDienThoai);
    }
}