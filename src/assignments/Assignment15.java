package assignments;

public class Assignment15 {

	public static void main(String[] args) {
		String sentence = "Java programming is fun and challenging";
		//1. Count the total number of words in the sentence.
		int sentencelength=sentence.length();
		System.out.println("The length of string is:"+sentencelength);
		//2. Print the sentence words in reverse order.
		String reversedstring="";
		for(int i=0;i<sentencelength;i++)
		{
			reversedstring=sentence.charAt(i)+reversedstring;
		}
		System.out.println("Reverse order of string:"+reversedstring);
		//3. Convert the first character of each word to uppercase and print original sentence
		String[] splitedsentence=sentence.split(" ");
		StringBuilder words=new StringBuilder();
		for(String s:splitedsentence)
		{
			String capitalized = Character.toUpperCase(s.charAt(0)) + s.substring(1);
			words.append(capitalized).append(" ");
		}
		System.out.println("Original Sentence: " + sentence);
        System.out.println("Converted Sentence: " + words.toString().trim());

	}

}
