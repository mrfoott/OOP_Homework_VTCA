import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class KhoaHoc 
{
    private String tenKhoaHoc;
    private LocalDate ngayMoKhoaHoc;
    private int thoiGianHoc;
    private final LocalDate NGAYHOMNAY = LocalDate.now();
    private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    public KhoaHoc()
    {
        this.tenKhoaHoc = "null";
        this.ngayMoKhoaHoc = LocalDate.of(2020, 8, 15);
        this.thoiGianHoc = 0;
    }

    public KhoaHoc(String tenKhoaHoc, LocalDate ngayMoKhoaHoc, int thoiGianHoc)
    {
        if (!tenKhoaHoc.trim().equals(""))
        {
            this.tenKhoaHoc = tenKhoaHoc;
        }
        else
        {
            this.tenKhoaHoc = "null";
        }

        this.ngayMoKhoaHoc = ngayMoKhoaHoc;

        if (thoiGianHoc > 0)
        {
            this.thoiGianHoc = thoiGianHoc;
        }
        else
        {
            this.thoiGianHoc = 0;
        }
    }

    public void setTenKhoaHoc(String tenKhoaHoc)
    {
        if (!tenKhoaHoc.trim().equals(""))
        {
            this.tenKhoaHoc = tenKhoaHoc;
        }
        else
        {
            this.tenKhoaHoc = "null";
        }
    }

    public void setNgayMoKhoaHoc(LocalDate ngayMoKhoaHoc)
    {
        this.ngayMoKhoaHoc = ngayMoKhoaHoc;
    }

    public void setThoiGianHoc(int thoiGianHoc)
    {
        if (thoiGianHoc > 0)
        {
            this.thoiGianHoc = thoiGianHoc;
        }
        else
        {
            this.thoiGianHoc = 0;
        }
    }

    public String getTenKhoaHoc()
    {
        return tenKhoaHoc;
    }

    public LocalDate getNgayMoKhoaHoc()
    {
        return ngayMoKhoaHoc;
    }

    public int getThoiGianHoc()
    {
        return thoiGianHoc;
    }

    public boolean isOver()
    {
        if (ngayMoKhoaHoc.plusDays(thoiGianHoc).isBefore(NGAYHOMNAY))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean haventStartYet()
    {
        if (ngayMoKhoaHoc.isAfter(NGAYHOMNAY))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean startedButNotYetOver()
    {
        if (!isOver() && !haventStartYet())
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public String getInfo()
    {
        return String.format("%-20s %10s %14d", tenKhoaHoc, ngayMoKhoaHoc.format(dtf), thoiGianHoc);
    }

    public void inChiTietKhoaHoc()
    {
        System.out.println(getInfo());
    }

    public void themHocVienVaoKhoaHoc(HocVien hv)
    {
        danhSachHocVien.add(hv);
    }

    public static KhoaHoc taoKhoaHocBangInput() throws NumberFormatException
    {
        System.out.println("Nhap ten khoa hoc:");
        String tenKhoaHoc = sc.nextLine();
        System.out.println("Nhap nam bat dau: ");
        int nam = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap thang bat dau: ");
        int thang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ngay bat dau: ");
        int ngay = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(nam, thang, ngay);
        System.out.println("Nhap so ngay hoc cua khoa hoc: ");
        int thoiGianHoc = Integer.parseInt(sc.nextLine());

        return new KhoaHoc(tenKhoaHoc, date, thoiGianHoc);
    }

    public void inDanhSachHocVienTrongKhoaHoc()
    {
        for (HocVien hv : danhSachHocVien)
        {
            System.out.println(hv.inChiTietHocVien());
        }
    }
}
