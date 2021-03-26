public class SinhVienLienKet extends SinhVien
{
    private String quocGia;

    public SinhVienLienKet()
    {
        super();
    }

    public SinhVienLienKet(String maSoSinhVien, String hoTen, String soDienThoai, String gioiTinh, String tenLop, String quocGia)
    {
        super(maSoSinhVien, hoTen, soDienThoai, gioiTinh, tenLop);
        if (!quocGia.trim().equals(""))
            this.quocGia = quocGia;
        else
            this.quocGia = "null";
    }

    @Override
    public String getInfo()
    {
        return String.format("%-10s | %-25s | %-15s | %-10s | %10s | %10s", maSoSinhVien, hoTen, soDienThoai, gioiTinh, tenLop, quocGia);
    }
}