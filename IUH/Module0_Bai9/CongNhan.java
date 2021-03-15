public class CongNhan
{
    private int maCN;
    private String mHo;
    private String mTen;
    private int mSoSP;

    public CongNhan()
    {
        maCN = 999999;
        mHo = "null";
        mTen = "null";
        mSoSP = 0;
    }

    public CongNhan(int maCN, String mHo, String mTen, int mSoSP)
    {
        if (maCN > 0)
        {
            this.maCN = maCN;
        }
        else
        {
            this.maCN = 999999;
        }

        if (!mHo.trim().equals(""))
        {
            this.mHo = mHo;
        }
        else
        {
            this.mHo = "null";
        }

        if (!mTen.trim().equals(""))
        {
            this.mTen = mTen;
        }
        else
        {
            this.mTen = mTen;
        }

        if (mSoSP > 0)
        {
            this.mSoSP = mSoSP;
        }
        else
        {
            this.mSoSP = 0;
        }
    }

    public void setMaCN(int maCN)
    {
        if (maCN > 0)
        {
            this.maCN = maCN;
        }
        else
        {
            this.maCN = 999999;
        }
    }

    public void setMHo(String mHo)
    {
        if (!mHo.trim().equals(""))
        {
            this.mHo = mHo;
        }
        else
        {
            this.mTen = "null";
        }
    }

    public void setMTen(String mTen)
    {
        if (!mTen.trim().equals(""))
        {
            this.mTen = mTen;
        }
        else
        {
            this.mTen = "null";
        }
    }

    public void setMSoSP(int mSoSP)
    {
        if (mSoSP > 0)
        {
            this.mSoSP = mSoSP;
        }
        else
        {
            this.mSoSP = 0;
        }
    }

    public int getMaCN()
    {
        return maCN;
    }

    public String getMHo()
    {
        return mHo;
    }

    public String getMTen()
    {
        return mTen;
    }

    public int getMSoSP()
    {
        return mSoSP;
    }

    public double tinhLuong()
    {
        if (mSoSP > 0 && mSoSP < 200)
        {
            return mSoSP * 0.5f;
        }
        else if (mSoSP > 199 && mSoSP < 400)
        {
            return mSoSP * 0.55f;
        }
        else if (mSoSP > 399 && mSoSP < 600)
        {
            return mSoSP * 0.6f;
        }
        else
        {
            return mSoSP * 0.65f;
        }
    }

    public String toString()
    {
        return String.format("%-10d %-10s %-15s %8d %8.2f", maCN, mHo, mTen, mSoSP, tinhLuong());
    }
}