import java.text.DecimalFormat;

public class Programmer extends Employee
{
    public String theLanguage;

    public Programmer(int payrollNumber, String name, double theBasicMonthlySalary, String theLanguage)
    {
        super(payrollNumber, name, theBasicMonthlySalary);

        if (!theLanguage.trim().equals(""))
        {
            this.theLanguage = theLanguage;
        }
        else
        {
            this.theLanguage = "null";
        }
    }

    @Override
    public double getMonthlySalary()
    {
        if (theLanguage.equals("Java"))
        {
            return 1.2 * theBasicMonthlySalary;
        }
        else
        {
            return theBasicMonthlySalary;
        }
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return String.format("%-15d %-25s %20s$ %25s %20s$", thePayrollNumber, theName, 
        df.format(theBasicMonthlySalary), theLanguage, df.format(getMonthlySalary()));
    }
}