public class SinhVienDaiHoc extends SinhVien
{
    public SinhVienDaiHoc()
    {
        super();
    }

    public SinhVienDaiHoc(String maSoSinhVien, String hoTen, String soDienThoai, String gioiTinh, String tenLop)
    {
        super(maSoSinhVien, hoTen, soDienThoai, gioiTinh, tenLop);
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s | %-25s | %-15s | %-10s | %10s", maSoSinhVien, hoTen, 
            soDienThoai, gioiTinh, tenLop);
    }
}