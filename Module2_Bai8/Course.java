import java.util.ArrayList;

public class Course 
{
    private String courseNbr;
    private String courseTitle;
    private int credits;
    private ArrayList<Section> section;

    public Course(String courseNbr, String courseTitle, int credits)
    {
        if (!courseNbr.trim().equals(""))
        {
            this.courseNbr = courseNbr;
        }
        else
        {
            this.courseNbr = "null";
        }

        if (!courseTitle.trim().equals(""))
        {
            this.courseTitle = courseTitle;
        }
        else
        {
            this.courseTitle = "null";
        }

        if (credits > 0)
        {
            this.credits = credits;
        }
        else
        {
            this.credits = 0;
        }

        section = new ArrayList<>();
    }

    public void addSection(String sectionNbr, String semester, String room, Faculty faculty, ArrayList<Enrollment> listEnrolls)
    {
        section.add(new Section(sectionNbr, semester, room, faculty, listEnrolls));
    }

    public void addSection(Section sec)
    {
        section.add(sec);
    }

    public String getCourseNumber() 
    {
        return courseNbr;
    }

    public String getCourseTitle() 
    {
        return courseTitle;
    }

    public int getCredits() 
    {
        return credits;
    }

    public void setCourseNumber(String courseNbr) 
    {
        if (!courseNbr.trim().equals(""))
        {
            this.courseNbr = courseNbr;
        }
        else
        {
            this.courseNbr = "null";
        }
    }

    public void setCourseTitle(String courseTitle) 
    {
        if (!courseTitle.trim().equals(""))
        {
            this.courseTitle = courseTitle;
        }
        else
        {
            this.courseTitle = "null";
        }
    }

    public void setCredits(int credits) 
    {
        if (credits > 0)
        {
            this.credits = credits;
        }
        else
        {
            this.credits = 0;
        }
    }

    public ArrayList<Section> getSection() 
    {
        return section;
    }

    public void printCourseInfo()
    {
        System.out.println("Course: " + courseTitle + " has " + section.size() + " credits.");
        for (Section sec : section)
        {
            System.out.println(sec.getInfo());
        }
    }
}
