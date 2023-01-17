import java.io.*;
import java.util.StringTokenizer;
class Main {
	public static void main(String[] args){ 
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			int num = Integer.parseInt(br.readLine());
			StringTokenizer st;
			int a, b;
			for (int i=0; i< num; i++){
			    st = new StringTokenizer(br.readLine());
			    a = Integer.parseInt(st.nextToken());
			    b = Integer.parseInt(st.nextToken());
			    
			    bw.write((a+b) + "\n");
			}
			br.close();
			
			bw.flush();
			bw.close();
			
		
		} catch(IOException e){
		    e.printStackTrace();
		    System.out.println(e.getMessage());
		}
	
	}
}

// class Main {
// 	public static void main(String[] args) throws IOException { 
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
// 		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
// 		int num = Integer.parseInt(br.readLine());
// 		StringTokenizer st;
// 		int a, b;
// 		for (int i=0; i< num; i++){
// 			st = new StringTokenizer(br.readLine());
// 			a = Integer.parseInt(st.nextToken());
// 			b = Integer.parseInt(st.nextToken());
			    
// 			bw.write((a+b) + "\n");
// 		}
// 		br.close();
			
// 		bw.flush();
// 		bw.close();
// 	}
// }

