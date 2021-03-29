import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

public class Main 
{
    public static void main(String[] args) 
    {
        HashMap<String, DiaChi> danhBa = new HashMap<>();

        DiaChi dc1 = new DiaChi(112, "Hoang Van Thu", "Quan 1", "TP. Ho Chi Minh");
        DiaChi dc2 = new DiaChi(245, "Mac Dinh Chi", "Quan 12", "TP. Ho Chi Minh");
        DiaChi dc3 = new DiaChi(2, "Nguyen Trung Truc", "Quan Go Vap", "TP. Ho Chi Minh");
    
        String[] sdt = new String[11];
        sdt[0] = "0934512353";
        sdt[1] = "0934641423";
        sdt[3] = "0938751903";
        sdt[4] = "0989704745";
        sdt[5] = "0937841840";
        sdt[6] = "0943975198";
        sdt[2] = "0976410654";
        sdt[7] = "0922671356";
        sdt[8] = "0922671356";
        sdt[9] = "0922671356";
        sdt[10] = "0922671356";

        for (int i = 0; i < 11; i++)
        {
            if (!danhBa.containsKey(sdt[i]))
            {
                Random rd = new Random();
                int c = rd.nextInt(3);
                DiaChi dc = null;
                switch (c)
                {
                    case 0:
                    {
                        dc1.themSDT(sdt[i]);
                        dc = dc1;
                        break;
                    }
                    case 1:
                    {
                        dc2.themSDT(sdt[i]);
                        dc = dc2;
                        break;
                    }
                    case 2:
                    {
                        dc3.themSDT(sdt[i]);
                        dc = dc3;
                        break;
                    }
                }
                danhBa.put(sdt[i], dc);
            }
        }

        String sdtCanTim = "0989704745";
        System.out.println("Ket qua tim cua sdt 0989704745: \n" + danhBa.get(sdtCanTim).getInfo());
        
        DiaChi diaChiCanTim = dc3;
        for (Entry<String, DiaChi> entry : danhBa.entrySet())
        {
            if (entry.getValue().equals(diaChiCanTim))
            {
                System.out.println(entry.getKey());
            }
        }
    }   
}
