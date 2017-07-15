import java.io.*;
public class PowerofNumber {
public static void main(String[] args) throws NumberFormatException, IOException{
	BufferedReader a= new BufferedReader(new InputStreamReader(System.in));
	Integer b=Integer.parseInt(a.readLine());
	Integer c=Integer.parseInt(a.readLine());
	System.out.println(Math.pow(b, c));
}
}
