import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class Main
{
    public static void main(String[] args) 
    {
        ArrayList<ChuyenXe> danhSachChuyenXe = new ArrayList<>();
        
        ChuyenXe chuyenXe1 = new ChuyenXeNgoaiThanh("0003", "Nguyen Van Chien", 
                                        "33456", 15000000.0, "Tien Giang", 3);
        ChuyenXe chuyenXe2 = new ChuyenXeNgoaiThanh("1321", "Tran Quang Thuc", 
                                        "34217", 20000000.0, "Kien Giang", 5);
        ChuyenXe chuyenXe3 = new ChuyenXeNoiThanh("3521", "Sang", "97241", 
                                                    8000000.0, 30, 235.3f);
        ChuyenXe chuyenXe4 = new ChuyenXeNoiThanh("1354", "Minh Chi", "42789", 
                                                    12000000.0, 25, 312.6f);

        danhSachChuyenXe.add(chuyenXe1);
        danhSachChuyenXe.add(chuyenXe2);
        danhSachChuyenXe.add(chuyenXe3);
        danhSachChuyenXe.add(chuyenXe4);

        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);

        {
            System.out.print("Tong doanh thu chuyen xe noi thanh: ");
            double doanhThuXeNoiThanh = 0.0;
            for (ChuyenXe chuyenXe : danhSachChuyenXe)
            {
                if (chuyenXe instanceof ChuyenXeNoiThanh)
                {
                    doanhThuXeNoiThanh += chuyenXe.getDoanhThu();
                }
            }
            System.out.println(nf.format(doanhThuXeNoiThanh));
        }

        {
            System.out.print("Tong doanh thu chuyen xe ngoai thanh: ");
            double doanhThuXeNgoaiThanh = 0.0;
            for (ChuyenXe chuyenXe : danhSachChuyenXe)
            {
                if (chuyenXe instanceof ChuyenXeNgoaiThanh)
                {
                    doanhThuXeNgoaiThanh += chuyenXe.getDoanhThu();
                }
            }
            System.out.println(nf.format(doanhThuXeNgoaiThanh));
        }

        {
            System.out.print("Tong doanh thu cac chuyen xe: ");
            double doanhThu = 0.0;
            for (ChuyenXe chuyenXe : danhSachChuyenXe)
            {
                doanhThu += chuyenXe.getDoanhThu();
            }
            System.out.println(nf.format(doanhThu));
        }
    }
}