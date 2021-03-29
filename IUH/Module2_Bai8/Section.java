import java.util.ArrayList;

public class Section 
{
    private String sectionNbr;
    private String semester;
    private String room;
    private Faculty faculty;
    private ArrayList<Enrollment> listEnrolls;

    public Section(String sectionNbr, String semester, String room, Faculty faculty)
    {
        if (!sectionNbr.trim().equals(""))
        {
            this.sectionNbr = sectionNbr;
        }
        else
        {
            this.sectionNbr = "null";
        }

        if (!semester.trim().equals(""))
        {
            this.semester = semester;
        }
        else
        {
            this.semester = "null";
        }

        if (!room.trim().equals(""))
        {
            this.room = room;
        }
        else
        {
            this.room = "null";
        }

        this.faculty = faculty;

        listEnrolls = new ArrayList<>();
    }

    public Section(String sectionNbr, String semester, String room, Faculty faculty, ArrayList<Enrollment> listEnrolls)
    {
        if (!sectionNbr.trim().equals(""))
        {
            this.sectionNbr = sectionNbr;
        }
        else
        {
            this.sectionNbr = "null";
        }

        if (!semester.trim().equals(""))
        {
            this.semester = semester;
        }
        else
        {
            this.semester = "null";
        }

        if (!room.trim().equals(""))
        {
            this.room = room;
        }
        else
        {
            this.room = "null";
        }

        this.faculty = faculty;

        if (listEnrolls == null)
        {
            this.listEnrolls = new ArrayList<>();
        }
        else
        {
            this.listEnrolls = listEnrolls;
        }
    }

    public String getSectionNbr() 
    {
        return sectionNbr;
    }

    public String getSemester() 
    {
        return semester;
    }

    public String getRoom() 
    {
        return room;
    }

    public Faculty getFaculty() 
    {
        return faculty;
    }

    public void setSectionNbr(String sectionNbr) 
    {
        if (!sectionNbr.trim().equals(""))
        {
            this.sectionNbr = sectionNbr;
        }
        else
        {
            this.sectionNbr = "null";
        }
    }

    public ArrayList<Enrollment> getListEnrolment() 
    {
        return listEnrolls;
    }

    public void setSemester(String semester) 
    {
        if (!semester.trim().equals(""))
        {
            this.semester = semester;
        }
        else
        {
            this.semester = "null";
        }
    }

    public void setRoom(String room) 
    {
        if (!room.trim().equals(""))
        {
            this.room = room;
        }
        else
        {
            this.room = "null";
        }
    }

    public void setFaculty(Faculty faculty) 
    {
        this.faculty = faculty;
    }

    public void setListEnrolment(ArrayList<Enrollment> listEnrolment) 
    {
        this.listEnrolls = listEnrolment;
    }

    public String getInfo()
    {
        String result = "";
        result += "===== Section Information =====\n";
        result += "Section Number: " + sectionNbr + "\n";
        result += "Semester: " + semester + "\n";
        result += "Room: " + room + "\n";
        result += "Faculty: " + faculty.getFirstName() + " " + faculty.getLastName() + " (Office: " + faculty.getOffice() + ")\n";
        result += "===== List Enrollments =====\n";
        result += String.format("%-15s %-25s %20s %15s\n", "Student ID", "Name", "Matriculate Year", "Grade");
        for (Enrollment enrolment : listEnrolls)
        {
            result += enrolment.getInfo() + "\n";
        }
        result += "Total number of Stundents: " + listEnrolls.size() +"\n";
        return result;
    }
}