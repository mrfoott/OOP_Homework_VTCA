public class Triangle
{
    private float canhAB;
    private float canhBC;
    private float canhCA;

    public Triangle()
    {
        canhAB = 0.0f;
        canhBC = 0.0f;
        canhCA = 0.0f;
    }

    public Triangle(float canhAB, float canhBC,float canhCA)
    {
        if (canhAB + canhBC <= canhCA || canhCA + canhAB <= canhBC || canhBC + canhCA <= canhAB)
        {
            this.canhAB = 0.0f;
            this.canhBC = 0.0f;
            this.canhCA = 0.0f;
        } 
        else    
        {
            this.canhAB = canhAB;
            this.canhBC = canhBC;
            this.canhCA = canhCA;
        }
    }

    public void setcanhAB(float canhAB)
    {
        if (canhAB + canhBC > canhCA || canhBC + canhCA > canhAB || canhCA + canhAB > canhBC)
        {
            this.canhAB = canhAB;
        }
    }

    public float getcanhAB()
    {
        return canhAB;
    }

    public void setcanhBC(float canhBC)
    {
        if (canhAB + canhBC > canhCA || canhBC + canhCA > canhAB || canhCA + canhAB > canhBC)
        {
            this.canhBC = canhBC;
        }
    }

    public float setcanhBC()
    {
        return canhBC;
    }

    public void setcanhCA(float canhCA)
    {
        if (canhAB + canhBC > canhCA || canhBC + canhCA > canhAB || canhCA + canhAB > canhBC)
        {
            this.canhCA = canhCA;
        }
    }

    public float getcanhCA()
    {
        return canhCA;
    }

    public float tinhChuVi()
    {
        return canhAB + canhBC + canhCA;
    }

    public double tinhDienTich()
    {
        return Math.sqrt(((canhAB + canhBC + canhCA) / 2) * (((canhAB + canhBC + canhCA) / 2) - canhAB) *
                (((canhAB + canhBC + canhCA) / 2) - canhBC) * (((canhAB + canhBC + canhCA) / 2) - canhCA));
    }

    public String kieuTamGiac()
    {
        boolean tamGiacDeu = (canhAB == canhBC && canhAB == canhCA);
        boolean tamGiacCan = (canhAB == canhBC || canhAB == canhCA || canhBC == canhCA);
        boolean tamGiacVuong = (canhAB*canhAB + canhBC*canhBC == canhCA*canhCA ||
            canhAB*canhAB + canhCA*canhCA == canhBC*canhBC || canhBC*canhBC + canhCA*canhCA == canhAB*canhAB);

        boolean khongPhaiTamGiac = (canhAB + canhBC <= canhCA || canhAB + canhCA <= canhBC || canhBC + canhCA <= canhAB);

        if (khongPhaiTamGiac)
        {
            return "Khong phai tam giac";
        }
        else
            if (tamGiacDeu)
            {
                return "Tam giac deu";
            }
            else if (tamGiacVuong && tamGiacCan)
            {
                return "Tam giac vuong can";
            }
            else if (tamGiacCan)
            {
                return "Tam giac can";
            }
            else if (tamGiacVuong)
            {
                return "Tam giac vuong";
            }
            else 
            {
                return "Tam giac thuong";
            }
    }

    public String toString()
    {
        return String.format("%-10.2f %-10.2f %-10.2f %-20s %10.3f %10.3f", canhAB, canhBC, canhCA, kieuTamGiac(), tinhChuVi(), tinhDienTich());
    }
}