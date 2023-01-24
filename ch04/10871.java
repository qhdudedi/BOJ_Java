import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        for (int i = 0; i < n; i++) {
            int num = s.nextInt();
            if(num < a ){
                System.out.print(num + " ");
            }
        }
    }
}
    
