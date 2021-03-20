import java.util.ArrayList;

public class QuanLyKhoaHoc 
{
    private ArrayList<KhoaHoc> danhSachKhoaHoc = new ArrayList<>();
    
    public KhoaHoc searchCourse(String tenKhoaHoc)
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            if (tenKhoaHoc.trim().equals(kh.getTenKhoaHoc()))
            {
                return kh;
            }
        }
        return null;
    }

    public void showKhoaHocVoiTenXacDinh(String tenKhoaHoc)
    {
        KhoaHoc kh = searchCourse(tenKhoaHoc);
        if (kh != null)
        {
            System.out.println(kh.getInfo()); 
        }
        else
        {
            System.out.println("Khong tim thay!!!");
        }
    }

    public void inKhoaHocChuaBatDau()
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            if (kh.haventStartYet())
            {
                kh.inChiTietKhoaHoc();
            }
        }
    }

    public void inKhoaHocDaKetThuc()
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            if (kh.isOver())
            {
                kh.inChiTietKhoaHoc();
            }
        }
    }

    public void inKhoaHocDaBatDauNhungChuaKetThuc()
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            if (!kh.haventStartYet() && !kh.isOver())
            {
                kh.inChiTietKhoaHoc();
            }
        }
    }

    public KhoaHoc timKhoaHocTheoTen(String tenKhoaHoc)
    {
        for (KhoaHoc kh : danhSachKhoaHoc)
        {
            if (tenKhoaHoc.trim().equals(kh.getTenKhoaHoc()))
            {
                return kh;
            }
        }
        return null;
    }

    public void themKhoaHoc(KhoaHoc kh)
    {
        danhSachKhoaHoc.add(kh);
    }
}
