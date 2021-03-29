public class Enrollment 
{
    private String status;
    private String grade;
    private double numGrade;
    private Student student;

    public Enrollment(Student student, String status, String grade, double numGrade)
    {
        if (!status.trim().equals(""))
        {
            this.status = status;
        }
        else
        {
            this.status = "null";
        }

        if (!grade.trim().equals(""))
        {
            this.grade = grade;
        }
        else
        {
            this.grade = "null";
        }

        if (numGrade >= 0.0 && numGrade <= 10.0)
        {
            this.numGrade = numGrade;
        }
        else
        {
            this.numGrade = 0.0;
        }

        this.student = student;
    }

    public String getStatus() 
    {
        return status;
    }

    public String getGrade() 
    {
        return grade;
    }

    public double getNumGrade() 
    {
        return numGrade;
    }

    public void setStatus(String status) 
    {
        if (!status.trim().equals(""))
        {
            this.status = status;
        }
        else
        {
            this.status = "null";
        }
    }

    public void setGrade(String grade) 
    {
        if (!grade.trim().equals(""))
        {
            this.grade = grade;
        }
        else
        {
            this.grade = "null";
        }
    }

    public void setNumGrade(double numGrade) 
    {
        if (numGrade >= 0.0 && numGrade <= 10.0)
        {
            this.numGrade = numGrade;
        }
        else
        {
            this.numGrade = 0.0;
        }
    }
    
    public String getInfo()
    {
        return String.format("%-15s %-25s %20d %15.1f", student.getStudentID(), 
            student.getFirstName() + " " + student.getLastName(),
            student.getYearMatriculated(),
            numGrade);
    }
}