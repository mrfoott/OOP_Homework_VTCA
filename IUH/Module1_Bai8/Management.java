import java.util.ArrayList;

public class Management
{
    private ArrayList<Person> danhSachNguoi = new ArrayList<>();

    public Management()
    {
    
    }

    public boolean themNguoi(Person person)
    {
        danhSachNguoi.add(person);
        return true;
    }
    
    public boolean xoaNguoiVoiTen(String name)
    {
        for (int i = 0; i < danhSachNguoi.size(); i++)
            if (danhSachNguoi.get(i).getHoTen().equals(name))
            {
                danhSachNguoi.remove(i);
                return true;
            }
                
        return false;
    }

    public void sapXepTheoTen()
    {
        danhSachNguoi.sort((s1, s2) ->
        {
            return s1.getHoTen().compareTo(s2.getHoTen());
        });
    }

    public void xuatDanhSach()
    {
        System.out.println("Danh sach hoc sinh: ");
        System.out.printf("%-30s %-30s %12s %12s %12s %-15s\n", "Ho Ten", "Dia chi", "Diem Mon 1", "Diem mon 2", "Diem trung binh", "Danh gia");
        for (Person p : danhSachNguoi)
        {
            if (p instanceof Student)
            {
                System.out.println(p);
            }
        }

        System.out.println();
        System.out.println("Danh sach nhan vien: ");
        System.out.printf("%-30s %-30s %12s %25s %20s\n", "Ho Ten", "Dia chi", "He so luong", "Tien luong", "Danh gia");
        for (Person p : danhSachNguoi)
        {
            if (p instanceof Employee)
            {
                System.out.println(p);
            }
        }

        System.out.println();
        System.out.println("Danh sach khach hang: ");
        System.out.printf("%-30s %-30s %-25s %25s %20s\n", "Ho ten", "Dia chi", "Ten cong ty", "Tri gia hoa don", "Danh gia");
        for (Person p : danhSachNguoi)
        {
            if (p instanceof Customer)
            {
                System.out.println(p);
            }
        }
    }
}