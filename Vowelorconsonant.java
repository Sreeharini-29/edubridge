package edujava;

public class Vowelorconsonant {
	public static void tocheckvowelorconsonant(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
		System.out.println( ch + "is vowel");
		else if(ch==' ')
			System.out.println(ch + "is whitespace");
		else
			System.out.println(ch + "is consonant");
	}
public static void main(String args[]) {
	char ch=' ';
	tocheckvowelorconsonant(ch);
	
}
}
