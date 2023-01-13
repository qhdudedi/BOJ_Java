import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int result=0;
	    for (int i = 1; i <= num; i++){
	        result += i;
	    }
	    System.out.println(result);
	}
}
