import java.io.*;
public class Positive {
public static void main(String [] args) throws IOException{
	BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
	Integer b=Integer.parseInt(a.readLine());
	if(b>0)
	{
		System.out.println("Positive");
	}
	else if(b<0)
	{
		System.out.println("Negative");
	}
	else if(b==0)
	{
		System.out.println("Zero");
	}
}
}
