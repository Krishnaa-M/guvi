import java.util.*;
public class FactorialNumber {
	public static void main(String args[]){
	Scanner sc= new Scanner(System.in);
	Integer fact=1,i;
	Integer n=sc.nextInt();
	for(i=1;i<=n;i++){
	fact=fact*i;
	}
	System.out.println(fact);
	}
	}
