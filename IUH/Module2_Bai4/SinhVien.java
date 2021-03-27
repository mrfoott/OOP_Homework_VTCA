public class SinhVien
{
    private String maSoSinhVien;
    private String hoTen;
    private int namSinh;

    public SinhVien(String maSoSinhVien, String hoTen, int namSinh)
    {
        this.maSoSinhVien = maSoSinhVien;
        this.hoTen = hoTen;
        this.namSinh = namSinh;
    }

    public String getMaSoSinhVien() 
    {
        return maSoSinhVien;
    }

    public String getHoTen() 
    {
        return hoTen;
    }

    public void setHoTen(String hoTen) 
    {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getInfo()
    {
        return String.format("%-20s %-25s %15d", maSoSinhVien, hoTen, namSinh);
    }

    public boolean equals(SinhVien sv)
    {
        return (maSoSinhVien == sv.getMaSoSinhVien()) ? true : false;
    }
}