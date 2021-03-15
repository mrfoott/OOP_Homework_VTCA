public class CD
{
    private int maCD;
    private String tuaCD;
    private int soBaiHat;
    private float giaThanh;

    public CD()
    {
        maCD = 999999;
        tuaCD = "chua xac dinh";
        soBaiHat = 0;
        giaThanh = 0;
    }

    public CD(int maCD, String tuaCD, int soBaiHat, float giaThanh)
    {
        if (maCD > 0)
        {
            this.maCD = maCD;
        }
        else
        {
            maCD = 999999;
        }

        if (!tuaCD.trim().equals(""))
        {
            this.tuaCD = tuaCD;
        }
        else
        {
            tuaCD = "chua xac dinh";
        }

        if (soBaiHat > 0)
        {
            this.soBaiHat = soBaiHat;
        }
        else
        {
            soBaiHat = 0;
        }

        if (giaThanh > 0)
        {
            this.giaThanh = giaThanh;
        }
        else
        {
            giaThanh = 0.0f;
        }
    }

    public void setMaCD(int maCD)
    {
        if (maCD > 0)
        {
            this.maCD = maCD;
        }
        else
        {
            maCD = 999999;
        }
    }

    public void setTuaCD(String tuaCD)
    {
        if (!tuaCD.trim().equals(""))
        {
            this.tuaCD = tuaCD;
        }
        else
        {
            tuaCD = "chua xac dinh";
        }
    }

    public void setSoBaiHat(int soBaiHat)
    {
        if (soBaiHat > 0)
        {
            this.soBaiHat = soBaiHat;
        }
        else
        {
            soBaiHat = 0;
        }
    }

    public void setGiaThanh(float giaThanh)
    {
        if (giaThanh > 0)
        {
            this.giaThanh = giaThanh;
        }
        else
        {
            giaThanh = 0.0f;
        }
    }

    public int getMaCD()
    {
        return maCD;
    }

    public String getTuaCD()
    {
        return tuaCD;
    }

    public int getSoBaiHat()
    {
        return soBaiHat;
    }

    public double getGiaThanh()
    {
        return giaThanh;
    }

    public String toString()
    {
        return String.format("%-10d %-20s %10d %12.2f", maCD, tuaCD, soBaiHat, giaThanh);
    }
}