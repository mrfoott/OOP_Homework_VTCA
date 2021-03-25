public class Main 
{
    public static void main(String[] args)
    {
        Person ps1 = new Student("Tran Van Dang", "99 Dong Khoi", 7.8, 8.1);
        Person ps2 = new Student("Nguyen Van Thanh", "30 Nguyen Hue", 9.5, 9.5);
        Person ps3 = new Student("Ly Thi Thu Thuy", "44/12 Ly Thuong Kiet", 4.5, 5);
        Person ps4 = new Employee("Nguyen Tran An Minh", "122 Dong Den", 1.3);
        Person ps5 = new Employee("Hua Van Cuong", "33 CMT8", 2);
        Person ps6 = new Employee("Chuong Minh Tuyen", "66 3/2", 5.6);
        Person ps7 = new Customer("A. Sang", "1 KBT", "Nhua BM", 750000000);
        Person ps8 = new Customer("A. Cuong", "4 KBT", "Dau DO", 500000000);
        Person ps9 = new Customer("A. Minh", "9 KBT", "Su AM", 45000000);

        Management mn = new Management();
        mn.themNguoi(ps1);
        mn.themNguoi(ps2);
        mn.themNguoi(ps3);
        mn.themNguoi(ps4);
        mn.themNguoi(ps5);
        mn.themNguoi(ps6);
        mn.themNguoi(ps7);
        mn.themNguoi(ps8);
        mn.themNguoi(ps9);
        mn.themNguoi(new Student("A", "Gam cau", 6.2, 6.6));
        mn.xoaNguoiVoiTen("Nguyen Tran An Minh");
        mn.xuatDanhSach();
        System.out.println("=================================SORT=================================");
        mn.sapXepTheoTen();
        mn.xuatDanhSach();
    }
}