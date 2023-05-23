package edujava;

public class Continueeg {
	public static void main(String args[]) {
		String name="sree harini";
		char ch='i';
		int index=0;
		for(index=0;index<name.length();index++)
		{if(name.charAt(index)== ch)
			continue;
		System.out.print(name.charAt(index));
		}
	}

}
