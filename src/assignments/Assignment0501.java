package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment0501 {

	public static void main(String[] args) {
		Map<String, String> student1details = new HashMap<String, String>();
		student1details.put("Name", "John Doe");
		student1details.put("Age", "Twenty");
		student1details.put("Gender", "Male");
		student1details.put("Roll Number", "SBA12345");
		student1details.put("Grade", "A++");
		student1details.put("Major", "Computer Science");
		student1details.put("GPA", "A3.8");
		student1details.put("Email", "john@example.com");
		student1details.put("PAN Number", "SDF6543210");
		student1details.put("Address", "123 Elm St");
		
		Map<String, String> student2details = new HashMap<String, String>();
		student2details.put("Name", "Jane Smith");
		student2details.put("Age", "Twenty One");
		student2details.put("Gender", "Female");
		student2details.put("Roll Number", "SBA12346");
		student2details.put("Grade", "B+");
		student2details.put("Major", "Mathematics");
		student2details.put("GPA", "A3.5");
		student2details.put("Email", "jane@example.com");
		student2details.put("PAN Number", "REW6543211");
		student2details.put("Address", "456 Oak St");
		
		Map<String, String> student3details = new HashMap<String, String>();
		student3details.put("Name", "Mike Brown");
		student3details.put("Age", "Twenty Two");
		student3details.put("Gender", "Male");
		student3details.put("Roll Number", "SBA12347");
		student3details.put("Grade", "A+");
		student3details.put("Major", "Physics");
		student3details.put("GPA", "A3.9");
		student3details.put("Email", "mike@example.com");
		student3details.put("PAN Number", "TYR6543212");
		student3details.put("Address", "789 Pine St");
		
		List<Map<String,String>> studentdetailsarray = new ArrayList<Map<String,String>>();
		studentdetailsarray.add(student1details);
		studentdetailsarray.add(student2details);
		studentdetailsarray.add(student3details);
		
		Map<String, String> employee1details = new HashMap<String, String>();
		employee1details.put("Employee ID", "E001");
		employee1details.put("Name", "Alice Green");
		employee1details.put("Age", "Thirty");
		employee1details.put("Gender", "Female");
		employee1details.put("Department", "Engineering");
		employee1details.put("Position", "Software Engineer");
		employee1details.put("Salary", "75K Pounds");
		employee1details.put("Email", "alice@example.com");
		employee1details.put("PAN Number", "SDF6543210");
		
		Map<String, String> employee2details = new HashMap<String, String>();
		employee2details.put("Employee ID", "E002");
		employee2details.put("Name", "Bob Johnson");
		employee2details.put("Age", "Thirty Five");
		employee2details.put("Gender", "Male");
		employee2details.put("Department", "Marketing");
		employee2details.put("Position", "Marketing Manager");
		employee2details.put("Salary", "85K Pounds");
		employee2details.put("Email", "bob@example.com");
		employee2details.put("PAN Number", "REW6543211");
		
		Map<String, String> employee3details = new HashMap<String, String>();
		employee3details.put("Employee ID", "E003");
		employee3details.put("Name", "Carol White");
		employee3details.put("Age", "Twenty Eight");
		employee3details.put("Gender", "Female");
		employee3details.put("Department", "Sales");
		employee3details.put("Position", "Sales Executive");
		employee3details.put("Salary", "65K Pounds");
		employee3details.put("Email", "carol@example.com");
		employee3details.put("PAN Number", "TYR6543212");
		
		List<Map<String,String>> employeedetailsarray = new ArrayList<Map<String,String>>();
		employeedetailsarray.add(employee1details);
		employeedetailsarray.add(employee2details);
		employeedetailsarray.add(employee3details);
		
		Map<String, String> product1details = new HashMap<String, String>();
		product1details.put("Product ID", "P001");
		product1details.put("Name", "Laptop");
		product1details.put("Category", "Electronics");
		product1details.put("Price", "12K Pounds");
		product1details.put("Stock Quantity", "Not Available");
		product1details.put("Supplier", "Tech Supplies");
		product1details.put("Warranty", "2 years");
		product1details.put("Rating", "4.5 Stars");
		product1details.put("Manufacturing Date", "Aug 2023");
		product1details.put("Expiry Date", "Aug 2028");
		
		Map<String, String> product2details = new HashMap<String, String>();
		product2details.put("Product ID", "P002");
		product2details.put("Name", "Desk Chair");
		product2details.put("Category", "Furniture");
		product2details.put("Price", "150K Pounds");
		product2details.put("Stock Quantity", "Two");
		product2details.put("Supplier", "Office Depot");
		product2details.put("Warranty", "1 year");
		product2details.put("Rating", "4 Stars");
		product2details.put("Manufacturing Date", "Sep 2024");
		product2details.put("Expiry Date", "N/A");
		
		Map<String, String> product3details = new HashMap<String, String>();
		product3details.put("Product ID", "P003");
		product3details.put("Name", "Coffee Maker");
		product3details.put("Category", "Kitchen");
		product3details.put("Price", "75 Pounds");
		product3details.put("Stock Quantity", "Two Hundred");
		product3details.put("Supplier", "KitchenWorld");
		product3details.put("Warranty", "6 months");
		product3details.put("Rating", "4.2 Stars");
		product3details.put("Manufacturing Date", "Jan 2025");
		product3details.put("Expiry Date", "Jan 2027");
		
		List<Map<String,String>> productdetailsarray = new ArrayList<Map<String,String>>();
		productdetailsarray.add(product1details);
		productdetailsarray.add(product2details);
		productdetailsarray.add(product3details);
		
		Map<String, List<Map<String, String>>> alltabledetails=new HashMap<String, List<Map<String, String>>>();
		alltabledetails.put("StudentData", studentdetailsarray);
		alltabledetails.put("EmployeeData",employeedetailsarray);
		alltabledetails.put("ProductData",productdetailsarray );
		
		System.out.println("Suppliername of 2nd Row is:" + alltabledetails.get("ProductData").get(1).get("Supplier"));
		
		
	}
	

}
