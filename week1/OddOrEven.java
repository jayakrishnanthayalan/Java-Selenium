package week1;
import java.util.*;
public class OddOrEven {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2==1)
			System.out.println("The given number is odd");
		else
			System.out.println("The given number is even");
		
		s.close();
	}

}
