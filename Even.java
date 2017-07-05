import java.io.*;
public class Even {
	public static void main(String [] args) throws IOException{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		Integer b=Integer.parseInt(a.readLine());
		if(b%2==0)
		{
			System.out.println("Even");
		}
		if(b%2==1)
		{
			System.out.println("Odd");
		}
	}
}
