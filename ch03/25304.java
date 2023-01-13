import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int total = s.nextInt();
	    int t_cnt = s.nextInt();
	    int sum[] = new int[t_cnt];
	    int total_sum = 0;
	    
	    for (int i=0; i< t_cnt; i++){
	        int price = s.nextInt();
	        int cnt = s.nextInt();
	        sum[i] = price * cnt;
	    }
	    for(int i=0; i< t_cnt; i++){
	        total_sum += sum[i];
	    }
	    if(total == total_sum) System.out.println("Yes");
	    else System.out.println("No");
	}
}
// 영수증 
