import java.util.ArrayList;
import java.util.Scanner;

public class HocVien
{
    private String hoTen;
    private String diaChi;
    private String soDienThoai;
    private ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>(); 

    public HocVien()
    {
        this.hoTen = "null";
        this.diaChi = "null";
        this.soDienThoai = "null";
    }

    public HocVien(String hoTen, String diaChi, String soDienThoai)
    {
        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (!diaChi.trim().equals(""))
        {
            this.diaChi = diaChi;
        }
        else
        {
            this.diaChi = "null";
        }

        if (!soDienThoai.trim().equals(""))
        {
            this.soDienThoai = soDienThoai;
        }
        else
        {
            this.soDienThoai = "null";
        }
    }

    public static HocVien taoHocVienBangInput()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten hoc vien: ");
        String ihoTen = sc.nextLine();
        System.out.println("Nhap dia chi hoc vien: ");
        String idiaChi = sc.nextLine();
        System.out.println("Nhap so dien thoai hoc vien: ");
        String isoDienThoai = sc.nextLine();
        return new HocVien(ihoTen, idiaChi, isoDienThoai);
    }

    public void setHoTen(String hoTen)
    {
        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }
    }

    public void setDiaChi(String diaChi)
    {
        if (!diaChi.trim().equals(""))
        {
            this.diaChi = diaChi;
        }
        else
        {
            this.diaChi = "null";
        }
    }

    public void setSoDienThoai(String soDienThoai)
    {
        if (!soDienThoai.trim().equals(""))
        {
            this.soDienThoai = soDienThoai;
        }
        else
        {
            this.soDienThoai = "null";
        }
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public String getDiaChi()
    {
        return diaChi;
    }

    public String getSoDienThoai()
    {
        return soDienThoai;
    }

    public String inChiTietHocVien()
    {
        return String.format("%-20s %-40s %12s", hoTen, diaChi, soDienThoai);
    }

    public void addKhoaHocVaoHocVien(KhoaHoc khoaHoc)
    {
        danhSachKhoaHoc.add(khoaHoc);
    }

    public void inDanhSachKhoaHoc()
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            kh.inChiTietKhoaHoc();
        }
    }
}