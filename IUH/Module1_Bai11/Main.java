public class Main
{
    public static void main(String[] args)   
    {
        QuanLySinhVien ql = new QuanLySinhVien();

        SinhVien sv1 = new SinhVienCaoDang("12345", "Tran Van A", "0979223134", "Nam", "&UHKKHK");
        SinhVien sv2 = new SinhVienTrungCap("512361", "Ly Thi B", "047185934", "Nu", "BJKKJB");
        SinhVien sv3 = new SinhVienDaiHoc("123466", "Nguyen Chi C", "123145354235", "Nam", "JASFJB");
        SinhVien sv4 = new SinhVienLienKet("34513", "Lam Thien D", "4235614", "Nu", "kKBKBJU", "US");

        ql.themSinhVien(sv1);
        ql.themSinhVien(sv2);
        ql.themSinhVien(sv3);
        ql.themSinhVien(sv4);

        ql.xuatDanhSachSinhVien();
    }
}