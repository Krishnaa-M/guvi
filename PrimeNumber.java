import java.io.*;
public class PrimeNumber{
public static void main(String[] args) throws IOException{
	BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
	Integer count=0;
	Integer b= Integer.parseInt(a.readLine());
	for(int i=2;i<b;i++){
		if(b%i==0)
		{
			count++;
		}
	}
		if(count==0){
		System.out.println("It is a Prime Number");
	}
	else
	{
		System.out.println("Not a Prime Number");
	}
	}
}
