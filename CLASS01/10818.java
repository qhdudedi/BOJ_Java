package com.algo.CLASS01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj10818 {
    static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            br.close();
        }
        int min = nums[0];
        int max = nums[0];
        for(int i=0; i<n; i++) {
            if (min > nums[i]) {
                min = nums[i];
            }
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.print(min+" "+max);
    }
}
