package SeleniumProject.SeleniumProject;

public class Interview {
	
	public static void findTheLargestNumberInAnArray()
	{
		int numbers[] = {100,1001,201,901};
		int largest = numbers[0];
		for(int i = 1 ; i < numbers.length ; i++)
		{
			if(largest < numbers[i])
				largest = numbers[i];
		}
		System.out.println("Largest element is : "+largest);
	}
	
	public static String reverse(String str)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1 ; i >=0 ; i--)
		{
			sb.append(str.charAt(i));
		}
		return sb.toString();
	}
	
	static void CountVowels(String str)
	{
		int count = 0;
		String vowels = "aeiouAEIOU";
		for(int i = 0 ; i < str.length()-1;i++)
		{
			char ch = str.charAt(i);
			if(vowels.indexOf(ch)!= -1)
				count++;
		}
		System.out.println("Number of vowels in the string: " + count);
	}
 public static void main(String[] args) {
	
	 
	 CountVowels("LIHSUS");
}
}
