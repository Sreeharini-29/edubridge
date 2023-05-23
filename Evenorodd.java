package edujava;

public class Evenorodd {
public static void tocheckevenorodd(int num) {
	if(num%2==0)
		System.out.println(num + "is even");
	//else if(num%2!=0)
		//System.out.println(num + "is odd");
	else
		System.out.println(num + "is odd");
	
}public static void main(String args[]) {
	int num = 9;
	tocheckevenorodd(num);
}
}
