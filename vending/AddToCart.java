package vendingmachine;

public class AddToCart {
	
	Product[] cartitems = new Product[25];
	static int index;
	static long totalprice = 0;
	
	public void addIteamsToCart(Product items) {
		cartitems[index] = items;
		totalprice += items.getProductprice();
		index++;
	}
	
	public int getTotalItems(){
		return index;
	}
	
	public long getTotalPrice(){
	
		return totalprice;
	}
	
	public void displayIteams(){
		System.out.println("Selected Product : ");
			for(int i=0;i<index;i++) {
				System.out.println("Product Id :"+ cartitems[i].getProductId()+", Name : "+ cartitems[i].getProductname()+", Price : "+cartitems[i].getProductprice());
			}
			
	}
	
	
}
