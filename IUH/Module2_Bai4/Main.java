import java.util.Scanner;

public class Main
{
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[ ] args)
    {
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien();

        SinhVien sv1 = new SinhVien("12345", "Lao Hac", 1997);
        SinhVien sv2 = new SinhVien("12346", "Cau Vang", 2002);
        SinhVien sv3 = new SinhVien("12347", "Ong Giao", 2000);
        SinhVien sv4 = new SinhVien("12348", "Thang mua cho 1", 2001);
        SinhVien sv5 = new SinhVien("12349", "Thang mua cho 2", 2001);
        SinhVien sv6 = new SinhVien("12345", "Em lao hac", 1997);

        quanLySinhVien.themSinhVien(sv1);
        quanLySinhVien.themSinhVien(sv2);
        quanLySinhVien.themSinhVien(sv3);
        quanLySinhVien.themSinhVien(sv4);
        quanLySinhVien.themSinhVien(sv5);
        quanLySinhVien.themSinhVien(sv6);

        quanLySinhVien.sapXepDanhSachVoiTenTangDan();
        quanLySinhVien.inDanhSachSinhVien();
    }
}