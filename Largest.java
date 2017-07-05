import java.io.*;
public class Largest {
public static void main(String [] args) throws IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer b=Integer.parseInt(a.readLine());
	Integer c=Integer.parseInt(a.readLine());
	Integer d=Integer.parseInt(a.readLine());
	if( b > c && b > d)
	{
		System.out.println(b);
	}
	else if(c > d && c > b)
	{
		System.out.println(c);
	}
	else
	{
		System.out.println(d);
	}
}
}
