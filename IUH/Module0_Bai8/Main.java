public class Main 
{
    public static void main(String[] args)
    {
        CD cd1 = new CD(123456, "Avicii", 12, 456900);
        CD cd2 = new CD(897231, "West Life", 15, 500000);
        CD cd3 = new CD(564147, "One Direction", 13, 200000);
        CD cd4 = new CD(451621, "Linkin Park", 8, 750000);
        CD cd5 = new CD(784111, "Yiruma", 10, 300000);
        CD cd6 = new CD(675454, "Different Heaven", 9, 250000);

        try
        {
            CDList list = new CDList(6);
            list.add(cd1);
            list.add(cd2);
            list.add(cd3);
            list.add(cd4);
            list.add(cd5);
            list.add(cd6);

            System.out.println(list.toString());
            System.out.println("So Luong CD: " + list.soLuongCD());
            System.out.println("Tong Gia Thanh: " + list.tongGiaThanh());
            System.out.println("=====================");
            list.sapXepGiamDanGiaThanh();
            System.out.println(list.toString());
            list.sapXepTangDanTheoTuaCD();
            System.out.println(list.toString());
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    } 
}
