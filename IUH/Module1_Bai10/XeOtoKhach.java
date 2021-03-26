import java.text.DecimalFormat;

public class XeOtoKhach extends Xe
{
    private int soCho;

    public XeOtoKhach()
    {
        super();
        this.soCho = 0;
    }

    public XeOtoKhach(String tenHang, String loaiXe, String mauSac, double giaTien, int soCho)
    {
        super(tenHang, loaiXe, mauSac, giaTien);
        
        if (soCho > 0)
        {
            this.soCho = soCho;
        }
        else
        {
            this.soCho = 0;
        }
    }

    public double thueTieuThuDacBiet()
    {
        if (soCho < 5)
            return giaTien * 0.5;
        else
            return giaTien * 0.3;
    }

    public double thueVAT()
    {
        return giaTien * 0.1;
    }

    public double thueTruocBa()
    {
        return giaTien * 0.2;
    }

    @Override 
    public double tienThue()
    {
        return thueVAT() + thueTruocBa() + thueTieuThuDacBiet();
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-25s %-25s %-10s %25s %12s %12s %12s %12s", tenHang, loaiXe, mauSac, df.format(giaTien),
                df.format(thueVAT()), df.format(thueTruocBa()), df.format(thueTieuThuDacBiet()), df.format(tienThue()));
    }
}