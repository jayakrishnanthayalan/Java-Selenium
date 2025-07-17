package week2;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String str="Jayakrishnan";
		for(int i=str.length()-1;i>=0;i--)
		{
			System.out.print(str.charAt(i));
		}
	}
}
