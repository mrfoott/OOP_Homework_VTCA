import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args)
    {
        MonHoc[] mh1 = new MonHoc[5];
        mh1[0] = new MonHoc("Ngu Van", 3.0);
        mh1[1] = new MonHoc("Toan", 9.7);
        mh1[2] = new MonHoc("Tieng Anh", 4);
        mh1[3] = new MonHoc("Vat Ly", 5);
        mh1[4] = new MonHoc("Hoa Hoc", 1);
        HocVien hv1 = new HocVien("Nguyen Van A", 1997, mh1);

        MonHoc[] mh2 = new MonHoc[5];
        mh2[0] = new MonHoc("Ngu Van", 7);
        mh2[1] = new MonHoc("Toan", 10);
        mh2[2] = new MonHoc("Tieng Anh", 8);
        mh2[3] = new MonHoc("Vat Ly", 2);
        mh2[4] = new MonHoc("Hoa Hoc", 4);
        HocVien hv2 = new HocVien("Ly Thi B", 2001, mh2);

        MonHoc[] mh3 = new MonHoc[5];
        mh3[0] = new MonHoc("Ngu Van", 10);
        mh3[1] = new MonHoc("Toan", 10);
        mh3[2] = new MonHoc("Tieng Anh", 10);
        mh3[3] = new MonHoc("Vat Ly", 10);
        mh3[4] = new MonHoc("Hoa Hoc", 10);
        HocVien hv3 = new HocVien("Tran Thi C", 1999, mh3);

        MonHoc[] mh4 = new MonHoc[5];
        mh4[0] = new MonHoc("Ngu Van", 5);
        mh4[1] = new MonHoc("Toan", 5);
        mh4[2] = new MonHoc("Tieng Anh", 5);
        mh4[3] = new MonHoc("Vat Ly", 5);
        mh4[4] = new MonHoc("Hoa Hoc", 5);
        HocVien hv4 = new HocVien("Lam Thi D", 1987, mh4);

        MonHoc[] mh5 = new MonHoc[5];
        mh5[0] = new MonHoc("Ngu Van", 7);
        mh5[1] = new MonHoc("Toan", 7);
        mh5[2] = new MonHoc("Tieng Anh", 7);
        mh5[3] = new MonHoc("Vat Ly", 7);
        mh5[4] = new MonHoc("Hoa Hoc", 7);
        HocVien hv5 = new HocVien("Ha Van E", 2000, mh5);

        ArrayList<HocVien> listHocVien = new ArrayList<>();
        listHocVien.add(hv1);
        listHocVien.add(hv2);
        listHocVien.add(hv3);
        listHocVien.add(hv4);   
        listHocVien.add(hv5);

        int temp = 0;
        System.out.println("So Hoc Vien duoc lam luan van: ");
        for (HocVien hv : listHocVien)
        {
            if (hv.danhGia().equals("Duoc Lam Luan Van"))
            {
                temp++;
            }
        }
        System.out.println(temp);

        temp = 0;
        System.out.println("So Hoc Vien duoc thi tot nghiep: ");
        for (HocVien hv : listHocVien)
        {
            if (hv.danhGia().equals("Duoc Thi Tot Nghiep") || hv.danhGia().equals("Duoc Lam Luan Van"))
            {
                temp++;
            }
        }
        System.out.println(temp);

        temp = 0;
        System.out.println("So Hoc Vien duoc thi lai: ");
        for (HocVien hv : listHocVien)
        {
            if (hv.danhGia().equals("Duoc Thi Lai"))
            {
                temp++;
            }
        }
        System.out.println(temp);
        
        System.out.println("DS HV va mon thi lai: ");
        for (HocVien hv : listHocVien)
        {
            if (hv.danhGia().equals("Duoc Thi Lai"))
            {
                System.out.println(hv.getHoTen());
                System.out.println(hv.getDSMonThiLai()); 
            } 
        }
    }
}
