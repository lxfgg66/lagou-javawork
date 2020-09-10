/*
	编程实现打印1000以内的所有完数
*/

public class FindPerfectNumber {
	
	public static void main(String args[]) {
		
		// 每个数必有因子1，所以直接初始化为1
		int sum = 1;
		// 若一个数恰好等于它的真因子之和，则这个数为完数,1肯定不是完数，所以只用对2~1000进行判断
		for(int i = 2;i <= 1000;i++) {
			// 1. 计算出真因子之和
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			
			// 2.判断真因子之和是否与该数相等
			if(sum == i) {
				System.out.println("i=" + i); //i=6 i=28 i=496
			}
			
			// 3.重置sum为1
			sum = 1;
		}
	}
}