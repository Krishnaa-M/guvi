import java.util.*;
public class RepeatedCharacters {
	  public static void main(String args[]){
	    Scanner sc= new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1=str.toLowerCase();
	    char ch[]= str1.toCharArray(); 
	    int n =ch.length;    
	    Integer i,j;
	    for(i=0;i<n;i++){
	      for(j=0;j<n;j++){
	        if((ch[i]==ch[j])&&(i!=j))
	        ch[j]='\0';
	      }}
	    for(i=0;i<n;i++)
	    if(ch[i]!='\0')
	    System.out.print(ch[i]);
	  }
	  }
