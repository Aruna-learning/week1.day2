package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text="mom";
		String rev="";
		int textLength=text.length();
		System.out.println("Lenth of the String " + text + " is "+ textLength);
		
		for(int i=textLength-1;i>=0;i--) {
			rev=rev+text.charAt(i);
			System.out.println(rev);
		}
		
	if (rev.equals(text))
	System.out.println("The String is a Palindrome");
	else
		System.out.println("The String is not a Palindrome");
	}

}
