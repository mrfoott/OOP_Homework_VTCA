public class Main 
{
    public static void main(String[] args) throws Exception
    {
        CongNhan cn1 = new CongNhan(134632, "Tran", "Sang", 178);
        CongNhan cn2 = new CongNhan(254563, "Nguyen", "Ha", 341);
        CongNhan cn3 = new CongNhan(432685, "Le", "Cuong", 17);
        CongNhan cn4 = new CongNhan(334232, "Ho", "Trang", 233);
        CongNhan cn5 = new CongNhan(685489, "Dinh", "Thuy", 117);
        CongNhan cn6 = new CongNhan(457128, "Vo", "Diem", 457);

        DanhSachCongNhan danhSachCongNhan = new DanhSachCongNhan(10);
        danhSachCongNhan.add(cn1);
        danhSachCongNhan.add(cn2);
        danhSachCongNhan.add(cn3);
        danhSachCongNhan.add(cn4);
        danhSachCongNhan.add(cn5);
        danhSachCongNhan.add(cn6);

        System.out.println(danhSachCongNhan.toString());
        System.out.println("So Luong Cong Nhan: " + danhSachCongNhan.soLuongCongNhan());
        System.out.println("Cac Cong Nhan co so SP tren 200: ");
        danhSachCongNhan.congNhanLamTren200SanPham();
        System.out.println("==========================================================");
        System.out.println("Cac cong nhan duoc sap xep theo so luong san pham giam dan");
        danhSachCongNhan.sapXepCongNhanTheoSoSanPhamGiamDan();
        System.out.println(danhSachCongNhan);
    }    
}