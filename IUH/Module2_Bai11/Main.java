import java.io.IOException;
import java.util.Scanner;

public class Main 
{
    public static void clearScreen() 
    {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    public static void mainMenu() throws IOException
    {
        QuanLy ql = new QuanLy();
        Scanner sc = new Scanner(System.in);
        boolean isStop = false;
        while (!isStop)
        {
            clearScreen();
            System.out.println("==== Chuong trinh quan ly nha ga =====");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them khach hang vao hang cho");
            System.out.println("2. Ban ve cho khach hang");
            System.out.println("3. Hien thi danh sach khach hang dang cho ve");
            System.out.println("4. Huy khach hang ra khoi danh sach");
            System.out.println("5. Thong ke tinh hinh ban ve");
            System.out.println("6. Luu danh sach vao file");
            System.out.println("7. Hien thi danh sach cac ga dang co ve cho va so luong ve cho");
            String userInput = sc.nextLine();
            switch (userInput)
            {
                case "0":
                {
                    System.out.println("Cam on ban da su dung chuong trinh!!!");
                    isStop = true;
                    break;
                }
                case "1":
                {
                    ql.themKhachHangVaoHangDoi();
                    break;
                }
                case "2":
                {
                    ql.banVeChoKhach();
                    break;
                }
                case "3":
                {
                    ql.hienThiDanhSachKhachHangCho();
                    break;
                }
                case "4":
                {
                    System.out.print("Nhap id khach hang can huy: ");
                    String id = sc.nextLine();
                    ql.huyKhachHangRaKhoiDanhSach(id);
                    break;
                }
                case "5":
                {
                    ql.thongKeTinhHinh();
                    break;
                }
                case "6":
                {
                    ql.luuDanhSachVaoFile();
                    break;
                }
                case "7":
                {
                    ql.hienThiDanhSachCacGaDangChoMuaVeVaSoVeTuongUng();
                    break;
                }
                default:
                {
                    System.out.println("Unknown Command!");
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;
                }
            }
        }
        sc.close();
    }
    public static void main(String[] args) throws IOException
    {
        mainMenu();
    }   
}