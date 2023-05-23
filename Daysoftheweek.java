package edujava;

public class Daysoftheweek {
	public static void toprintdaysofweek(int num) {
	if(num>=1&&num<=7) {
		if(num==1)
			System.out.println("sunday");
		 if(num==2)
			System.out.println("monday");
		 if(num==3)
			System.out.println("tuesday");
		if(num==4)
			System.out.println("wednesday");
	    if(num==5)
			System.out.println("thursday");
		 if(num==6)
			System.out.println("friday");
		if (num==7)
			System.out.println("saturday");}
		else
			System.out.println("enter valid value");
	}
	public static void main(String args[]) {
		int num =9;
		toprintdaysofweek(num);
	}
	}


