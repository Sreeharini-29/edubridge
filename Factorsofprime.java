package edujava;

public class Factorsofprime {
	public static void main(String args[]) {
		int factor;
		int num=6;
		System.out.println("factors of primenum");
		System.out.print(1 + " ");
		for(factor=2;factor<=num/2;factor++)
		{
			if(num%factor==0)
			{
				System.out.print(factor + " ");
			}
		}
		System.out.print(num + " ");
	}

}
