public class Student
{
    private int mssv;
    private String hoTen;
    private float diemLT;
    private float diemTH;

    public Student()
    {
        mssv = 0;
        hoTen = "null";
        diemLT = 0.0f;
        diemTH = 0.0f;
    }

    public Student(int MSSV, String hoTen, float diemLT, float diemTH) 
    {
        if (MSSV > 0)
        {
            this.mssv = MSSV;
        }
        else
        {
            this.mssv = 0;
        }

        if (!hoTen.equals(""))
        {
            this.hoTen = hoTen;
        }
        else
        {
            this.hoTen = "null";
        }

        if (diemLT >= 0.0 && diemLT <= 10.0)
        {
            this.diemLT = diemLT;
        }
        else
        {
            this.diemLT = 0.0f;
        }

        if (diemTH >= 0.0 && diemTH <= 10.0)
        {
            this.diemTH = diemTH;
        }
        else
        {
            this.diemTH = 0.0f;
        }
    }

    public void setMSSV(int mssv)
    {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen)
    {
        this.hoTen = hoTen;
    }

    public void setDiemLT(float diemLT)
    {
        this.diemLT = diemLT;
    }

    public void setDiemTH(float diemTH)
    {
        this.diemTH = diemTH;
    }

    public int getMSSV()
    {
        return mssv;
    }

    public String getHoTen()
    {
        return hoTen;
    }

    public float getDiemLT()
    {
        return diemLT;
    }

    public float getDiemTH()
    {
        return diemTH;
    }

    public float diemTB()
    {
        return (diemLT + diemTH) / 2;
    }

    public String toString()
    {
        return String.format("%-10d %-20s %10.2f %10.2f %10.2f", mssv, hoTen, diemLT, diemTH, diemTB());
    }

}