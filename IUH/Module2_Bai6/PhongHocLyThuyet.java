public class PhongHocLyThuyet extends PhongHoc
{
    private boolean coMayChieuKhong;

    public PhongHocLyThuyet(String maPhong, String dayNha, double dienTich, int soBongDen, boolean coMayChieuKhong)
    {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.coMayChieuKhong = coMayChieuKhong;
    }

    @Override
    public boolean coDatChuanKhong()
    {
        if (coMayChieuKhong && (dienTich / (double) soBongDen) <= 10.0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String getInfo()
    {
        return String.format("%-15s %-15s %-15.2f %-15d %-15s", maPhong, dayNha, dienTich, soBongDen, coMayChieuKhong ? "Co may chieu" : "Khong co may chieu");
    }
}