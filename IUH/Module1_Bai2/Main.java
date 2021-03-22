import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> listSach = new ArrayList<>();
        Locale local = new Locale("vi", "vn");
        NumberFormat nf = NumberFormat.getInstance(local);

        Sach sach1 = new SachGiaoKhoa("982143", LocalDate.of(2021, 4, 5), 250000, 15, "NXB Tre", "Moi");
        Sach sach2 = new SachGiaoKhoa("311362", LocalDate.of(2021, 2, 3), 110000, 25, "NXB Kim Dong", "Moi");
        Sach sach3 = new SachGiaoKhoa("165842", LocalDate.of(2021, 2, 3), 134000, 40, "NXG Giao Duc", "Cu");
        Sach sach4 = new SachThamKhao("468268", LocalDate.of(2020, 12, 23), 90000, 122, "NXB Thanh Nien", 120000);
        Sach sach5 = new SachThamKhao("784136", LocalDate.of(2019, 5, 11), 220000, 78, "NXB Van Hoc", 95000);
        Sach sach6 = new SachThamKhao("158427", LocalDate.of(2021, 2, 23), 330000, 20, "NXB Tong Hop", 50000);

        listSach.add(sach1);
        listSach.add(sach2);
        listSach.add(sach3);
        listSach.add(sach4);
        listSach.add(sach5);
        listSach.add(sach6);

        double tienSachGiaoKhoa = 0.0;
        for (Sach sach : listSach)
        {
            if (sach instanceof SachGiaoKhoa)
            {
                tienSachGiaoKhoa += sach.getThanhTien();
            }
        }
        System.out.print("Tong tien sach giao khoa: ");
        System.out.println(nf.format(tienSachGiaoKhoa));

        double tienSachThamKhao = 0.0;
        for (Sach sach : listSach)
        {
            if (sach instanceof SachThamKhao)
            {
                tienSachThamKhao += sach.getThanhTien();
            }
        }
        System.out.print("Tong tien sach tham khao: ");
        System.out.println(nf.format(tienSachThamKhao));

        double trungBinhCongSachThamKhao = 0.0;
        int count = 0;
        for (Sach sach : listSach)
        {
            if (sach instanceof SachThamKhao)
            {
                count++;
                trungBinhCongSachThamKhao += sach.getDonGia();
            }
        }
        if (count > 0)
        {
            System.out.println();
            System.out.print("Trung binh cong don gia cua sach tham khao: " );
            System.out.println(nf.format(trungBinhCongSachThamKhao / (double) count));
        }

        System.out.print("Nhap nha xuat ban: ");
        String nxb = sc.nextLine();
        System.out.println("Sach giao khoa cua " + nxb + ": ");
        for (Sach sach : listSach)
        {
            if ((sach instanceof SachGiaoKhoa) && (sach.getNhaXuatBan().trim().equals(nxb)))
            {
                System.out.println(sach.inThongTinSach());
            }
        }
        System.out.println("Sach tham khao cua " + nxb + ": ");
        for (Sach sach : listSach)
        {
            if ((sach instanceof SachThamKhao) && (sach.getNhaXuatBan().trim().equals(nxb)))
            {
                System.out.println(sach.inThongTinSach());
            }
        }

        sc.close();
    }    
}
