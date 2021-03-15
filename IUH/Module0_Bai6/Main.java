public class Main 
{
    public static void main(String[] args)
    {
        Account acc1 = new Account(72354, "Ted Murphy", 2000000.0);
        Account acc2 = new Account(69713, "Jane Smith", 5000.0);
        Account acc3 = new Account(93757, "Edward Demsy", 10000000.0);

        acc1.deposit(4564600.0);
        acc2.deposit(5595700.0);
        acc2.withdraw(490000, 200000);
        acc3.addInterest();
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
        System.out.println("===============================================================================");
        acc2.transfer(acc1, 800000);
        System.out.println(acc1.toString());
        System.out.println(acc2.toString());
        System.out.println(acc3.toString());
    }
}
