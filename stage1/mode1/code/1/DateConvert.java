/*
	编程实现根据年月日判断为一年中的第几天
*/

import java.util.Scanner;

public class DateConvert {
	public static void main(String args[]) {
		
		// 1.提示用户输入年月日
		System.out.print("请输入年月日：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		// 2.将年月日转换为第几天
		// 2.1 校验year是否合法
		if(year < 0){
			System.out.println("无效日期！");
			return;
		}
		
		// 2.2 校验day是否合法
		switch(month){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if(day < 1 || day > 31){
				System.out.println("无效日期！");
				return;
			}
			break;
			case 4:case 6:case 9:case 11:
			if(day < 1 || day > 30){
				System.out.println("无效日期！");
				return;
			}
			break;
			case 2:
			if(year % 4 == 0 && year % 100 != 0){
				if(day < 1 || day > 29){
					System.out.println("无效日期！"); 
					return;
				}
				break;
			}else{
				if(day < 1 || day > 28){
					System.out.println("无效日期！"); 
					return;
				}
				break;
			}
		}
		
		// 2.3 校验月份是否合法，同时将日期转换为天数
		int t = 0;           //记录天数
		switch(month){
			case 1: t = day;break;
			case 2: t = 31 + day; break;
			case 3: t = 31 + 28 + day;break;
			case 4: t = 31 + 28 + 31 + day;break;
			case 5: t = 31 + 28 + 31 + 30 + day;break;
			case 6: t = 31 + 28 + 31 + 30 + 31 + day;break;
			case 7: t = 31 + 28 + 31 + 30 + 31 + 30 + day;break;
			case 8: t = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;break;
			case 9: t = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;break;
			case 10: t = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;break;
			case 11: t = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;break;
			case 12: t = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;break;
			default: System.out.println("无效日期！");return;
		}
		if(year % 4 == 0 && year % 100 != 0 && month > 2){
			t += 1;
		}
		// 3.输出天数
		System.out.println(year + "年" + month + "月" + day + "日是一年的第" + t + "天");
	}
}