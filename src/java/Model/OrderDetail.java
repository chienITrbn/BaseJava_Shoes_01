package Model;

public class OrderDetail {

    private int order_id;
    private int size_id;
    private double price;
    private int quantity;

    public OrderDetail() {
    }

    public OrderDetail(int order_id, int size_id, double price, int quantity) {
        this.order_id = order_id;
        this.size_id = size_id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public int getSize_id() {
        return size_id;
    }

    public void setSize_id(int size_id) {
        this.size_id = size_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
