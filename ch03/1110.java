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

// import java.io.*;
// public class Main
// {
// 	public static void main(String[] args) throws IOException {
// 	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
// 	    int num = Integer.parseInt(br.readLine());
// 	    int count = 0;
// 	    int copy_num = num;
// 	    do{
// 	        num = ((num % 10)*10) +( ((num / 10)+(num % 10)) % 10);
// 	        count++;
// 	    }while( copy_num != num);
// 		System.out.println(count);
// 		br.close();
			
// 		bw.flush();
// 		bw.close();
// 	}
// }
