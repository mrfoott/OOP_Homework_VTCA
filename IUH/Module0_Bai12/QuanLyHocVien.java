import java.util.ArrayList;

public class QuanLyHocVien 
{
    private ArrayList<HocVien> danhSachHocVien = new ArrayList<>();
    private final int MAXSIZE = 20;
    
    public boolean themHocVien(HocVien hv)
    {
        if (danhSachHocVien.size() < MAXSIZE)
        {
            danhSachHocVien.add(hv);
            return true;
        }   
        return false;
    }

    public HocVien timHocVienBangSoDienThoai(String soDienThoai)
    {
        for (HocVien hv : danhSachHocVien)
        {
            if (hv.getSoDienThoai().equals(soDienThoai))
            {
                return hv;
            }
        }
        
        return null;
    }

    public void inKhoaHocCuaHocVien(HocVien hv)
    {
        hv.inDanhSachKhoaHoc();
    }

    public void inDanhSachHocVien()
    {
        for (HocVien hv : danhSachHocVien)
        {
            System.out.println(hv.inChiTietHocVien());
        }
    }
}
