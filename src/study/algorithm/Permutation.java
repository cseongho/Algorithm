package study.algorithm;

public class Permutation {
	static int N = 4;
	static int[] Nums = {1,2,3,4};
	
	static int solve(int pos, int cnt, int val) {
		if (cnt == 2) return val;
		if (pos == N) return -1;
		
		int ret = 0;
		ret = Math.max(ret, solve(pos + 1, cnt + 1, val + Nums[pos]));
		ret = Math.max(ret, solve(pos + 1, cnt, val));
		
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(solve(0, 0, 0));
	}
	
	//Combining the two largest numbers.
}
