package edujava;

public class Statusofnum {
	public static void tocheckstatus(int num) {
		if(num%2==0&&num>0)
			System.out.println(num + "is poseven");
		else if(num%2!=0&&num>0)
			System.out.println(num + "is posodd");
		else if(num%2==0&&num<0)
			System.out.println(num + "is negeven");
		else  
			System.out.println(num + "is negodd");
		//else
			//System.out.println("enter valid value");
	}
	public static void main(String args[]) {
		int num = -11;
		tocheckstatus(num);
	}
		
	}


