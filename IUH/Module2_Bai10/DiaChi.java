import java.util.HashSet;

public class DiaChi
{
    private int soNha;
    private String tenDuong;
    private String tenQuan;
    private String tenTP;
    private HashSet<String> listSDT;

    public DiaChi(int soNha, String tenDuong, String tenQuan, String tenTP)
    {
        if (soNha > 0)
        {
            this.soNha = soNha;
        }
        else
        {
            this.soNha = 0;
        }

        if (!tenDuong.trim().equals(""))
        {
            this.tenDuong = tenDuong;
        }
        else
        {
            this.tenDuong = "null";
        }

        if (!tenQuan.trim().equals(""))
        {
            this.tenQuan = tenQuan;
        }
        else
        {
            this.tenQuan = "null";
        }

        if (!tenTP.trim().equals(""))
        {
            this.tenTP = tenTP;
        }
        else
        {
            this.tenTP = tenTP;
        }

        listSDT = new HashSet<>();
    }

    public int getSoNha() 
    {
        return soNha;
    }

    public String getTenDuong() 
    {
        return tenDuong;
    }

    public String getTenQuan() 
    {
        return tenQuan;
    }

    public String getTenTP() 
    {
        return tenTP;
    }

    public void themSDT(String sdt)
    {
        if (!sdt.trim().equals(""))
        {
            listSDT.add(sdt);
        }
    }

    public String getInfo()
    {
        String result = "";
        result += soNha + " Duong " + tenDuong + ", Quan " + tenQuan + ", Thanh Pho " + tenTP +"\n"
        + "So Dien Thoai: \n";
        for (String str : listSDT)
        {
            result += str + "\n";
        }
        return result + "\n";
    }

    public boolean equals(DiaChi dc)
    {
        if (dc.getSoNha() == soNha && dc.getTenDuong().equals(tenDuong) && dc.getTenQuan().equals(tenQuan) && dc.getTenTP().equals(tenTP))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}