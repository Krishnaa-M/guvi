import java.io.*;
public class Natural {
  public static void main(String [] args) throws IOException{
    BufferedReader a=new BufferedReader(new InputStreamReader(System.in));
    int i,sum=0;
    Integer b=Integer.parseInt(a.readLine());
    for( i=0;i<=b;i++)
    {
      sum=sum+i;
    }
    System.out.println(sum);
  }
}
