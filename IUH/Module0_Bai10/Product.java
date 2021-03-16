public class Product 
{
    private String description;
    private String productID;
    private double price;
    
    public Product()
    {
        description = "null";
        productID = "null";
        price = 0;
    }

    public Product(String description, String productID, double price)
    {
        if (!description.trim().equals(""))
        {
            this.description = description;
        }
        else
        {
            this.description = "null";
        }

        if (!productID.trim().equals(""))
        {
            this.productID = productID;
        }
        else
        {
            this.description = "null";
        }

        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0;
        }
    }

    public void setDescription(String description)
    {
        if (!description.trim().equals(""))
        {
            this.description = description;
        }
        else
        {
            this.description = "null";
        }
    }

    public void setProductID(String productID)
    {
        if (!productID.trim().equals(""))
        {
            this.productID = productID;
        }
        else
        {
            this.productID = "null";
        }
    }

    public void setPrice(double price)
    {
        if (price > 0)
        {
            this.price = price;
        }
        else
        {
            this.price = 0;
        }
    }

    public String getDescription()
    {
        return description;
    }

    public String getProductID()
    {
        return productID;
    }

    public double getPrice()
    {
        return price;
    }
}
