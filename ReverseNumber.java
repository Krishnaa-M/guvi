import java.io.*;
public class ReverseInteger {
	  public static void main(String[] args) throws IOException {
			BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
			String b=a.readLine();
			String c=new StringBuffer(b).reverse().toString();
			System.out.println(c);
  }
}
