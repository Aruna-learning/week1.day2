package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="changeme";
		String temp="";
		int lenStr=text.length();
		System.out.println("The lenth of the String "+text+" is "+lenStr);
		char[] charArray=text.toCharArray(); 
		for(int i=0;i<charArray.length;i++)
		{
			System.out.println("CharArray ["+i+"] is "+charArray[i]);
			if (i%2==0) {
				temp=temp+text.charAt(i);
				System.out.println(temp);
			}
			else {
				char changeCase=Character.toUpperCase(text.charAt(i));
				temp=temp+changeCase;
				System.out.println(temp);	
			}
		}
		
		
	}
}


