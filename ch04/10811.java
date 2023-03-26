import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int tmp;

        for(int i=0; i<arr.length; i++){
            arr[i] =i+1;
        }
        for(int j=0; j<M; j++){
            st = new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken())-1;
            int J = Integer.parseInt(st.nextToken())-1;
            while(I <= J){
                tmp = arr[I];
                arr[I] = arr[J];
                arr[J]= tmp;
                I++;
                J--;
            }
        }
        for(int z=0; z<arr.length; z++){
            System.out.print(arr[z]+" ");
        }
        br.close();
    }
}
