package assignments;

public class Assignment3EmpGroups {

	public static void main(String[] args) {
		Assignment3Employees employees=new Assignment3Employees();
		String[] employeenames=employees.employeenames;
        String[] employeeids=employees.employeeids;
        System.out.println("Employee Name:"+employeenames[0]+",Employee ID:"+employeeids[0]);
        System.out.println("Employee Name:"+employeenames[1]+",Employee ID:"+employeeids[1]);
        System.out.println("Employee Name:"+employeenames[2]+",Employee ID:"+employeeids[2]);
	}

}
