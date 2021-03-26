public class Main 
{
    public static void main(String[] args)
    {
        Xe xe1 = new XeDap("Martin", "@", "Trang", 9000000);
        Xe xe2 = new XeMay("Honda", "Future FI 125", "Do", 28000000);
        Xe xe3 = new XeOtoKhach("Mitsubishi", "Xpander", "Den", 375000000, 7);
        Xe xe4 = new XeOtoKhach("Honda", "Civic", "Den", 425000000, 4);
        Xe xe5 = new XeOtoTai("Huyndai", "HINO", "Xanh", 400000000);

        QuanLyXe ql = new QuanLyXe();

        ql.themXeVaoDanhSach(xe1);
        ql.themXeVaoDanhSach(xe2);
        ql.themXeVaoDanhSach(xe3);
        ql.themXeVaoDanhSach(xe4);
        ql.themXeVaoDanhSach(xe5);

        ql.inCacXeCoTrongDanhSach();
    }    
}
