public abstract class SinhVien
{
    protected String maSoSinhVien;
    protected String hoTen;
    protected String soDienThoai;
    protected String gioiTinh;
    protected String tenLop;

    public SinhVien()
    {
        maSoSinhVien = "null";
        hoTen = "null";
        soDienThoai = "null";
        gioiTinh = "null";
        tenLop = "null";
    }

    public SinhVien(String maSoSinhVien, String hoTen, String soDienThoai, String gioiTinh, String tenLop)
    {
        if (!maSoSinhVien.trim().equals(""))
        {
            this.maSoSinhVien = maSoSinhVien;
        }
        else
        {
            this.maSoSinhVien = "null";
        }

        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (!soDienThoai.trim().equals(""))
        {
            this.soDienThoai = soDienThoai;
        }
        else
        {
            this.soDienThoai = "null";
        }

        if (!gioiTinh.trim().equals(""))
        {
            this.gioiTinh = gioiTinh;
        }
        else
        {
            this.gioiTinh = "null";
        }

        if (!tenLop.trim().equals(""))
        {
            this.tenLop = tenLop;
        }
        else
        {
            this.tenLop = "null";
        }
    }

    public abstract String getInfo();
}