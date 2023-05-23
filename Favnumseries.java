package edujava;

public class Favnumseries { 
	public static void toprintfavseries(int favnum) {
	
		for(int ctr=1;ctr<=favnum;ctr++)
		{
			System.out.println(ctr);
			
		}
	}
public static void main(String args[]) {
	int favnum=6;
	toprintfavseries(favnum);
}
}
