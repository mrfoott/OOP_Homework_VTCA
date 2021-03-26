import java.util.ArrayList;

public class QuanLyXe 
{
    ArrayList<Xe> danhSachXe = new ArrayList<>();
    
    public void themXeVaoDanhSach(Xe obj)
    {
        danhSachXe.add(obj);
    }
    
    public void inCacXeCoTrongDanhSach()
    {
        for (Xe xe : danhSachXe)
        {
            System.out.println(xe.getInfo());
        }
    }
}
