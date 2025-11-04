package assignments;

public class Assignment02 {
	
	/**1. Create a 3D array to represent the 
	 following data:*/

	public static void main(String[] args) {
		
		// Semesters as the first dimension.
		String [] semester= {"Sem 1","Sem 2","Sem 3","Sem 4","Sem 5"};
		
		// Subjects and Status/Marks as the second dimension.
		String [][] subjectstatusmarks = {{"Subject 1","Pass(78)"},{"Subject 2","Pass(85)"},{"Subject 3","Fail(21)"},{"Subject 4","Pass(74)"},{"Subject 5","Pass(88)"},{"Subject 6","Pass(79)"},
				{"Subject 1","Pass(82)"},{"Subject 2","Pass(77)"},{"Subject 3","Pass(93)"},{"Subject 4","Fail(19)"},{"Subject 5","Fail(24)"},{"Subject 6","Pass(90)"},
				{"Subject 1","Pass(88)"},{"Subject 2","Pass(81)"},{"Subject 3","Pass(76)"},{"Subject 4","Fail(32)"},{"Subject 5","Pass(85)"},{"Subject 6","Pass(78)"},
				{"Subject 1","Pass(91)"},{"Subject 2","Pass(73)"},{"Subject 3","Fail(19)"},{"Subject 4","Pass(80)"},{"Subject 5","Pass(76)"},{"Subject 6","Pass(87)"},
				{"Subject 1","Pass(86)"},{"Subject 2","Pass(88)"},{"Subject 3","Pass(84)"},{"Subject 4","Pass(95)"},{"Subject 5","Pass(73)"},{"Subject 6","Pass(90)"}};
		
		//Actual values for Subject Names and Marks as the third dimension.
		String [][][] subjectnamesmarks = {{{"Sem 1","Mathematics I","Pass(78)"},{"Sem 1","Physics","Pass(85)"},{"Sem 1","Chemistry","Fail(21)"},{"Sem 1","Computer Programming","Pass(74)"},{"Sem 1","Engineering Drawing","Pass(88)"},{"Sem 1","Basic Electrical Eng.","Pass(79)"}},
				{{"Sem 2","Mathematics II","Pass(82)"},{"Sem 2","Mechanics","Pass(77)"},{"Sem 2","Environmental Sci.","Pass(93)"},{"Sem 2","Basic Electronics","Fail(19)"},{"Sem 2","Engineering Physics","Fail(24)"},{"Sem 2","Engineering Graphics","Pass(90)"}},
				{{"Sem 3","Data Structures","Pass(88)"},{"Sem 3","Discrete Mathematics","Pass(81)"},{"Sem 3","Digital Electronics","Pass(76)"},{"Sem 3","Operating Systems","Fail(32)"},{"Sem 3","Signals and Systems","Pass(85)"},{"Sem 3","Object-Oriented Prog.","Pass(78)"}},
				{{"Sem 4","Algorithms","Pass(91)"},{"Sem 4","Computer Networks","Pass(73)"},{"Sem 4","Database Systems","Fail(19)"},{"Sem 4","Microprocessors","Pass(80)"},{"Sem 4","Communication Eng.","Pass(76)"},{"Sem 4","Software Engineering","Pass(87)"}},
				{{"Sem 5","Probability & Stats","Pass(86)"},{"Sem 5","Machine Learning","Pass(88)"},{"Sem 5","Compiler Design","Pass(84)"},{"Sem 5","Theory of Computation","Pass(95)"},{"Sem 5","Embedded Systems","Pass(73)"},{"Sem 5","Computer Graphics","Pass(90)"}}};
		
		//semester 2 subject 4 name
		String sem2subject4=subjectnamesmarks[1][3][1];
		
		//semester 2 subject 5 name
		String sem2subject5=subjectnamesmarks[1][4][1];
		
		//2.1 From the array:Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 Subject 4 and Subject 5 names:"+sem2subject4+" & "+sem2subject5);
		
		//semester 4 subject 3 Status/Marks
		String sem4subject3statusmarks=subjectnamesmarks[3][2][2];
		
		//semester 4 subject 6 Status/Marks
		String sem4subject6statusmarks=subjectnamesmarks[3][5][2];
		
		//2.2 Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("The Status/Marks of Semester 4 Subject 3 and Subject 6:"+sem4subject3statusmarks+" & "+sem4subject6statusmarks );

	}

}
