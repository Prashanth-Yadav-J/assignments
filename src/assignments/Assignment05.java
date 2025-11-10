package assignments;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> datastudentdetails = new HashMap<String, String>();
		datastudentdetails.put("Laptop", "Tech Supplies");
		datastudentdetails.put("Desk Chair", "ProductID:P002,Name:Desk Chair,Category:Furniture,Price:150K Pounds,Stock Quantity:Two,Supplier:Office Depot,Warranty:1 Year,Rating:4 Stars,Manufacturing Date:Sep 2024,Expiry Date:N/A");
		datastudentdetails.put("Coffee Maker", "Kitchen World");

		List<String> studentdetailsarray = new ArrayList<String>();
		studentdetailsarray.add(000, datastudentdetails.get("Laptop"));
		studentdetailsarray.add(001, datastudentdetails.get("Desk Chair"));
		studentdetailsarray.add(002, datastudentdetails.get("Coffee Maker"));

		Map<String, String> datastudentdetailsmap = new HashMap<String, String>();
		datastudentdetailsmap.put("Electronics", studentdetailsarray.get(0));
		datastudentdetailsmap.put("Furniture", studentdetailsarray.get(1));
		datastudentdetailsmap.put("Kitchen", studentdetailsarray.get(2));

		System.out.println(datastudentdetailsmap.get("Furniture"));

	}

}
