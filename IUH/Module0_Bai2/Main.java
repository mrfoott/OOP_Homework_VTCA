import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student1 = new Student(123, "Phu", 7.0f, 8.0f);
        Student student2 = new Student(426, "Nguyen Van A", 9f,5f);
        Student student3 = new Student();
        System.out.println("Nhap thong tin SV3");
        System.out.print("MSSV: ");
        int mssv = sc.nextInt();
        student3.setMSSV(mssv);
        System.out.print("Ho Ten: ");
        String HoTen = sc.next();
        student3.setHoTen(HoTen);
        System.out.print("Diem LT: ");
        float DiemLT = sc.nextFloat();
        student3.setDiemLT(DiemLT);
        System.out.print("Diem TH: ");
        float DiemTH = sc.nextFloat();
        student3.setDiemTH(DiemTH);

        System.out.printf("%-10s %-20s %10s %10s %10s\n", "MSSV", "Ho Ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("==========================================================================");

        System.out.println(student1.toString());
        System.out.println(student2.toString());
        System.out.println(student3.toString());
    }
}
