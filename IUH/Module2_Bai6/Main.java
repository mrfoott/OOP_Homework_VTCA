import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static Scanner sc = new Scanner(System.in);
    public static QuanLyPhongHoc qlph = new QuanLyPhongHoc();

    public static void mainMenu()
    {
        boolean isStop = false;
        while (!isStop)
        {
            System.out.println("=====Quan Ly Phong Hoc=====");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Tim kiem phong theo ma so");
            System.out.println("2. In toan bo danh sach phong hoc");
            System.out.println("3. In danh sach phong hoc dat chuan");
            System.out.println("4. Sap xep danh sach tang dan theo day nha");
            System.out.println("5. Sap xep danh sach giam dan theo dien tich");
            System.out.println("6. Sap xep danh sach tang dan theo bong den");
            System.out.println("7. Cap nhap so may tinh theo ma so phong hoc");
            System.out.println("8. Xoa phong hoc theo ma so");
            System.out.println("9. Tong so luong phong hoc");
            System.out.println("10. In danh sach cac phong hoc may tinh co so may tinh tren 60");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                    isStop = true;
                    break;
                case "1":
                    {
                        System.out.println("Nhap ma so can tim kiem");
                        String input = sc.nextLine();
                        PhongHoc ph = qlph.timKiemPhongHocVoiMaPhong(input);
                        if (ph == null)
                        {
                            System.out.println("Khong tim thay phong hoc voi ma so tren");
                        }
                        else
                        {
                            System.out.println(ph.getInfo());
                        }
                        break;
                    }
                case "2":
                    {
                        System.out.println(qlph.layThongTinToanBoPhongHoc());
                        break;
                    }
                case "3":
                    {
                        System.out.println(qlph.layThongTinPhongHocDatChuan());
                        break;
                    }
                case "4":
                    {
                        qlph.sapXepPhongHocTheoThuTuTangDanDayNha();
                        System.out.println(qlph.layThongTinPhongHocDatChuan());
                        break;
                    }
                case "5":
                    {
                        qlph.sapXepPhongHocTheoThuTuGiamDanDienTich();
                        System.out.println(qlph.layThongTinToanBoPhongHoc());
                        break;
                    }
                case "6":
                    {
                        qlph.sapXepPhongHocTheoThuTuTangDanBongDen();
                        System.out.println(qlph.layThongTinToanBoPhongHoc());
                        break;
                    }
                case "7":
                    {
                        qlph.capNhatSoMayTinhVoiMaPhong();
                        break;
                    }
                case "8":
                    {
                        qlph.xoaPhongHocWithMaPhong();
                        break;
                    }
                case "9":
                    {
                        System.out.println("Tong so luong phong hoc: " + qlph.tinhTongSoPhongHOc());
                        break;
                    }
                case "10":
                    {
                        ArrayList<PhongHoc> list = qlph.danhSachPhongHocCo60May();
                        for (PhongHoc ph : list)
                        {
                            System.out.println(ph.getInfo());
                        }
                        break;
                    }
                default:
                    {
                        System.out.println("Lenh Khong Xac Dinh!!!");
                        break;
                    }
            }
        }
    }

    public static void main(String[] args) 
    {
        PhongHocLyThuyet ph1 = new PhongHocLyThuyet("0001", "A", 15.0, 4, true);
        PhongHocLyThuyet ph2 = new PhongHocLyThuyet("0002", "B", 15.5, 4, true);
        PhongHocLyThuyet ph3 = new PhongHocLyThuyet("0003", "C", 22.5, 2, false);
        PhongHocLyThuyet ph4 = new PhongHocLyThuyet("0004", "D", 12.0, 1, false);

        PhongMayTinh ph5 = new PhongMayTinh("0005", "A", 30, 5, 15);
        PhongMayTinh ph6 = new PhongMayTinh("0006", "A", 22, 5, 10);
        PhongMayTinh ph7 = new PhongMayTinh("0007", "B", 60, 10, 60);
        PhongMayTinh ph8 = new PhongMayTinh("0008", "A", 50, 1, 2);

        PhongThiNghiem ph9 = new PhongThiNghiem("0009", "A", 40, 10, "Hoa", 40, true);
        PhongThiNghiem ph10 = new PhongThiNghiem("0010", "B", 50, 15, "Ly", 50, false);
        PhongThiNghiem ph11 = new PhongThiNghiem("0011", "C", 20, 2, "Hoa", 10, true);
        PhongThiNghiem ph12 = new PhongThiNghiem("0012", "D", 25, 5, "Sinh", 20, false);

        qlph.themPhongHoc(ph1);
        qlph.themPhongHoc(ph2);
        qlph.themPhongHoc(ph3);
        qlph.themPhongHoc(ph4);
        qlph.themPhongHoc(ph5);
        qlph.themPhongHoc(ph6);
        qlph.themPhongHoc(ph7);
        qlph.themPhongHoc(ph8);
        qlph.themPhongHoc(ph9);
        qlph.themPhongHoc(ph10);
        qlph.themPhongHoc(ph11);
        qlph.themPhongHoc(ph12);
        
        mainMenu();
    }
}