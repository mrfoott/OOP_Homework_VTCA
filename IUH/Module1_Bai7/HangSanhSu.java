import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class HangSanhSu extends HangHoa
{
    private String nhaSanXuat;
    private LocalDate ngayNhapKho;

    public HangSanhSu()
    {
        super();
        ngayNhapKho = LocalDate.of(2020, 1, 1);
    }


    public HangSanhSu(String maHang, String tenHang, double donGia, int soLuongTon, String nhaSanXuat
        , LocalDate ngayNhapKho)
    {
        super(maHang, tenHang, donGia, soLuongTon);
        if (!nhaSanXuat.trim().equals(""))
        {
            this.nhaSanXuat = nhaSanXuat;
        }
        else
        {
            this.nhaSanXuat = "xxx";
        }

        if (ngayNhapKho.isBefore(LocalDate.now()))
        {
            this.ngayNhapKho = ngayNhapKho;
        }
        else
        {
            this.ngayNhapKho = LocalDate.now();
        }
    }

    public static HangSanhSu createHangSanhSuByInput() throws NullPointerException, NumberFormatException, DateTimeParseException
    {
        String imaHang, itenHang, inhaSanXuat;
        double idonGia;
        int isoLuongTon;
        LocalDate ingayNhapKho;

        System.out.println("Nhap ma hang: ");
        imaHang = Main.sc.nextLine();
        System.out.println("Nhap ten hang: ");
        itenHang = Main.sc.nextLine();
        System.out.println("Nhap don gia (So thuc va lon hon 0): ");
        idonGia = Double.parseDouble(Main.sc.nextLine());
        System.out.println("Nhap so luong ton kho (So nguyen va lon hon 0): ");
        isoLuongTon = Integer.parseInt(Main.sc.nextLine());
        System.out.println("Nhap ten nha san xuat: ");
        inhaSanXuat = Main.sc.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Nhap ngay thang nam nhap kho (Theo dang dd/mm/yyyy): ");
        String sngayNhapKho = Main.sc.nextLine();
        ingayNhapKho = LocalDate.parse(sngayNhapKho, dtf);

        return new HangSanhSu(imaHang, itenHang, idonGia, isoLuongTon, inhaSanXuat, ingayNhapKho);
    }

    @Override
    public String mucDoBanBuon()
    {
        if (soLuongTon > 50 &&  ngayNhapKho.plusDays(10).isAfter(LocalDate.now()))
            return "Ban Cham";
        else return "Binh thuong";
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("Hang Sanh Su: %-15s %-20s %15s VND %10d %-25s %15s", maHang, tenHang, df.format(donGia), soLuongTon, nhaSanXuat
        , ngayNhapKho.format(dtf));
    }
}