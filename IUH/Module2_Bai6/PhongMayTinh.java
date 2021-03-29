public class PhongMayTinh extends PhongHoc
{
    private int soMayTinh;

    public PhongMayTinh(String maPhong, String dayNha, double dienTich, int soBongDen, int soMayTinh)
    {
        super(maPhong, dayNha, dienTich, soBongDen);

        if (soMayTinh > 0)
        {
            this.soMayTinh = soMayTinh;
        }
        else
        {
            this.soMayTinh = 0;
        }
    }

    public int getSoMayTinh()
    {
        return soMayTinh;
    }

    @Override
    public boolean coDatChuanKhong()
    {
        if ((dienTich / (double) soMayTinh) <= 1.5 && (dienTich / (double) soBongDen) <= 10.0)
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
        return String.format("%-15s %-15s %-15.2f %-15d %-15d", maPhong, dayNha, dienTich, soBongDen, soMayTinh);
    }

    public void capNhatSoMayTinh()
    {
        int soMayTinhMoi;
        System.out.println("Nhap so may tinh can thay doi: ");
        soMayTinhMoi = Integer.parseInt(Main.sc.nextLine());
        soMayTinh = soMayTinhMoi;
    }
}