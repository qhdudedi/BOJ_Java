import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int num = s.nextInt();
	    int[] result = new int[num];
	    
	    for (int i = 0; i < num; i++){
	        int a = s.nextInt();
	        int b = s.nextInt();
	        
	        result[i] = a+b;
	    }
	    for (int c :result){
	        System.out.println(c);
	    }
	}
}
// for-each 쓰는 걸 늦게 떠올린 문제
