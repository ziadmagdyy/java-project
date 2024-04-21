
package com.mycompany.e.commerce;


public class Cart {
    private int customerId;
    private int nProducts ;
    private Product[] products;
    
    public Cart(){
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = Math.abs(customerId);
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
          this.nProducts = nProducts;
        products = new Product[nProducts];
      
    }
    
    public void addProduct(Product prod){
        for(int i =0; i < nProducts ;i++){
            if(products[i] == null){
            products[i] = prod ;
            System.out.println("Product added. ");
            return;
            }
        }
    }    
        
    public void removeProducts (){
        for(int i =0; i < nProducts ;i++){
             products[i] = null;
        }
    }    
    
    public double calculatePrice (){
        double totalPrice = 0.0 ; 
        for(int i = 0 ; i <nProducts ; i++){
            if (products[i] != null){
                totalPrice += products[i].getPrice();
            }
        }
        return totalPrice;
    }
    public void placeOrder(){
        Order order1 = new Order(customerId,1 , products , calculatePrice());
        order1.printOrderInfo();
    }
        
    }
    
    
    

