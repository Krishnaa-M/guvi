import java.io.*;
public class SumofN {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer sum=0;
	Integer b=Integer.parseInt(a.readLine());
	for(int i=0;i<=b;i++)
	{
		sum=sum+i;
	}
	System.out.println(sum);
}
}
