package study.algorithm;

public class Combination {
	static int N = 4;
	static int[] Nums = {1,2,3,4};
	
	static int solve(int cnt, int used, int val) {
		if (cnt == 2) return val;
		
		int ret = 0;
		for(int i = 0; i < N; i++) {
			if((used & 1 << 1) != 0) continue;
			ret = Math.max(ret, solve(cnt + 1, used | 1 << i, val * 10 + Nums[i]));
		}
		return ret;
	}
	
	public static void main(String[] args) {
		System.out.println(solve(0, 0, 0));
	}
	
	//Find the biggest double digit.
}
