import java.io.*;
public class StringtoInteger {
public static void main(String[] args) throws IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the String");
	String s=a.readLine();
	int b=Integer.parseInt(s);
	System.out.println(b);
}
}
