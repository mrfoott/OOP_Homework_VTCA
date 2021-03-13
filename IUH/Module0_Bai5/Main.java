import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args)
    {
        System.out.printf("%-15s %-15s %15s %-15s %-15s %-20s\n", "Ma_Hang", "Ten_Hang", "Don_Gia", "Ngay_San_Xuat", "Ngay_Het_Han", "Ghi_Chu");
        System.out.println("============================================================================================");

        try
        {
            HangThucPham hang1 = new HangThucPham("1", "Gao", 100000f, LocalDate.of(2020, 7, 10), LocalDate.of(2021, 7, 10));
            HangThucPham hang2 = new HangThucPham("2", "Mi", 5000f, LocalDate.of(2020, 5, 22), LocalDate.of(2021, 11, 22));
            HangThucPham hang3 = new HangThucPham("3", "Nuoc", -10000f, LocalDate.of(2017, 3, 1), LocalDate.of(2020, 3, 8));
            
            System.out.println(hang1);
            System.out.println(hang2);
            System.out.println(hang3);

            HangThucPham hang4 = new HangThucPham("", "", -10000f, LocalDate.of(2017, 3, 1), LocalDate.of(2020, 3, 8));

            System.out.println(hang4);
        } 
        catch (Exception ex) 
        {
            System.err.println(ex.getMessage());
        }
        
    }    
}
