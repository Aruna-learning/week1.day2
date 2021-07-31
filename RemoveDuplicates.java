package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String from which the duplicates have to be removed off
		String text = "We learn java basics as part of java sessions in java week1";
		//Split the words and put it in an array of strings using space as delimiter
		String[] splitText=text.split(" ");
		int length = splitText.length;
		System.out.println("The length of the String is "+length);
		System.out.println("The array of strings split are as below");
		for(int i=0;i<length;i++) 
			System.out.println("Split ["+i+"]"+splitText[i]);
		//Print the duplicate string;length is 12
		System.out.println("Now the duplicate strings within the array are");
		for(int i=0;i<length;i++) //first time i=0;j=1
		{
			for (int j=i+1;j<length;j++)
			{
				if(splitText[i].equals(splitText[j]))
						{
					System.out.println("The duplicate string is Split["+j+"] "+splitText[j]);
					break;
						}
			}
		}
	}
}
