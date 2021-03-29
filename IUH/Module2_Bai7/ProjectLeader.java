import java.text.DecimalFormat;

public class ProjectLeader extends Programmer
{
    public ProjectLeader(int thePayrollNumber, String theName, double theBasicMonthlySalary, String theLanguage)
    {
        super(thePayrollNumber, theName, theBasicMonthlySalary, theLanguage);
    }

    @Override
    public double getMonthlySalary()
    {
        return 1.4 * theBasicMonthlySalary;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return String.format("%-15d %-25s %20s$ %25s %20s$", thePayrollNumber, theName, 
            df.format(theBasicMonthlySalary), theLanguage, df.format(getMonthlySalary()));
    }
}