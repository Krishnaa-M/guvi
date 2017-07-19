import java.io.*;
	public class SumofOdd {
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
		int sum=0;
		Integer b=Integer.parseInt(a.readLine());
		for(int i=0;i<=b;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	}
