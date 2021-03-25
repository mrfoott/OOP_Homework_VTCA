import java.time.LocalDate;
import java.util.Scanner;

public class Main 
{

    public static Scanner sc = new Scanner(System.in);

    private static DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa();

    private static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  

    private static void mainMenu()
    {
        HangHoa htp1 = new HangThucPham("123123", "Thit", 70000, 35, "VinaFood", LocalDate.of(2021, 3, 15), LocalDate.of(2021, 5, 15));
        HangHoa htp2 = new HangThucPham("123552", "Ca", 120000, 120, "VinaFood", LocalDate.of(2021, 3, 10), LocalDate.of(2021, 3, 18));
        HangHoa htp3 = new HangThucPham("315621", "Trung", 2500, 1300, "EggFarm", LocalDate.of(2021, 3, 14), LocalDate.of(2021, 4, 14));
        HangHoa hss1 = new HangSanhSu("231542", "Binh hoa nho", 24000, 82, "Gom Loc Phat", LocalDate.of(2021, 1, 2));
        HangHoa hss2 = new HangSanhSu("177954", "Binh hoa Vua", 30000, 112, "Gom Loc Phat", LocalDate.of(2021, 1, 1));
        HangHoa hss3 = new HangSanhSu("748222", "Binh tra", 55000, 43, "Gom Loc Phat", LocalDate.of(2021, 1, 2));
        HangHoa hdm1 = new HangDienMay("241657", "May Giat", 7000000, 12, 183, 900);
        HangHoa hdm2 = new HangDienMay("653789", "May Lanh", 15000000, 33, 183, 1200);
        HangHoa hdm3 = new HangDienMay("165946", "Ti Vi", 10000000, 55, 90, 300);

        danhSachHangHoa.themHangHoa(htp1);
        danhSachHangHoa.themHangHoa(htp2);
        danhSachHangHoa.themHangHoa(htp3);
        danhSachHangHoa.themHangHoa(hss1);
        danhSachHangHoa.themHangHoa(hss2);
        danhSachHangHoa.themHangHoa(hss3);
        danhSachHangHoa.themHangHoa(hdm1);
        danhSachHangHoa.themHangHoa(hdm2);
        danhSachHangHoa.themHangHoa(hdm3);

        boolean isStop = false;
        while (!isStop)
        {
            clearScreen();
            System.out.println("================Chuong Trinh Quan Ly Danh Sach Hang Hoa================");
            System.out.println("0. Thoat chuong trinh");
            System.out.println("1. Them hang thuc pham");
            System.out.println("2. Them hang sanh su");
            System.out.println("3. them hang dien may");
            System.out.println("4. In toan bao danh sach hang hoa");
            System.out.println("5. In danh sach hang thuc pham");
            System.out.println("6. In danh sach hang sanh su");
            System.out.println("7. In danh sach hang dien may");
            System.out.println("8. Tim kiem hang hoa theo ma hang");
            System.out.println("9. Sap xep hang hoa theo ten tang dan");
            System.out.println("10. Sap xep hang hoa theo so luong ton giam dan");
            System.out.println("11. Xuat danh sach cac hang thuc pham kho ban");
            System.out.println("12. Xoa hang hoa voi ma hang");
            System.out.println("13. Sua thong tin don gia voi ma hang");
            System.out.println("> ");
            String userInput = sc.nextLine();
            switch (userInput) 
            {
                case "0":
                    isStop = true;
                    break;

                case "1":
                    clearScreen();
                    HangThucPham hangThucPham = HangThucPham.createHangThucPhamByInput();
                    if (danhSachHangHoa.themHangHoa(hangThucPham))
                        System.out.println("Da them thanh cong");
                    else
                        System.out.println("Trung ma hang hoa hoac danh sach da day, xin thu lai");

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "2":
                    clearScreen();
                    HangSanhSu hangSanhSu = HangSanhSu.createHangSanhSuByInput();
                    if (danhSachHangHoa.themHangHoa(hangSanhSu))
                        System.out.println("Da them thanh cong");
                    else
                        System.out.println("Trung ma hang hoa hoac danh sach da day, xin thu lai");

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "3":
                    clearScreen();
                    HangDienMay hangDienMay = HangDienMay.createHangDienMayByInput();
                    if (danhSachHangHoa.themHangHoa(hangDienMay))
                        System.out.println("Da them thanh cong");
                    else
                        System.out.println("Trung ma hang hoa hoac danh sach da day, xin thu lai");

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "4":
                    clearScreen();
                    danhSachHangHoa.inDanhSachHangHoa();

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "5":
                    clearScreen();
                    danhSachHangHoa.inDanhSachHangThucPham();

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "6":
                    clearScreen();
                    danhSachHangHoa.inDanhSachHangSanhSu();

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "7":
                    clearScreen();
                    danhSachHangHoa.inDanhSachHangDienMay();

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "8":
                    clearScreen();
                    System.out.println("Nhap ma hang ban can tim kiem: ");
                    String maHangCanTim = sc.nextLine();
                    HangHoa hh = danhSachHangHoa.getHangHoaVoiMaHangHoa(maHangCanTim);
                    if (hh == null)
                        System.out.println("Khong tim thay ma hang!");
                    else
                        System.out.println(hh.getInfo());

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "9":
                    clearScreen();
                    danhSachHangHoa.sortTenHangTangDan();
                    danhSachHangHoa.inDanhSachHangHoa();
                    System.out.println("Da sap xep thanh cong!");
                    
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "10":
                    clearScreen();
                    danhSachHangHoa.sortSoLuongTonGiamDan();
                    danhSachHangHoa.inDanhSachHangHoa();
                    System.out.println("Da sap xep thanh cong!");

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "11":
                    clearScreen();
                    System.out.println("Danh sach cac mat hang kho ban: ");
                    danhSachHangHoa.inCacHangThucPhamKhoBan();

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "12":
                    clearScreen();
                    System.out.println("Nhap ma hang cua hang hoa can xoa");
                    String maHangCanXoa = sc.nextLine();
                    if (danhSachHangHoa.xoaHangHoaVoiMaHang(maHangCanXoa))
                        System.out.println("Da xoa hang hoa thanh cong");
                    else
                        System.out.println("Khong tim thay hang hoa can xoa");
                    
                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                case "13":
                    clearScreen();
                    System.out.println("Nhap ma hang cua hang hoa can sua doi don gia: ");
                    String maHangCanSuaDoi = sc.nextLine();
                    danhSachHangHoa.suaDonGiaVoiMaHang(maHangCanSuaDoi);

                    System.out.println("Nhan enter de ket thuc");
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Unknown Command!");
                    System.out.println("Press Enter to return");
                    sc.nextLine();
                    break;
            }
        }
        sc.close();
    }

    public static void main(String[] args)
    {
        mainMenu();
    }

}