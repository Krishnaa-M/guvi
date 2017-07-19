import java.io.*;
public class OddNumbers {
public static void main(String[] args)
{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	for(int i=0;i<20;i++)
	{
		if(i%2!=0)
		{
			System.out.println(i);
		}
	}
}
}
