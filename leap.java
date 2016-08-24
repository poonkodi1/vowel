import java.util.Scanner;


public class leap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n ;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the");
		n=s.nextInt();
		if(n % 400 == 0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("not leap year");
		}

	}

}
