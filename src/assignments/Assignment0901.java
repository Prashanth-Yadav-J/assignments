package assignments;

public class Assignment0901 {

	public static void main(String[] args) {
		int[] sorting= {13,35,12,37,88,99,94};
		
		for(int i=0;i<sorting.length;i++) {
		
		for(int j=i+1;j<sorting.length;j++) {
		if(sorting[i]<sorting[j])
		{
			sorting[i]=sorting[i]+sorting[j];
			sorting[j]=sorting[i]-sorting[j];
			sorting[i]=sorting[i]-sorting[j];
		}
		}

		}
			
System.out.println("Second Largest Number is:"+sorting[1]);
System.out.println("Second Largest Number is:"+sorting[2]);

	}
}
