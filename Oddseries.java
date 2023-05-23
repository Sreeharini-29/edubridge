package edujava;

public class Oddseries{
		public static void togenerateoddseries(int range) {
			System.out.println("Odd series");
			for(int ctr=1;ctr<=range;ctr+=2)
				{
				System.out.println(ctr + "");
				}
		}
		public static void main(String args[]) {
			int range=10;
			togenerateoddseries(range);
		}

	}



