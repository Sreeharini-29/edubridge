package edujava;

public class Primenum {
	
	public static void main(String args[]) {
		int ctr=2;
		int num=27;
		int flag=0;
		
		
			for(ctr=2;ctr<num/2;ctr++)
			{
				if(num%ctr==0)
				{
					flag=1;
					System.out.println(num + "not a prime");
					break;
				}
			}
			if(flag==0)
			{System.out.println(num + "prime");
		}
		
	}	
		
	}
