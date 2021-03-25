import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon
{
    private int soNgayThue;

    public HoaDonTheoNgay()
    {
        super();
        this.soNgayThue = 0;
    }

    public HoaDonTheoNgay(String maHoaDon, LocalDate ngayHoaDon, String tenKhachHang, 
                                        String maPhong, double donGia, int soNgayThue)
    {
        super(maHoaDon, ngayHoaDon, tenKhachHang, maPhong, donGia);
        
        if (soNgayThue > 0)
        {
            this.soNgayThue = soNgayThue;
        }
        else
        {
            this.soNgayThue = 0;
        }
    }

    public double thanhTien()
    {
        if (soNgayThue > 7)
        {
            return 7 * donGia + (soNgayThue - 7) * donGia * 0.8;    
        }
        else
        {
            return soNgayThue *donGia;
        }
    }

    @Override
    public String getInfo()
    {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-10s %-12s %-20s %-10s %15s %15d", maHoaDon, 
                    ngayHoaDon.format(dtf), tenKhachHang, maPhong, df.format(donGia), soNgayThue);
    }

    public boolean equals(HoaDon obj)
    {
        if (this.maHoaDon == obj.getMaHoaDon())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static HoaDonTheoNgay taoHoaDon() throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Tao Hoa Don Theo Ngay -----");
        System.out.println("Nhap ma hoa don: ");
        String imaHoaDon = sc.nextLine();
        System.out.println("Ngay nam lap hoa don: ");
        int nam = sc.nextInt();
        System.out.println("Nhap thang lap hoa don: ");
        int thang = sc.nextInt();
        System.out.println("Nhap ngay lap hoa don: ");
        int ngay = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ten khach hang: ");
        String itenKhachHang = sc.nextLine();
        System.out.println("Nhap ma phong: ");
        String imaPhong = sc.nextLine();
        System.out.println("Nhap don gia: ");
        double idonGia = sc.nextDouble();
        System.out.println("Nhap so ngay thue ");
        int isoNgayThue = sc.nextInt();
        sc.nextLine();

        LocalDate iNgayHoaDon = LocalDate.of(nam, thang, ngay);

        HoaDonTheoNgay result = new HoaDonTheoNgay(imaHoaDon, iNgayHoaDon, 
                            itenKhachHang, imaPhong, idonGia, isoNgayThue);

        return result;
    }
}
