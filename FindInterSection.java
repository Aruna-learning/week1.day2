package week1.day2;

public class FindInterSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1= {3,2,11,4,6,7};
		int[] arr2= {1,2,8,4,9,7};
		
		int arr1L=arr1.length;
		int arr2L=arr2.length;
		
		for (int a=0;a<arr1L;a++) 
		{
		for (int b=0;b<arr2L;b++)
		{
			if (arr1[a] == arr2[b])
			{
				System.out.println("Matching number is "+arr1[a]);
			}
		}
			
		}
	}

}
