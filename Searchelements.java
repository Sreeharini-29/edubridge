package edujava;

public class Searchelements {
public static void tosearchelements(int array[],int searchval) {
	for(int ctr=0;ctr<array.length;ctr++)
	{
		if(array[ctr]==searchval){
			System.out.println("Element found at "+ ctr);
			break;
		}
	}
}
	

	public static void main(String args[]) {
		int array[]= {1,2,3,4,5};
		int searchval=0;
		tosearchelements(array,searchval);
	}
}
