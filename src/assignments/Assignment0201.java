package assignments;

public class Assignment0201 {

	public static void main(String[] args) {
		// 3D array
		String[][][] data= 
			{
			{{"Sem 1","Subject 1 and Pass(78)","Mathematics I and 78"},
			{"Sem 1","Subject 2 and Pass(85)","Physics and 85"},
			{"Sem 1","Subject 3 and Fail(21)","Chemistry and 21"},
			{"Sem 1","Subject 4 and Pass(74)","Computer Programming and 74"},
			{"Sem 1","Subject 5 and Pass(88)","Engineering Drawing and 88"},
			{"Sem 1","Subject 6 and Pass(79)","Basic Electrical Eng. and 79"}},
			
			{{"Sem 2","Subject 1 and Pass(82)","Mathematics II and 82"},
			 {"Sem 2","Subject 2 and Pass(77)","Mechanics and 77"},
			 {"Sem 2","Subject 3 and Pass(93)","Environmental Sci. and 93"},
			 {"Sem 2","Subject 4 and Fail(19)","Basic Electronics and 19"},
			 {"Sem 2","Subject 5 and Fail(24)","Engineering Physics and 24"},
			 {"Sem 2","Subject 6 and Pass(90)","Engineering Graphics and 90"}},

			{{"Sem 3","Subject 1 and Pass(88)","Data Structures and 88"},
			 {"Sem 3","Subject 2 and Pass(81)","Discrete Mathematics and 81"},
			 {"Sem 3","Subject 3 and Pass(76)","Digital Electronics and 76"},
			 {"Sem 3","Subject 4 and Fail(32)","Operating Systems and 32"},
			 {"Sem 3","Subject 5 and Pass(85)","Signals and Systems and 85"},
			 {"Sem 3","Subject 6 and Pass(78)","Object-Oriented Prog. and 78"}},

			{{"Sem 4","Subject 1 and Pass(91)","Algorithms and 91"},
			 {"Sem 4","Subject 2 and Pass(73)","Computer Networks and 73"},
			 {"Sem 4","Subject 3 and Fail(19)","Database Systems and 19"},
			 {"Sem 4","Subject 4 and Pass(80)","Microprocessors and 80"},
			 {"Sem 4","Subject 5 and Pass(76)","Communication Eng. and 76"},
			 {"Sem 4","Subject 6 and Pass(87)","Software Engineering and 87"}},

			{{"Sem 5","Subject 1 and Pass(86)","Probability & Stats and 86"},
			 {"Sem 5","Subject 2 and Pass(88)","Machine Learning and 88"},
			 {"Sem 5","Subject 3 and Pass(84)","Compiler Design and 84"},
			 {"Sem 5","Subject 4 and Pass(95)","Theory of Computation and 95"},
			 {"Sem 5","Subject 5 and Pass(73)","Embedded Systems and 73"},
			 {"Sem 5","Subject 6 and Pass(90)","Computer Graphics and 90"}}};
		
		        //semester 2 subject 4 name
				String datasem2subject4=data[1][3][2];
				
				//semester 2 subject 5 name
				String datasem2subject5=data[1][4][2];
				
				//2.1 From the array:Print Semester 2 Subject 4 and Subject 5 names.
				System.out.println("Semester 2 Subject 4 and Subject 5 names:"+datasem2subject4+" & "+datasem2subject5);
				
				//semester 4 subject 3 Status/Marks
				String datasem4subject3statusmarks=data[3][2][1];
				
				//semester 4 subject 6 Status/Marks
				String datasem4subject6statusmarks=data[3][5][1];
				
				//2.2 Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
				System.out.println("The Status/Marks of Semester 4 Subject 3 and Subject 6:"+datasem4subject3statusmarks+" & "+datasem4subject6statusmarks );
	}

}
