import java.util.ArrayList;

public class CDList 
{
    private ArrayList<CD> cdList = new ArrayList<>();
    private int maximum;

    private boolean trungMaDia(CD cd)
    {
        for (int i = 0; i < cdList.size(); i++)
        {
            if (cd.getMaCD() == cdList.get(i).getMaCD())
            {
                return true;
            }
        }
        return false;
    }

    public CDList(int n) throws Exception
    {
        if (n > 0)
        {
            cdList.ensureCapacity(n);
            maximum = n;
        }
        else
        {
            throw new Exception("Gia tri nhap vao khong hop le");
        }
    }

    public boolean add(CD cd)
    {
        if ((cdList.size() == maximum) || trungMaDia(cd))
        {
            return false;
        }
        else
        {
            cdList.add(cd);
            return true;
        }
    }

    public int soLuongCD()
    {
        return cdList.size();
    }

    public double tongGiaThanh()
    {
        double tongGiaThanh = 0.0;
        for (int i = 0; i < cdList.size(); i++)
        {
            tongGiaThanh += cdList.get(i).getGiaThanh();
        }

        return tongGiaThanh;
    }

    public String toString()
    {
        String ketQua = "";
        for (int i = 0; i < cdList.size(); i++)
        {
            ketQua += cdList.get(i).toString() + "\n";
        }
        return ketQua;
    }

    public void sapXepGiamDanGiaThanh()
    {
        cdList.sort((s1, s2) ->
        {
            if (s1.getGiaThanh() > s2.getGiaThanh())
            {
                return -1;
            }
            else return 1;
        });
    }

    public void sapXepTangDanTheoTuaCD()
    {
        cdList.sort((s1, s2) ->
        {
            return s1.getTuaCD().compareTo(s2.getTuaCD());
        });
    }
}
