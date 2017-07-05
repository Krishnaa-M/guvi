import java.io.*;
public class Vowel{
	public static void main(String [] args) throws IOException{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		char b=a.readLine().charAt(0);
		if(b=='A' || b=='a' || b=='E' || b=='e' || b=='I' || b=='i' || b=='o' || b=='O' || b=='U' || b=='u')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}
}
