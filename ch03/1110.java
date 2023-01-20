import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int count = 0;
	    int copy_num = num;
	    do{
	        num = ((num % 10)*10) +( ((num / 10)+(num % 10)) % 10);
	        count++;
	    }while( copy_num != num);
		System.out.println(count);    
	}
}
