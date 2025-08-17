package model;
import java.time.LocalDateTime;

public class Delivery {
    private Product product;
    private Customer customer;
    private String transport;
    private LocalDateTime deliveryDate;

    public Delivery(Product product, Customer customer, String transport, LocalDateTime deliveryDate){
        this.product =product;
        this.customer = customer;
        this.transport = transport;
        this.deliveryDate = deliveryDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public Product getProduct() {
        return product;
    }

    public String getTransport() {
        return transport;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
