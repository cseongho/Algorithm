package study.method;

import java.io.IOException;
import java.util.Arrays;

public class test {
	static int[] arr;
	static boolean[] chk;
	public static void main(String[] args) throws IOException {
		int n=5;
		arr=new int[n];
		chk=new boolean[n];
		permutation(0,n);
		
		String temp = "ddf";
		
		int[][] test = new int[5][6];
	
	}
	static void permutation(int v,int n) {
		if(v==n) {
			System.out.println(Arrays.toString(arr));
			return;
		}
		
		for(int i=0;i<n;i++) {
			if(!chk[i]) {
				chk[i]=true;
				arr[v]=i+1;
				permutation(v+1,n);
				chk[i]=false;
			}
		}
	}
}
