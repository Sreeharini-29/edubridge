package edujava;

public class Multiplicationtable {
	public static void toprinttable(int num,int range) {
		System.out.println("multiplicationtable");
		for(int ctr=1;ctr<=range;ctr++) {
			System.out.println(num+"x"+ctr+"="+num*ctr);
		}
	}
public static void main(String args[]) {
	int num=5;
	int range=20;
	toprinttable(num,range);
	
}
}
