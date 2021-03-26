import java.text.DecimalFormat;

public class XeDap extends Xe
{
    public XeDap()
    {
        super();
    }

    public XeDap(String tenHang, String loaiXe, String mauSac, double giaTien)
    {
        super(tenHang, loaiXe, mauSac, giaTien);
    }

    @Override
    public double tienThue()
    {
        return 0.0;
    }

    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.000");
        return String.format("%-25s %-25s %-10s %25s", tenHang, loaiXe, mauSac, df.format(giaTien));
    }
}
