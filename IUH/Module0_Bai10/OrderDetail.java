public class OrderDetail 
{
    private int quatity;
    private Product product;

    public OrderDetail(Product product, int quatity)
    {
        if (product != null)
        {
            this.product = product;
        }
        else
        {
            this.product = null;
        }
        
        if (quatity > 0)
        {
            this.quatity = quatity;
        }
        else
        {
            this.quatity = 0;
        }
    }

    public void setQuatity(int quatity)
    {
        if (quatity > 0)
        {
            this.quatity = quatity;
        }
        else
        {
            this.quatity = 0;
        }
    }

    public int getQuatity()
    {
        return quatity;
    }

    public Product getProduct()
    {
        return product;
    }
    
    public double calcTotalPrice()
    {
        return quatity * product.getPrice();
    }
}
