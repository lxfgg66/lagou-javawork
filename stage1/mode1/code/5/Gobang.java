/*
	使用双重循环实现五子棋游戏棋盘的绘制
*/

public class Gobang {
	
	public static void main(String args[]) {
		
		// 1. 声明一个数组用于存储序号
		char[] num = {' ','0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		// 2.打印棋盘
		// 2.1 打印第一行
  		for(int k = 0;k < num.length;k++){
			System.out.print(num[k] + " ");
		}
		System.out.println();
		// 2.2 打印其余行
		for(int i = 1; i < num.length;i++) {
			// 2.2.1 打印第一列序号
			System.out.print(num[i] + " ");
			// 2.2.2 打印加号
			for(int j = 0; j < num.length - 1 ;j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
	}
}