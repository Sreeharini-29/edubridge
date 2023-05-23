package edujava;
public static void main(String args[]) {
	int ctr;
	int ctr1;
	int array[][]= {{5,2},{6,8,9},{3}};
	{
		for(ctr=0;ctr<array.length;ctr++)
		{
			for(ctr1=0;ctr1<array[0].length;ctr1++) {
				System.out.println(array[ctr][ctr1] + " ");
		}
		System.out.println();
		}
}
}