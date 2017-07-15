import java.io.*;
public class EvenNumber {
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
		Integer b= Integer.parseInt(a.readLine());
		Integer c= Integer.parseInt(a.readLine());
		for(int i=b;i<c;i++)
		{
		  		if(i%2==0)
		  		{
		  			System.out.println(i);
		  		}
		}
	}
	}
