package edujava;

public class Oddindexedelements {
		public static void main(String args[]){
			int arr[]= {5,9,7,3,1};
			int index;
			System.out.println("odd indexed elements");
			for(index=1;index<arr.length;index+=2) {
				System.out.println (arr[index]);
			
			}
		}
}
