public class Faculty extends Person
{
    private String facultyID;
    private String office;

    public Faculty(String lastName, String firstName, String facultyID, String office)
    {
        super(lastName, firstName);

        if (!facultyID.trim().equals(""))
        {
            this.facultyID = facultyID;
        }
        else
        {
            this.facultyID = "null";
        }

        if (!office.trim().equals(""))
        {
            this.office = office;
        }
        else
        {
            this.office = "null";
        }
    }

    public String getFacultyID() 
    {
        return facultyID;
    }

    public String getOffice() 
    {
        return office;
    }

    public void setFacultyID(String facultyID)
    {
        if (!facultyID.trim().equals(""))
        {
            this.facultyID = facultyID;
        }
        else
        {
            this.facultyID = "null";
        }
    }

    public void setOffice(String office) 
    {
        if (!office.trim().equals(""))
        {
            this.office = office;
        }
        else
        {
            this.office = office;
        }
    }

    @Override
    public boolean equals(Person ps)
    {
        if (ps instanceof Faculty && ((Faculty)ps).getFacultyID().equals(facultyID))
        {
            return true;
        }
        return false;
    }
}