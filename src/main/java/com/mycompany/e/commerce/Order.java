
package com.mycompany.e.commerce;


public class Order {
    private int customerId;
    private int orderId;
    private double totalPrice;
    private Product[] products;

    public Order(int customerId, int orderId,  Product[] products , double totalPrice) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }
    public void printOrderInfo(){
        System.out.println("Here is your order summary : ");
        System.out.println("Order ID : " + orderId);
        System.out.println("Customer ID" + customerId);
        System.out.println("Products: ");
        for(Product p : products){
            System.out.println("  "+ p.getName() + " - $"+p.getPrice());
        }
        System.out.println("Total price: "+totalPrice);
    }
}
 