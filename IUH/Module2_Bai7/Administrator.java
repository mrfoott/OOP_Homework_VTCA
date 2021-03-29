import java.text.DecimalFormat;

public class Administrator extends Employee
{
    private String theDepartment;

    public Administrator(int thePayrollNumber, String name, double theBasicMonthlySalary, String theDepartment)
    {
        super(thePayrollNumber, name, theBasicMonthlySalary);

        if (!theDepartment.trim().equals(""))
        {
            this.theDepartment = theDepartment;
        }
    }

    public void setDepartment(String theDepartment) 
    {
        if (!theDepartment.trim().equals(""))
        {
            this.theDepartment = theDepartment;
        }
        else
        {
            this.theDepartment = "null";
        }
    }

    @Override
    public double getMonthlySalary()
    {
        return 1.2 * theBasicMonthlySalary;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###.00");
        return String.format("%-15d %-25s %20s$ %25s %20s$", thePayrollNumber, theName, df.format(theBasicMonthlySalary),
        theDepartment, df.format(getMonthlySalary()));
    }
}