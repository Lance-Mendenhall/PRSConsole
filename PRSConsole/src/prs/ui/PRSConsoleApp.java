package prs.ui;

import java.util.List;

import prs.business.Product;
import prs.util.Console;
import prs.util.ProductDB;

public class PRSConsoleApp {

	public static void main(String[] args) {
	
		System.out.println("Welcome tothe PRS Console App!!!");
		ProductDB pdb = new ProductDB();
		
		String command = "";
		while (!command.equals("9")) {
			
			displayMenu();
			command = Console.getString(command);
			
			if (command.equals("1")) {
				List<Product> products = pdb.getAll();
				
				for ( Product p : products) {
					System.out.println(p);
				}
				
			}
			else if (command.equals("2")) {
				
				int pid = 0;  // product ID
				
				// need to check if ID exists
				pid = Console.getInt("Enter Product ID");
				
				Product prod = pdb.getProduct(pid);
				if(prod!= null) {
					System.out.println("Here is the product you requested. ");
					System.out.println(prod);
				}
				else {
					System.out.println("Product not found. ");
				}
				
			}
			
			// add a product
			else if (command.equals("3")) {
				
				int vid = 0;
				String pNumber;
				String name;
				double price;
												
				
				// need to check if ID exists
				vid = Console.getInt("Enter Vendor ID: ");
				pNumber = Console.getString("Enter part number: ");
				name = Console.getString("Enter part name: ");
				price = Console.getDouble("Enter price: ");
								
				Product prod = new Product(vid, pNumber, name, price);
				if(pdb.add(prod)) {
					System.out.println("Product added successfully. ");
				}
				else {
					System.out.println("Error adding product. ");
				}
				
				
			}
			
			// update a product
			else if (command.equals("4")) {
							
				int pid = Console.getInt("Enter Product ID ");
				Product product = getProductById(pdb, pid);
				
				String newName = Console.getString("Enter New Name: ");
			
				if(pdb.update(product)) {
					System.out.println("Product updated successfully. ");
				}
				else {
					System.out.println("Error updating product. ");
				}
							
							
			}
			
			// delete a product
			else if (command.equals("5")) {
										
				int pid = Console.getInt("Enter Product ID ");
				Product product = getProductById(pdb, pid);
				
				if(pdb.delete(product)) {
					System.out.println("Product deleted successfully. ");
				}
				else {
					System.out.println("Error deleting product. ");
				}
										
										
						}
			
		}
		
	
		
		
		
		System.out.println("bye!");
	}

	private static void displayMenu() {
		StringBuilder sb = new StringBuilder("Command Menu\n");
		sb.append("1 = List All Products\n");
		sb.append("2 = Get A Products\n");
		sb.append("3 = Add A Products\n");
		sb.append("4 = Update A Products\n");
		sb.append("5 = Remove A Products\n");
		sb.append("9 = Exit\n");
		System.out.println(sb.toString());
	}
	
	private static Product getProductById(ProductDB pdb, int pid) {
		
		if(prod!= null) {
			System.out.println(prod);
		}
		else {
			System.out.println("Product not found. ");
		}
		
		
	}
	
}
