import java.util.ArrayList;

public class QuanLyPhongHoc 
{
    private ArrayList<PhongHoc> danhSachPhongHoc;

    public QuanLyPhongHoc()
    {
        danhSachPhongHoc = new ArrayList<>();
    }

    public QuanLyPhongHoc(ArrayList<PhongHoc> listPhongHoc)
    {
        this.danhSachPhongHoc = listPhongHoc;
    }

    public boolean themPhongHoc(PhongHoc ph)
    {
        for (PhongHoc phongHoc : danhSachPhongHoc)
        {
            if (phongHoc.equals(ph)) 
            {
                return false;
            }
        }

        danhSachPhongHoc.add(ph);
        return true;
    }

    public PhongHoc timKiemPhongHocVoiMaPhong(String maPhong)
    {
        for (PhongHoc ph : danhSachPhongHoc)
        {
            if (ph.getMaPhong().equals(maPhong))
            {
                return ph;
            }
        }

        return null;
    }

    public String layThongTinToanBoPhongHoc()
    {
        String result = "";
        for (PhongHoc ph : danhSachPhongHoc)
        {
            result += ph.getInfo() + "\n";
        }
        return result;
    }

    public String layThongTinPhongHocDatChuan()
    {
        String result = "";
        for (PhongHoc ph : danhSachPhongHoc)
        {
            if (ph.coDatChuanKhong()) 
            {
                result += ph.getInfo() + "\n";
            }
        }
        return result;
    }

    public void sapXepPhongHocTheoThuTuTangDanDayNha()
    {
        danhSachPhongHoc.sort((s1, s2) ->
        {
            return s1.getDayNha().compareTo(s2.getDayNha());
        });
    }

    public void sapXepPhongHocTheoThuTuGiamDanDienTich()
    {
        danhSachPhongHoc.sort((s1, s2) ->
        {
            if (s1.getDienTich() > s2.getDienTich())
            {
                return -1;
            }
            else if (s1.getDienTich() == s2.getDienTich())
            {
                return 0;
            }
            else
            {
                return 1;
            }
        });
    }

    public void sapXepPhongHocTheoThuTuTangDanBongDen()
    {
        danhSachPhongHoc.sort((s1, s2) ->
        {
            if (s1.getSoBongDen() < s2.getSoBongDen())
            {
                return -1;
            }
            else if (s1.getSoBongDen() == s2.getSoBongDen())
            {
                return 0;
            }
            else
            {
                return 1;
            }
        });
    }

    public void capNhatSoMayTinhVoiMaPhong()
    {
        System.out.println("Nhap ma phong can tim kiem");
        String input = Main.sc.nextLine();
        PhongHoc phongHoc = timKiemPhongHocVoiMaPhong(input);
        if (phongHoc instanceof PhongMayTinh)
        {
            ((PhongMayTinh)phongHoc).capNhatSoMayTinh();
        }
        else 
        {
            System.out.println("Khong tim thay phong hoc!");
        }
    }

    public boolean xoaPhongHocWithMaPhong()
    {
        System.out.println("Nhap ma phong can xoa: ");
        String input = Main.sc.nextLine();
        PhongHoc phongHoc = timKiemPhongHocVoiMaPhong(input);
        if (phongHoc == null)
        {
            System.out.println("Khong tim thay phong hoc");
            return false;
        }
        else
        {
            System.out.print("Ban co chac chan muon xoa? Y/N: ");
            String sure = Main.sc.nextLine();
            if (sure.equals("Y") || sure.equals("y"))
            {
                danhSachPhongHoc.remove(phongHoc);
                return true;
            }
            else
            {
                return false;
            }
        }
    }

    public int tinhTongSoPhongHOc()
    {
        return danhSachPhongHoc.size();
    }

    public ArrayList<PhongHoc> danhSachPhongHocCo60May()
    {
        ArrayList<PhongHoc> result = new ArrayList<>();
        for (PhongHoc ph : danhSachPhongHoc)
        {
            if (ph instanceof PhongMayTinh && ((PhongMayTinh)ph).getSoMayTinh() >= 60)
            {
                result.add(ph);
            }
        }
        return result;
    }
}