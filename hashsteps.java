import java.io.*;
public class hashsteps
{
public static void main(String[] args) throws IOException
    {
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer b=Integer.parseInt(a.readLine());
	for(int i=1;i<=b;i++)
	{
		for(int j=1;j<=i;j++){
		System.out.print("#");
	}
	System.out.println("");
    }
	}
}
