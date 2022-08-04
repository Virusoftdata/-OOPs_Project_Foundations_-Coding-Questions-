package vendingmachine;

import java.util.Scanner;
public class VendingMachine {
	
	AddProductToDisplay productDetail = new AddProductToDisplay(5);
	AddToCart mycart = new AddToCart();
	Scanner in = new Scanner(System.in);
	public VendingMachine(){
		//Add product to Vending Machine
		productDetail.addProduct(1,"Pepsi",15);
		productDetail.addProduct(2,"Coca Cola",20);
		productDetail.addProduct(3,"Water",25);
		productDetail.addProduct(4,"Chips",30);
		productDetail.addProduct(5,"Sprite",35);
		displayProductOnDisplay();
	}

	public void defaultdispaly(){
		System.out.println("1.Continue Shopping press 1.");
	    System.out.println("2.For CheckOut Press 2.");
	    System.out.println("3.For Cart Items View Press 3.");
	    int selection = in.nextInt();
		switch(selection) {
		case 1 :
			    displayProductOnDisplay();
			    break;    
		case 2 :
			    paymentOption();
		     	 break;	 
		case 3 : 
			     cartItemsView();
		     	 break;	
	    default : 	  	 
	    	System.out.println("Please Select Correct Input");
	   }
	}
	
	public void displayProductOnDisplay() {
		System.out.println("Please Select Product Id To Add Cart.");
		productDetail.displayProduct();	
		addToCart(in.nextInt());
		
	}
	public void addToCart(int productid) {
		Product selectedIteams = new Product();
		selectedIteams.setProductId(productDetail.getProductDisplay(productid).getProductId());
		selectedIteams.setProductname(productDetail.getProductDisplay(productid).getProductname());
		selectedIteams.setProductprice(productDetail.getProductDisplay(productid).getProductprice());
		mycart.addIteamsToCart(selectedIteams);		
		defaultdispaly();
	}
	
	public void paymentOption(){
		 while(true) {
		     System.out.println("Choose Payment Option");
		     System.out.println("1.For Cash Payment");
		     System.out.println("2.For Credit/Debit cards");
		     int flag = in.nextInt();
			     if(flag == 1 || flag == 2 ){
			    	  if(flag == 1){
				           System.out.println("Total Amount : "+mycart.getTotalPrice());
				           System.out.println("Thank You!");
				           flag =0;
				           break;
				          }
			    	  if(flag == 2){
				           System.out.println("Total Amount : "+mycart.getTotalPrice()*2);
				           System.out.println("Thank You!");
				           break;
				          }
			     }else {
			    	 System.out.println("Please Select Proper Option");
			     }
		     
		     }
	
	}
	public void cartItemsView() {
			System.out.println("Cart Added Items.");
			mycart.displayIteams();
			System.out.println("Total Amount : "+mycart.getTotalPrice());
			defaultdispaly();
	}
	
}
