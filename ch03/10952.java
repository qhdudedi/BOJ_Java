import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		while(true){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    
		    if(a + b == 0) {
		        break;
		    }
		    System.out.println(a+b);
		}
		s.close();
	}
}

/ ** 
import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
	    
		Scanner s = new Scanner(System.in);
			
		while(true){
		    int A = s.nextInt();
		    int B = s.nextInt();
		    
		    if (A==0 && B==0){
		        break;
		    }
		    System.out.println(A+B);
		}
		s.close();
	}
}
**/
