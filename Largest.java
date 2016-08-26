import java.util.*;
public class Largest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the valueof a:");
		a=s.nextInt();
		System.out.println("enter the value of b:");
		b=s.nextInt();
		System.out.println("enter the values of c:");
		c=s.nextInt();
		if(a>b && a>c)
		{
			System.out.println("a is largest");
		}
		else if(b>c)
		{
			System.out.println("b is largest");
		}
		else
		{
			System.out.println("c is largest");
		}
	}

}
