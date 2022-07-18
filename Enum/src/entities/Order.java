package entities;


import java.util.Date;

public class Order {
    private Integer ID;
    private Date moment;
    private OrderStatus orderStatus;


    public Order(Integer ID, Date moment, OrderStatus orderStatus) {
        this.ID = ID;
        this.moment = moment;
        this.orderStatus = orderStatus;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ID=" + ID +
                ", moment=" + moment +
                ", orderStatus=" + orderStatus +
                '}';
    }
}
