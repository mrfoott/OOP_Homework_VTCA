public class HocVien
{
    private String hoTen;
    private int namSinh;
    private MonHoc[] monHoc = new MonHoc[5];

    public HocVien()
    {
        hoTen = "null";
        namSinh = 1950;
        monHoc[0] = new MonHoc("Ngu Van", 0.0);
        monHoc[1] = new MonHoc("Toan", 0.0);
        monHoc[2] = new MonHoc("Tieng Anh", 0.0);
        monHoc[3] = new MonHoc("Vat Ly", 0.0);
        monHoc[4] = new MonHoc("Hoa Hoc", 0.0);
    }

    public HocVien(String hoTen, int namSinh, MonHoc[] monHoc)
    {
        if (!hoTen.trim().equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (namSinh >= 1950 && namSinh <= 2003)
        {
            this.namSinh = namSinh;
        }
        else
        {
            this.namSinh = 1950;
        }

        this.monHoc = monHoc;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public int getNamSinh()
    {
        return namSinh;
    }

    public double getDiemTrungBinh()
    {
        double diemTong = 0.0;
        for (int i = 0; i < monHoc.length; i++)
        {
            diemTong += monHoc[i].getDiemMonHoc();
        }
        return diemTong / monHoc.length;
    }

    private boolean khongCoMonNaoDuoiNam()
    {
        for (MonHoc mh : monHoc)
        {
            if (mh.getDiemMonHoc() < 5.0)
            {
                return false;
            }
        }
        return true;
    }

    public String danhGia()
    {
        if (getDiemTrungBinh() > 7 && khongCoMonNaoDuoiNam())
        {
            return "Duoc Lam Luan Van";
        }
        else if (getDiemTrungBinh() >= 5 && khongCoMonNaoDuoiNam())
        {
            return "Duoc Thi Tot Nghiep";
        }
        else
        {    
            return "Duoc Thi Lai";
        }
    }

    public String getDSMonThiLai()
    {
        String result = "";
        for (MonHoc mh : monHoc)
        {
            if (mh.getDiemMonHoc() < 5)
            {
                result += mh.getTenMonHoc() + " - ";
            }
        }
        return result;
    }
}