public class Main 
{
    public static void main(String[] args)
    {
        Vehicle xe1 = new Vehicle("Vo Hong Phu", "Future FI 2018", 125, 33000000.0);
        Vehicle xe2 = new Vehicle("Nghiem Quang Cuong", "Future FI 2069", 125, 3700000000.0);
        Vehicle xe3 = new Vehicle("Nguyen Van Teo", "Yamaha Nouvo", 6969, 696969696969.0);
        System.out.printf("%-20s %-20s %10s %18s %18s", "Ten Chu Xe", "Loai Xe", "Dung Tich", "Gia tien", "Thue phai tra");
        System.out.println();
        System.out.println("==========================================================================================");
        System.out.println(xe1.toString());
        System.out.println(xe2.toString());
        System.out.println(xe3.toString());
    }    
}
