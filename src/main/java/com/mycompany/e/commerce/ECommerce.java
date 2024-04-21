

package com.mycompany.e.commerce;
import java.util.*;

public class ECommerce {

public static void main(String[] args) throws Exception {
Scanner input = new Scanner(System.in);

ElectronicProduct smartphone = new ElectronicProduct();
smartphone.setName("smartphone");
smartphone.setProductId(1);
smartphone.setPrice(599.9);
smartphone.setBrand("Samsung");
smartphone.setWarrantyPeriod(1);

ClothingProduct shirt = new ClothingProduct();
shirt.setName("T-Shirt");
shirt.setProductId(2);
shirt.setPrice((float) 19.99);
shirt.setSize("Medium");
shirt.setFabric("Cotton");

BookProduct b=new  BookProduct();
b.setName("O0P");
b.setProductId(3);
b.setPrice((float) 39.99);
b.setAuthor("O'Reilly");
b.setPubliaher("Publications");


System.out.println("Welcome to the E-Commerce system!");
System.out.println("please enter your id: ");
int id = input.nextInt();
System.out.println("please enter your name: ");
input.nextLine();
String Name = input.nextLine();
System.out.println("please enter your Adress: ");
String Adress =input.nextLine();

System.out.println("How many products you want to add to your cart ? ");
int p = input.nextInt();

Customer c = new Customer();
c.setName (Name);
c.setCustomerId(id);
c.setAddress(Adress);

Cart k = new Cart();
k.setCustomerId(id); 
k.setnProducts(p);

for (int x = 0; x <p; x++) {
System.out.println("Which product would you like to add? 1-Smartphone 2- T-Shirt 3- OOP");
int y =input.nextInt();
if (y==1) {
k.addProduct(smartphone);
}else if(y == 2){
   k.addProduct(shirt); 
}else if(y == 3){
    k.addProduct(b);
}else{
    System.out.println("Wrong input!!");
}
}


System.out.println("Your total price is: " + k.calculatePrice()+  ". Would you like to place the order? 1- Yes 2- No");
int i = input.nextInt();
if (i == 1) {
k.placeOrder();
} else if (i == 2) {
k.removeProducts();
} else {
System.out.println("wrong input");
return;
}
 }
  }

