import java.util.ArrayList;

public class QuanLySinhVien 
{
    private ArrayList<SinhVien> danhSachSinhVien = new ArrayList<>();

    public void themSinhVien(SinhVien svToAdd)
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            if (sv.equals(svToAdd)) 
            {
                return;
            }
        }
        danhSachSinhVien.add(svToAdd);
    }    


    public void xoaSinhVien(String maSoSinhVien)
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            if (sv.getMaSoSinhVien().equals(maSoSinhVien))
            {
                danhSachSinhVien.remove(sv);
            }
        }
    }

    public void suaSinhVien(String maSoSinhVien) throws NumberFormatException
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            if (sv.getMaSoSinhVien().equals(maSoSinhVien))
            {
                System.out.println("Ho ten cu: " + sv.getHoTen());
                System.out.println("Nam sinh cu: " + sv.getNamSinh());
                System.out.print("Ho ten moi: ");
                String hoTenMoi = Main.sc.nextLine();
                System.out.print("Nam sinh moi: ");
                int namSinhMoi = Integer.parseInt( Main.sc.nextLine( ) );
                sv.setHoTen(hoTenMoi);
                sv.setNamSinh(namSinhMoi);
            }
        }
    }

    public SinhVien getSinhVienTheoMa(String maSoSinhVien)
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            if (sv.getMaSoSinhVien().equals(maSoSinhVien))
            {
                return sv;
            }
        }

        return null;
    }

    public SinhVien getSinhVienTheoTen(String hoTen)
    {
        for (SinhVien sv : danhSachSinhVien)
        {
            if (sv.getHoTen().equals(hoTen))
            {
                return sv;
            }
        }

        return null;
    }

    public void sapXepDanhSachVoiTenTangDan()
    {
        danhSachSinhVien.sort((s1, s2) ->
        {
            return s1.getHoTen().compareTo(s2.getHoTen());
        });
    }

    public void inDanhSachSinhVien()
    {
        System.out.printf("%-20s %-25s %15s\n", "Ma So Sinh Vien", "Ho Va Ten", "Nam Sinh");
        for (SinhVien sv : danhSachSinhVien)
        {
            System.out.println(sv.getInfo());
        }
    }
}