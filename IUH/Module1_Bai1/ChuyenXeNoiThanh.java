public class ChuyenXeNoiThanh extends ChuyenXe
{
    private int soTuyen;
    private double soKmDiDuoc;

    public ChuyenXeNoiThanh()
    {
        super();
        this.soTuyen = 0;
        this.soKmDiDuoc = 0;
    }

    public ChuyenXeNoiThanh(String maSoSoChuyen, String hoTenTaiXe, String soXe,
                                double doanhThu, int soTuyen, double soKmDiDuoc)
    {
        super(maSoSoChuyen, hoTenTaiXe, soXe, doanhThu);

        if (soTuyen > 0)
        {
            this.soTuyen = soTuyen;
        }
        else
        {
            this.soTuyen = 0;
        }

        if (soKmDiDuoc > 0)
        {
            this.soKmDiDuoc = soKmDiDuoc;
        }
        else
        {
            this.soKmDiDuoc = 0;
        }
    }

    public String thongTinChuyenXeNoiThanh()
    {
        return String.format("%-10s %-20s %-10s %15.2f %10d %15.2f", maSoChuyen, hoTenTaiXe, soXe, 
                                                                    doanhThu, soTuyen, soKmDiDuoc);
    }
}
