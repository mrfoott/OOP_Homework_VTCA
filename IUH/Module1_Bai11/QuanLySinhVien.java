import java.util.ArrayList;

public class QuanLySinhVien
{
    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();
    
    public void themSinhVien(SinhVien sv)
    {
        danhSachSinhVien.add(sv);
    }

    public void xuatDanhSachSinhVien()
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            System.out.println(sv.getInfo());
        }
    }
}