public abstract class Employee
{
    protected int thePayrollNumber;
    protected String theName;
    protected double theBasicMonthlySalary;

    protected Employee(int thePayrollNumber, String theName, double theBasicMonthySalary)
    {
        if (thePayrollNumber > 0)
        {
            this.thePayrollNumber = thePayrollNumber;
        }
        else
        {
            this.thePayrollNumber = 0;
        }

        if (!theName.trim().equals(""))
        {
            this.theName = theName;
        }
        else
        {
            this.theName = "null";
        }

        if (theBasicMonthySalary > 0.0)
        {
            this.theBasicMonthlySalary = theBasicMonthySalary;
        }
        else
        {
            this.theBasicMonthlySalary = 0.0;
        }
    }

    public int getPayrollNumber()
    {
        return thePayrollNumber;
    }

    public String getName()
    {
        return theName;
    }

    public boolean equals(Employee obj)
    {
        if (thePayrollNumber == obj.getPayrollNumber()) 
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public abstract String getInfo();
    public abstract double getMonthlySalary();
}