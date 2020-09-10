/*
	定义数组扩容规则，当已存储元素数量达到总容量的 80%时，扩容 1.5 倍。 
	例如，总容量是 10，当输入第 8 个元素时，数组进行扩容，容量从 10 变 15。
*/
import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;

public class DynamicArray {
	
	public static void main(String args[]) {
		
		// 1.声明一个初始容量为5的数组
		int[] arr = new int[5];
		int i = 0;
		
		// 2.用户向数组中输入数据
		Scanner sc = new Scanner(System.in);
		System.out.println("总容量为5，请输入数据：");
		do{
			// 2.1 用户输入一个数
			arr[i] =sc.nextInt();
			// 2.2 判断是否达到总容量的80%，若达到，则扩容1.5倍
			if(i >= 0.8 * arr.length - 1) { //4 7
				// 2.2.1 提示正在扩容数组
				System.out.println("已达到数组容量80%，正在扩容...");
				// 2.2.2 声明一个新数组，大小为原数组的1.5倍
				int[] temp = new int[(int)Math.ceil(arr.length * 1.5)];
				// 2.2.3 将原数组的数据拷贝到新数组
				System.arraycopy(arr,0,temp,0,(int)Math.ceil(arr.length * 0.8));
				// 2.2.4 将新数组的地址给arr
				arr = temp;
				// 2.2.5 提示扩容完成
				System.out.println("数据为：" + Arrays.toString(arr) + ",请检查是否有误！");
				System.out.println("扩容完成。\n总容量为" + arr.length + ",请继续输入："); //总容量为8，请继续输入：
																						//总容量为12，请继续输入：
			}
			i++;
		}while(true);
	}
}