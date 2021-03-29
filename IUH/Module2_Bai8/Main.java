import java.util.ArrayList;

public class Main 
{
    public static void main(String[] args) 
    {
        Enrollment enr1 = new Enrollment(new Student("Hoang", "Dung", "140211", 2014), "BT", "1", 8.5);
        Enrollment enr2 = new Enrollment(new Student("Tran", "Binh", "140511", 2014), "BT", "1", 9.5);
        Enrollment enr3 = new Enrollment(new Student("Le", "Huynh", "140811", 2014), "BT", "1", 7.0);
        Enrollment enr4 = new Enrollment(new Student("Ho", "Huyen", "140611", 2014), "BT", "1", 5.5);

        ArrayList<Enrollment> listEnrolment = new ArrayList<>();
        listEnrolment.add(enr1);
        listEnrolment.add(enr2);
        listEnrolment.add(enr3);
        listEnrolment.add(enr4);

        Faculty fac1 = new Faculty("Khanh", "Le Kim", "140224", "CNTT");
        Section sect1 = new Section("0602", "I (2015 - 2016)", "H5.01", fac1, listEnrolment);

        Course course = new Course("175", "OOP - Lap Trinh Huong Doi Tuong", 1500);
        course.addSection(sect1);

        course.printCourseInfo();
    }
}
