import java.io.*;
public class Leap {
public static void main(String [] args) throws IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer year=Integer.parseInt(a.readLine());
	if(year%400==0 && year%4==0 && year%100!=0)
	{
		System.out.println("Leap Year");
	}
	else if(year%100==0)
	{
		System.out.println("Not a Leap Year");
	}
	else
	{
		System.out.println("Not a Leap Year");
	}
}
}
