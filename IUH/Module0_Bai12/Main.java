import java.time.LocalDate;
import java.util.Scanner;

public class Main 
{
    private static Scanner sc = new Scanner(System.in);
    private static QuanLyHocVien qlhv; 
    private static QuanLyKhoaHoc qlkh;

    public static void mainMenu()
    {
        qlhv = new QuanLyHocVien();
        qlkh = new QuanLyKhoaHoc();

        HocVien hv1 = new HocVien("Nguyen Van Teo", "35 duong Bui Thi Xua", "0123456789");
        HocVien hv2 = new HocVien("Tran Van Ti", "187 duong Le Dai Hanh", "9876543210");
        KhoaHoc kh1 = new KhoaHoc("Khoa hoc Thiet Ke Web", LocalDate.of(2021, 1, 3) , 75);
        KhoaHoc kh2 = new KhoaHoc("Khoa hoc Lam Game", LocalDate.of(2021, 4, 3) , 100);
        
        qlkh.themKhoaHoc(kh1);
        qlkh.themKhoaHoc(kh2);

        qlhv.themHocVien(hv1);
        qlhv.themHocVien(hv2);

        kh1.themHocVienVaoKhoaHoc(hv1);
        kh2.themHocVienVaoKhoaHoc(hv2);
        

        boolean isStop = false;
        while (!isStop)
        {
            System.out.println("Chuong trinh quan ly hoc vien va khoa hoc!!!");
            System.out.println("0. Thoat Chuong Trinh");
            System.out.println("1. Quan Ly Hoc Vien");
            System.out.println("2. Quan Ly Khoa Hoc");
            System.out.print("> ");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                {
                    isStop = true;
                    System.out.println("Cam on ban da su dung chuong trinh");
                    break;
                }
                case "1":
                {
                    menuHocVien();
                    break;
                }
                case "2":
                {
                    menuKhoaHoc();
                    break;
                }
            }     
        }
    }

    public static void menuHocVien()
    {
        boolean isBack = false;
        while (!isBack)
        {
            System.out.println("0. Tro Ve Trang Truoc");
            System.out.println("1. Them Hoc Vien");
            System.out.println("2. Tim Kiem Hoc Vien");
            System.out.println("3. Them khoa hoc vao hoc vien");
            System.out.print("> ");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                {
                    isBack = true;
                    break;
                }
                case "1":
                {
                    HocVien hocVienMoi = HocVien.taoHocVienBangInput();
                    if (qlhv.themHocVien(hocVienMoi))
                        System.out.println("Da them hoc vien");
                    else   
                        System.out.println("List da day");
                    break;
                }
                case "2":
                {
                   

                    System.out.println("Nhap so dien thoai cua hoc vien");
                    String temp = sc.nextLine();
                    HocVien hvCanTim = qlhv.timHocVienBangSoDienThoai(temp);
                    if (hvCanTim != null)
                    {
                        System.out.println(hvCanTim.inChiTietHocVien());
                    }
                    else
                    {
                        System.out.println("Khong tim thay hoc vien!!!");
                    }
                    break;
                }
                case "3":
                {
                    System.out.println("Nhap so dien thoai hoc vien ban muon them khoa hoc vao: ");
                    HocVien hvCanTim = qlhv.timHocVienBangSoDienThoai(sc.nextLine());
                    if (hvCanTim != null)
                    {
                        System.out.println("Da tim thay hoc vien " + hvCanTim.getHoTen());
                        System.out.println("Nhap ten khoa hoc muon them vao");
                        KhoaHoc kh = qlkh.timKhoaHocTheoTen(sc.nextLine());
                        if (kh != null)
                        {
                            hvCanTim.addKhoaHocVaoHocVien(kh);
                            System.out.println("Da them khoa hoc "+ kh.getTenKhoaHoc() +" vao hoc vien " + hvCanTim.getHoTen());
                        }
                        else   
                        {
                            System.out.println("Khong co khoa hoc do");
                        }
                    }
                    break;
                }
            }   
        }
    }

    public static void menuKhoaHoc()
    {
        boolean isBack = false;
        while (!isBack)
        {
            clearScreen();
            System.out.println("0. Tro ve chuong trinh chinh");
            System.out.println("1. Them Khoa Hoc");
            System.out.println("2. Them hoc vien vao khoa hoc");
            System.out.println("3. Tim Khoa Hoc theo ten");
            System.out.println("4. In Khoa Hoc chua ket thuc");
            System.out.println("5. In Khoa hoc chua bat dau");
            System.out.println("6. In Khoa hoc da ket thuc");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                {
                    isBack = true;
                    break;
                }
                case "1":
                {
                    KhoaHoc kh = KhoaHoc.taoKhoaHocBangInput();
                    qlkh.themKhoaHoc(kh);
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
                case "2":
                {
                    System.out.println("Nhap ten khoa hoc:");
                    String tenKhoaHoc = sc.nextLine();
                    KhoaHoc kh = qlkh.timKhoaHocTheoTen(tenKhoaHoc);
                    if (kh == null)
                    {
                        System.out.println("Khong tim thay Khoa hoc de them vao");
                    }
                    else
                    {
                        HocVien hv = HocVien.taoHocVienBangInput();
                        kh.themHocVienVaoKhoaHoc(hv);
                    }
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
                case "3":
                {
                    clearScreen();
                    System.out.println("Nhap ten khoa hoc: ");
                    String tenKhoaHoc = sc.nextLine();
                    KhoaHoc kh = qlkh.timKhoaHocTheoTen(tenKhoaHoc);
                    if (kh == null)
                    {
                        System.out.println("Khong tim thay khoa hoc");
                    }
                    else
                    {
                        System.out.println("Chi Tiet Khoa Hoc: ");
                        kh.inChiTietKhoaHoc();
                        System.out.println("Danh sach hoc vien: ");
                        kh.inDanhSachHocVienTrongKhoaHoc();
                    }
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "4":
                {
                    clearScreen();
                    System.out.println("Khoa hoc chua ket thuc: ");
                    qlkh.inKhoaHocDaBatDauNhungChuaKetThuc();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "5":
                {
                    clearScreen();
                    System.out.println("Khoa hoc chua bat dau: ");
                    qlkh.inKhoaHocChuaBatDau();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                case "6":
                {
                    clearScreen();
                    System.out.println("Khoa hoc chua bat dau: ");
                    qlkh.inKhoaHocDaKetThuc();
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
                default:
                {
                    clearScreen();
                    System.out.println("Unknown Command");
                    System.out.println("nhan enter de quay lai");
                    sc.nextLine();
                    break;
                }
            }
        }
    }

    private static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void main(String[] args)
    {
       
        mainMenu();
    }
}


