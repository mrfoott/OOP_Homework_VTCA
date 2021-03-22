public class ChuyenXeNgoaiThanh extends ChuyenXe
{
    private String noiDen;
    private int soNgayDiDuoc;

    public ChuyenXeNgoaiThanh()
    {
        super();
        this.noiDen = "null";
        this.soNgayDiDuoc = 0;
    }

    public ChuyenXeNgoaiThanh(String maSoChuyen, String hoTenTaiXe, String soXe, 
                                double doanhThu, String noiDen, int soNgayDiDuoc)
    {
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);

        if (!noiDen.trim().equals(""))
        {
            this.noiDen = noiDen;
        }
        else
        {
            this.noiDen = "null";
        }

        if (soNgayDiDuoc > 0)
        {
            this.soNgayDiDuoc = soNgayDiDuoc;
        }
        else
        {
            this.soNgayDiDuoc = 0;
        }
    }
    
    public String thongTinChuyenXeNgoaiThanh()
    {
        return String.format("%-10s %-20s %-10s %15.2f %20s %15d", maSoChuyen, 
                            hoTenTaiXe, soXe, doanhThu, noiDen, soNgayDiDuoc);
    }
}
