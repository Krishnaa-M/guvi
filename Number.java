import java.io.*;
import java.util.Scanner;
public class Number {
public static void main(String[] args) throws IOException 
{
	int no,b=0;
	Scanner a= new Scanner(System.in);
	System.out.println("Enter any number : ");
	no =a.nextInt();
	if(no<0)
	{
		no=no * -1;
	}
	else if(no==0)
	{
		no=1;
	}
	while(no>0)
	{
		no=no/10;
		b++;
	}
	System.out.println("Number of Digits in given number is: "+b);
	}
}
