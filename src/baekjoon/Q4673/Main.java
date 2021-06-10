package baekjoon.Q4673;

public class Main {
	static int check(int num) {
		int tmp = num;
		if(num >= 10000) { 
			tmp += num/10000; 
			num %= 10000; 
		}
		if(num >= 1000) { 
			tmp += num/1000; 
			num %= 1000; 
		}
		if(num >= 100) { 
			tmp += num/100; 
			num %= 100; 
		}
		if(num >= 10) { 
			tmp += num/10; 
			num %= 10; 
		}
		return tmp += num;
	}
	
	public static void main(String[] args) {
		boolean[] num = new boolean[10036];
		
		for(int i = 1; i <= 10000; i++) {
			num[check(i)] = true;
			if(!num[i]) System.out.println(i);
		}
	}
}