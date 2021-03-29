public class Student extends Person
{
    private String studentID;
    private int yearMatriculated;

    public Student(String lastName, String firstName, String studentID, int yearMatriculated)
    {
        super(lastName, firstName);

        if (!studentID.trim().equals(""))
        {
            this.studentID = studentID;
        }
        else
        {
            this.studentID = "null";
        }

        if (yearMatriculated > 0)
        {
            this.yearMatriculated = yearMatriculated;
        }
        else
        {
            this.yearMatriculated = 0;
        }
    }

    public String getStudentID() 
    {
        return studentID;
    }

    public int getYearMatriculated() 
    {
        return yearMatriculated;
    }

    public void setYearMatriculated(int yearMatriculated) 
    {
        if (yearMatriculated > 0)
        {
            this.yearMatriculated = yearMatriculated;
        }
        else
        {
            this.yearMatriculated = 0;
        }
    }

    @Override
    public boolean equals(Person ps)
    {
        if (ps instanceof Student && ((Student)ps).getStudentID().equals(studentID))
        {
            return true;
        }
        return false;
    }
}