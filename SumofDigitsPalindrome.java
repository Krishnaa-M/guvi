import java.io.*;
public class SumofDigitsPalindrome {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer b= Integer.parseInt(a.readLine());
	int c=b%10;
	int d=b/10;
	int e=c+d;
	String str = "" + e;
	System.out.println(str);
	String reverse=new StringBuffer(str).reverse().toString();
	if((reverse).equals(str))
	{
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not a Palindrome");
}
}
