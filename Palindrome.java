import java.io.*;
public class Palindrome {
	public static void main(String[] args) throws IOException{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		String str=a.readLine();
		String reverse=new StringBuffer(str).reverse().toString();
		if((reverse).equals(str))
		{
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not a Palindrome");
	}
	}
