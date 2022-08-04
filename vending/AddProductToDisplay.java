package vendingmachine;

public class AddProductToDisplay {

	Product[] items;
	static int index;
	
	public AddProductToDisplay(int noOfProduct) {
		items = new Product[noOfProduct];
	}
	public void addProduct(int productid,String productName,long productPrice) {
		Product productdetail = new Product();
		productdetail.setProductId(productid);
		productdetail.setProductname(productName);
		productdetail.setProductprice(productPrice);
		items[index] = productdetail;
		index++;
	}
	
	public Product getProductDisplay(int productid) {
		Product productdetail = new Product();
		productdetail = items[productid-1];
		
		return productdetail;
	}
	
	public void displayProduct(){
		
		for(int i=0;i<items.length;i++) {
			System.out.println("Product Id :"+ items[i].getProductId()+", Name : "+ items[i].getProductname()+", Price : "+items[i].getProductprice());
		}
		
	}
	
}
