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
