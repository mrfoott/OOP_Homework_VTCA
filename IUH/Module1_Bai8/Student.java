import java.text.DecimalFormat;

public class Student extends Person 
{
    private double diemMonHoc1;
    private double diemMonHoc2;

    public Student()
    {
        super();
        this.diemMonHoc1 = 0.0;
        this.diemMonHoc2 = 0.0;
    }

    public Student(String hoTen, String diaChi, double diemMonHoc1, double diemMonHoc2)
    {
        super(hoTen, diaChi);

        if (diemMonHoc1 > 0.0 && diemMonHoc1 < 10.0)
        {
            this.diemMonHoc1 = diemMonHoc1;
        }
        else
        {
            this.diemMonHoc1 = 0.0;
        }

        if (diemMonHoc2 > 0.0 && diemMonHoc2 < 10.0)
        {
            this.diemMonHoc2 = diemMonHoc2;
        }
        else
        {
            this.diemMonHoc2 = 0.0;
        }
    }

    public double tinhDiemTrungBinh()
    {
        return (diemMonHoc1 + diemMonHoc2) / 2;
    }

    @Override
    public String danhGia()
    {
        if (tinhDiemTrungBinh() > 0.0 && tinhDiemTrungBinh() >= 3.0)
        {
            return "Hoc Luc Kem";
        }
        else if (tinhDiemTrungBinh() < 5 && tinhDiemTrungBinh() >= 3.0)
        {
            return "Hoc Luc Yeu";
        }
        else if (tinhDiemTrungBinh() < 6.5 && tinhDiemTrungBinh() >= 5.0)
        {
            return "Hoc Luc Trung Binh";
        }
        else if (tinhDiemTrungBinh() < 8.0 && tinhDiemTrungBinh() >= 6.5)
        {
            return "Hoc Luc Kha";
        }
        else if (tinhDiemTrungBinh() < 9.0 && tinhDiemTrungBinh() >= 8.0)
        {
            return "Hoc Luc Gioi";
        }
        else
        {
            return "Hoc Luc Xuat Sac";
        }
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.0");
        return String.format("%-30s %-30s %15s %20s", hoTen, diaChi, df.format(tinhDiemTrungBinh()), danhGia());
    }
}