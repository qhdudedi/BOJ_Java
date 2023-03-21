import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int longNum = N /4;
		for(int i=0; i< longNum; i++) {
			System.out.print("long ");
		}
		System.out.print("int");
	}
}
