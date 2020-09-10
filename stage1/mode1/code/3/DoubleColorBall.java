/*
	实现双色球抽奖游戏中奖号码的生成，中奖号码由 6 个红球号码和 1 个蓝球号码组成。 
	其中红球号码要求随机生成 6 个 1~33 之间不重复的随机号码。 其中蓝球号码要求随机生成 1 个 1~16 之间的随机号码。
*/

import java.util.Random;
import java.util.Arrays;

public class DoubleColorBall {
	
	public static void main(String args[]) {
		
		// 1.声明两个数组用于记录红球号码和篮球号码
		int[] red = new int[6];
		int[] blue = new int[1];
		
		// 2.随机生成红球号码
		Random r = new Random();
		for(int i = 0;i < 6;i++) {		//j为已经确定的红球号码下标，i为需要生成的红球号码
			red[i] = r.nextInt(33) + 1; // 随机数的范围为[1,34)中的整数
			for(int j = 0;j < i;j++) {
				if(red[i] == red[j]) {
					red[i] = r.nextInt(33) + 1;
					j = 0;
				}
			}
		}			
		
		// 3.随机生成篮球号码
		blue[0] = r.nextInt(16) + 1; // 随机数的范围为[1,17)中的整数
		// 4.打印生成的号码
		System.out.println("红球号码为：" + Arrays.toString(red));
		System.out.println("蓝球号码为：" + Arrays.toString(blue));
	}
}