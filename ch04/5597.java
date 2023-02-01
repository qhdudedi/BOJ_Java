import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        boolean[] arr = new boolean[31];
	        for(int i=1; i<29; i++){
	            int stu = Integer.parseInt(br.readLine());
	            arr[stu] = true;
	        }
	        for(int i=1; i<arr.length; i++){
	            if(arr[i] != true) System.out.println(i);
	        }
	        br.close();
	}
}
// import java.util.*;

// public class b_5597 {
// 	public static void main(String[] args) {
// 		Scanner s = new Scanner(System.in);
// 		boolean[] arr = new boolean[31];
		
// 		for(int i=1; i< 29; i++){
//             int stu = s.nextInt();
//             arr[stu] = true;
// 		}
// 		for (int i = 1; i< arr.length; i++) {
// 			if (arr[i] != true)
// 				System.out.println(i);
// 		}
// 		s.close();
		
// 	}

// }
