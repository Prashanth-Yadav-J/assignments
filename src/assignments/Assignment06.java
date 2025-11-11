package assignments;

public class Assignment06 {

	public static void main(String[] args) {
		String[] studentnames= {"Suresh","Mahesh","Naresh"};
		int[] studentmarks= {75,80,82};
		int[] studentmarksassigned= new int[3];
		studentmarksassigned[0]=studentmarks[0]+10;
		studentmarksassigned[1]=studentmarks[1]+10;
		studentmarksassigned[2]=studentmarks[2]+10;
		int sumofstudentmarks=studentmarksassigned[0]+studentmarksassigned[1]+studentmarksassigned[2];
		float studentmarksaverage=sumofstudentmarks / 3;
		System.out.println(studentmarksaverage);
		

	}

}
