import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int sc = s.nextInt();
	    if (sc >= 90 && sc <= 100){
	        System.out.println("A");
	    }
	    else if(sc >= 80 && sc <= 89){
	        System.out.println("B");
	    }
	    else if (sc >= 70 && sc <= 79){
	        System.out.println("C");
	    }
	    else if (sc >= 60 && sc <= 69){
	        System.out.println("D");
	    }
	    else System.out.println("F");
	}
}
