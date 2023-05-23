package edujava;

public class Evenseries { 
	public static void togenerateevenseries(int range) {
		System.out.println("even series");
		for(int ctr=2;ctr<=range;ctr+=2)
			{
			System.out.println(ctr + "");
			}
	}
	public static void main(String args[]) {
		int range=10;
		togenerateevenseries(range);
	}

}
