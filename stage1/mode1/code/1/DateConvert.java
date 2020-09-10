/*
	���ʵ�ָ����������ж�Ϊһ���еĵڼ���
*/

import java.util.Scanner;

public class DateConvert {
	public static void main(String args[]) {
		
		// 1.��ʾ�û�����������
		System.out.print("�����������գ�");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int month = sc.nextInt();
		int day = sc.nextInt();
		
		// 2.��������ת��Ϊ�ڼ���
		// 2.1 У��year�Ƿ�Ϸ�
		if(year < 0){
			System.out.println("��Ч���ڣ�");
			return;
		}
		
		// 2.2 У��day�Ƿ�Ϸ�
		switch(month){
			case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			if(day < 1 || day > 31){
				System.out.println("��Ч���ڣ�");
				return;
			}
			break;
			case 4:case 6:case 9:case 11:
			if(day < 1 || day > 30){
				System.out.println("��Ч���ڣ�");
				return;
			}
			break;
			case 2:
			if(year % 4 == 0 && year % 100 != 0){
				if(day < 1 || day > 29){
					System.out.println("��Ч���ڣ�"); 
					return;
				}
				break;
			}else{
				if(day < 1 || day > 28){
					System.out.println("��Ч���ڣ�"); 
					return;
				}
				break;
			}
		}
		
		// 2.3 У���·��Ƿ�Ϸ���ͬʱ������ת��Ϊ����
		int t = 0;           //��¼����
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
			default: System.out.println("��Ч���ڣ�");return;
		}
		if(year % 4 == 0 && year % 100 != 0 && month > 2){
			t += 1;
		}
		// 3.�������
		System.out.println(year + "��" + month + "��" + day + "����һ��ĵ�" + t + "��");
	}
}