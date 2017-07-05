import java.io.*;

public class Factorial {
public static void main(String [] args) throws NumberFormatException, IOException{
	BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
	int i,f=1;
	Integer c=Integer.parseInt(a.readLine());
	for(i=1;i<=c;i++)
	{
		f=f*i;
	}
	System.out.println(f);
}
}
