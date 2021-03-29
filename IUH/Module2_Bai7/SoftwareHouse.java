import java.util.ArrayList;

public class SoftwareHouse 
{
    private String theName;
    private ArrayList<Employee> listStaff;

    public SoftwareHouse(String theName)
    {
        if (!theName.trim().equals(""))
        {
            this.theName = theName;
        }
        else
        {
            this.theName = "null";
        }

        listStaff = new ArrayList<>();
    }

    public String getTheName()
    {
        return theName;
    }

    public boolean addEmployee(Employee emp)
    {
        for (Employee empl : listStaff)
        {
            if (empl.equals(emp))
            {
                return false;
            }
        }

        listStaff.add(emp);
        return true;
    }

    public void displayAllStaff()
    {
        System.out.printf("%-15s %-25s %21s %25s %21s\n", "Payroll Number", "Name", "Basic Salary", "Note", "Real Salary");
        for (Employee emp : listStaff)
        {
            System.out.println(emp.getInfo());
        }
    }

    public double getMonthlySalaryBill()
    {
        double result = 0.0;
        for (Employee emp : listStaff)
        {
            result += emp.getMonthlySalary();
        }
        return result;
    }

    public void sortAllStaffByName()
    {
        listStaff.sort((s1, s2) ->
        {
            return s1.getName().compareTo(s2.getName());
        });
    }

    public void displayListProgrammers()
    {
        for (Employee emp : listStaff)
        {
            if (emp instanceof Programmer && !(emp instanceof ProjectLeader))
            {
                System.out.println(emp.getInfo());
            }
        }
    }

    public boolean updateDepartmentForAdmin(int aPayrollNo, String deptNew)
    {
        for (Employee emp : listStaff)
            if (emp instanceof Administrator && emp.getPayrollNumber() == aPayrollNo)
            {
                ((Administrator)emp).setDepartment(deptNew);
                return true;
            }

        return false;
    }

    public boolean deleteEmployee(int id)
    {
        for (Employee emp : listStaff)
        {
            if (emp.getPayrollNumber() == id)
            {
                listStaff.remove(emp);
                return true;
            }
        }

        return false;
    }
}