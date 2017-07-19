import java.io.*;
public class UpperCase {
public static void main(String[] args) throws IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	char ch;
	String result="";
	String s=a.readLine();
	for(int i=0;i<s.length();i++)
	{
		ch = s.charAt(i);
		if(ch==' ')
		{
			result+=" ";
		}
	
	if(Character.isLowerCase(ch))
	{
		result+=Character.toUpperCase(ch);
	}
	if(Character.isUpperCase(ch))
		{
		result+=Character.toLowerCase(ch);
		}
	}
	System.out.println(result);
}
}
