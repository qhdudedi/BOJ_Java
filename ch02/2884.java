import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int H = s.nextInt();
	    int M = s.nextInt();
	    
	    if (M < 45){
	        H--;
	        M = 60 - (45-M);
	        if(H<0){
	            H = 23;
	        }
	        System.out.println(H +" "+M);
	    }
	    else System.out.println(H +" "+(M-45));
	    
    }
}
// 1. 45분보다 작은지 여부 확인
// 1-1. hour 가 0보다 작은지 여부 확인
// 2. 1번 조건 외 여부 
