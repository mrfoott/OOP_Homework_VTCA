import java.util.ArrayList;

public class DanhSachCongNhan 
{
    private ArrayList<CongNhan> dscn = new ArrayList<>();
    private int maxSize;

    public DanhSachCongNhan(int n) throws Exception
    {
        if (n > 0)
        {
            maxSize = n;
            dscn.ensureCapacity(n);
        }
        else
        {
            throw new Exception("So luong khong hop le");
        }
    }

    public boolean add(CongNhan cn)
    {
        if (dscn.size() == maxSize)
        {
            return false;
        }
        else
        {
            dscn.add(cn);
            return true;
        }
    }

    public String toString()
    {
        String ketqua = "";
        for (CongNhan cn : dscn)
        {
            ketqua += cn.toString() + "\n";
        }
        return ketqua;
    }

    public int soLuongCongNhan()
    {
        return dscn.size();
    }

    public void congNhanLamTren200SanPham()
    {
        for (CongNhan cn : dscn)
        {
            if (cn.getMSoSP() > 200)
            {
                System.out.println(cn);
            }
        }
    }

    public void sapXepCongNhanTheoSoSanPhamGiamDan()
    {
        dscn.sort((s1, s2) ->
        {
            if (s1.getMSoSP() < s2.getMSoSP())
            {
                return -1;
            }
            else
            {
                return 1;
            }
        });
    }
}
