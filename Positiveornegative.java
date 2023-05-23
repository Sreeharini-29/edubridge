package edujava;

public class Positiveornegative { 
	public static void tochecknumber(int num)
	{
		if(num>0)
			System.out.println(num + "is positive");
		else if (num<0)
			System.out.println(num + "is negative");
		else
			System.out.println("zero");
	}
	public static void main(String args[])
	{
		int num = 0;
		tochecknumber(num);
	}

}
