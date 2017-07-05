import java.io.*;
public class Alphabet {
	public static void main(String [] args) throws IOException{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		char b=a.readLine().charAt(0);
		if((b>='a' && b<='z') || (b>='A' && b<='Z'))
		{
			System.out.println("Alphabet");
		}
		else
		{
			System.out.println("Not an Alphabet");
		}
	}
}
