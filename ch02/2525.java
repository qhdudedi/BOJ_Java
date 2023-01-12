import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int H = s.nextInt();
	    int M = s.nextInt();
	    int T = s.nextInt();
	    
	    int total_T = H * 60 + M;
	    total_T += T;

	    int total_h = (total_T / 60)%24;
	    int total_m = (total_T % 60);
	    
	    System.out.println(total_h + " " + total_m);
	}
}
