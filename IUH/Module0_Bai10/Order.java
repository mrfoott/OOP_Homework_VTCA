import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Order 
{
    private int orderID;
    private LocalDate orderDate;
    private ArrayList<OrderDetail> lineItems = new ArrayList<>();
    private int count;

    public Order(int orderID, LocalDate orderDate)
    {
        if (orderID > 0)
        {
            this.orderID = orderID;
        }
        else
        {
            this.orderID = 0;
        }

        this.orderDate = orderDate;
    }

    public void addLineItem(OrderDetail orderDetail)
    {
        lineItems.add(orderDetail);
    }

    public void addLineItem(Product product, int quatity)
    {
        OrderDetail orderDetail = new OrderDetail(product, quatity);
        lineItems.add(orderDetail);
    }

    public double calcTotalCharge()
    {
        double result = 0.0;
        for (OrderDetail od : lineItems)
        {
            result += od.calcTotalPrice();
        }
        return result;
    }

    public void setOrderDate(LocalDate orderDate)
    {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderDetail> getLineItems()
    {
        return lineItems;
    }

    public LocalDate getOrderDate()
    {
        return orderDate;
    }

    public int getOrderID()
    {
        return orderID;
    }

    public String toString()
    {
        DecimalFormat df = new DecimalFormat("#,####.00");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String result = "";
        int count = 0;
        result += "Ma HD: " + orderID + "\n";
        result += "Ngay lap hoa don: " + orderDate.format(dtf) + "\n";
        result += String.format("%-5s | %-7s | %-15s | %10s | %10s | %10s", "STT", "Ma SP", "Mo ta", "Don gia", "So Luong", "Thanh tien") + "\n";
        for (OrderDetail od : lineItems)
        {
            count++;
            Product product = od.getProduct();
            result += String.format("%-5d | %-7s | %-15s | %10s | %10d | %10s", 
            count, product.getProductID(), product.getDescription(), df.format(product.getPrice()), od.getQuatity(), df.format(od.calcTotalPrice())) + "\n";
        }
        result += "Tong tien thanh toan: " + df.format(calcTotalCharge());
        return result;
    }
}
