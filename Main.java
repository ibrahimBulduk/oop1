package oop1;

public class Main {

	public static void main(String[] args) {
		// set value = değerAtama
		Product1 productx = new Product1();
		productx.setName("Delonghi Kahve Makinesi");
		productx.setDiscount(7);
		productx.setUnitPrice(7500);
		productx.setUnitsInStock(3);
		productx.setImageUrl("image1.jpg");

		Product1 productxa = new Product1();
		productxa.setName("Smeg Kahve Makinesi");
		productxa.setDiscount(7);
		productxa.setUnitPrice(7500);
		productxa.setUnitsInStock(3);
		productxa.setImageUrl("image1.jpg");

		Product1 productxb = new Product1();
		productxb.setName("Kitchen aid Kahve Makinesi");
		productxb.setDiscount(7);
		productxb.setUnitPrice(7500);
		productxb.setUnitsInStock(3);
		productxb.setImageUrl("image1.jpg");

		Product1[] products = { productx, productxa, productxb };

		System.out.println("<ul>");
		for (Product1 productArray : products) {
			System.out.println("<li>" + productArray.getName() + "</li>");

		}
		System.out.println("</ul>");
		IndividualCustomer individualCustomer123 = new IndividualCustomer();
		individualCustomer123.setId(1);
		individualCustomer123.setPhone("05469715992");
		individualCustomer123.setCustomerNumberString("12345");
		individualCustomer123.setFirstName("ibrahim");
		individualCustomer123.setLastName("Bulduk");
		
		CorporateCustomer corporateCustomer123 = new CorporateCustomer();
		corporateCustomer123.setId(2);
		corporateCustomer123.setPhone("03823053000");
		corporateCustomer123.setCompanyName("kvp bilişim");
		corporateCustomer123.setTaxNumber("7458212");
		corporateCustomer123.setCustomerNumberString("58747");
		
		
		Customer[] customers = {individualCustomer123 , corporateCustomer123};
		
		
		
		
		

	}

}
