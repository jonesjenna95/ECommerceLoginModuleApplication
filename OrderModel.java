package com.gcu;



public class OrderModel {
	 // Private class member variables
//	@Id
    String id="";
    String orderNo="";
    String productName="";
    float price=0;
    int quantity=0;
    // Default constructor initializing all properties to default values
    public OrderModel() {
        this.id = "";
        this.orderNo = "";
        this.productName = "";
        this.price = 0.0f;
        this.quantity = 0;
    }
    // Non-default constructor to initialize all class member variables
    public OrderModel(String id, String orderNo, String productName, float price, int quantity) {
        this.id = id;
        this.orderNo = orderNo;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters and setters for id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getters and setters for orderNo
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    // Getters and setters for productName
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getters and setters for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getters and setters for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
