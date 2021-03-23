import java.time.LocalDate;
import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        ArrayList<HoaDonTienDien> danhSachHoaDonTienDien = new ArrayList<>();

        HoaDonTienDien hoaDon1 = new HoaDonTienTienVietNam("792", "Tran Thi Cuc", LocalDate.of(2019, 8, 22), 55, 3000.0, "Sinh Hoat", 50);
        HoaDonTienDien hoaDon2 = new HoaDonTienTienVietNam("239", "Nguyen Quang Dinh", LocalDate.of(2019, 8, 22), 150, 2500.0, "Kinh Doanh", 100);
        HoaDonTienDien hoaDon3 = new HoaDonTienTienVietNam("153", "Dinh Thi Mui", LocalDate.of(2019, 8, 21), 1200, 2200.0, "San Xuat", 150);
        HoaDonTienDien hoaDon4 = new HoaDonTienDienNuocNgoai("634", "John Josep", LocalDate.of(2019, 8, 22), 45, 3500.0, "Hungrary");
        HoaDonTienDien hoaDon5 = new HoaDonTienDienNuocNgoai("561", "Carde Suelle", LocalDate.of(2019, 8, 20), 55, 3500.0, "Italy");
        HoaDonTienDien hoaDon6 = new HoaDonTienDienNuocNgoai("452", "METLAMROI", LocalDate.of(2019, 8, 20), 65, 3500.0, "Spain");

        danhSachHoaDonTienDien.add(hoaDon1);
        danhSachHoaDonTienDien.add(hoaDon2);
        danhSachHoaDonTienDien.add(hoaDon3);
        danhSachHoaDonTienDien.add(hoaDon4);
        danhSachHoaDonTienDien.add(hoaDon5);
        danhSachHoaDonTienDien.add(hoaDon6);

        int iVN = 0, iNN = 0;
        double trungBinh = 0.0;
        int count = 0;
        for (HoaDonTienDien hd : danhSachHoaDonTienDien)
        {
            if (hd instanceof HoaDonTienTienVietNam)
            {
                iVN++;
            }
            else if (hd instanceof HoaDonTienDienNuocNgoai)
            {
                iNN++;
                trungBinh += hd.thanhTien();
                count++;
            }
        }
                
        if (count != 0)
        {
            trungBinh /= (double) count;
        }
        else
        {
            trungBinh = 0;
        }

        System.out.println("Tong so luong tung loai khach hang: ");
        System.out.println("Nguoi VN: " + iVN);
        System.out.println("Nguoi NN: " + iNN);
        System.out.println("Trung binh thanh tien cua nuoc ngoai: " + trungBinh);

        System.out.println("Cac hoa don trong ngay 22/08/2019 la: ");
        for (HoaDonTienDien hd : danhSachHoaDonTienDien)
        {
            if (hd.getNgayLapHoaDon().isEqual(LocalDate.of(2019, 8, 22)))
            {
                System.out.println(hd.getInfo());
            }
        }
    }    
}
