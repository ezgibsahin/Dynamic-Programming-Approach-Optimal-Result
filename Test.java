import java.io.IOException;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) throws IOException{
		
		Scanner scn = new Scanner(System.in);
		Dynamic dyn = new Dynamic();
		
		System.out.print("Number of investments = ");
		int n = scn.nextInt();
		
		System.out.print("Enter the amount of money you invest = ");
		double M = scn.nextInt();
		
		System.out.print("How many years you will invest = ");
		int Y = scn.nextInt();
		
		int [] investment  = new int [n];
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter the id of the  investment = ");
		    investment[i] =  scn.nextInt();		
		}
		
		dyn.DP(M, Y, n, investment);
		
	}

}
