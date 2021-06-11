package study.algorithm;

public class Brute_Force_Search {
	
	public static int sequentialSearch(int[] arr, int n, int x) {
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == x) return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};

		System.out.println(sequentialSearch(arr, arr.length, 3));
	}
}
