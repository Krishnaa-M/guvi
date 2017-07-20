import java.io.*;
public class PossibleSubsets {
public static void main(String[] args) throws IOException
{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	String s=a.readLine();
//	char b[]=s.toCharArray();
	Integer c=Integer.parseInt(a.readLine());
	String str="";
	for(int i=1;i<s.length();i++)
	{
		str="";
		str+=s.charAt(0);
		str+=s.charAt(i);
		System.out.println(str);
	}
}
}
