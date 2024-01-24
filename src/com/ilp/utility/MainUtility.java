package com.ilp.utility;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.ilp.entity.Product;
import com.ilp.service.*;
import com.ilp.serviceinterface.ProductAddManager;

public class MainUtility {
	public static void main(String args[]) {
		ProductAddManager productAddition;
		ProductServices productServicesObject = new ProductServices();
		Map<String, Product> products = new HashMap<>();
		Scanner scanner = new Scanner(System.in);
		char whileChoice = 'y';
		do {
		System.out.println("Enter your choice: \n1. Add Product. \n2. Delete Product \n3. Display Product \n4. Display All Products.");
		int choice = scanner.nextInt();
		switch(choice) {
		case 1: System.out.println("Enter your choice of addition: \n1. Clothing Product. \n2. Non-Clothing Product");
				int additionChoice = scanner.nextInt();
				if(additionChoice == 1) {
					productAddition = new ClothingProductAddService();
					products = productAddition.addProduct();
				}
				else if(additionChoice == 2) {
					productAddition = new NonClothingProductAddService();
					products = productAddition.addProduct();
				}
				break;
					
		case 2: System.out.println("Enter the product id to delete: ");
				String deletedProductId = scanner.next();
				productServicesObject.deleteProduct(deletedProductId,products);
				break;
					
		case 3: System.out.println("Enter the product id to be displayed: ");
				String displayProductId = scanner.next();
				productServicesObject.displayProduct(displayProductId, products);
				break;
					
		case 4: System.out.println("The available products are : ");
				productServicesObject.displayAllProducts(products);
				break;
					
		default: System.out.println("Invalid choice!!!");
		}
		System.out.println("Do you want to continue?(y/n)");
		whileChoice = scanner.next().charAt(0);
	}while(whileChoice == 'y');
	
	OrderService order = new OrderService();
}
}
