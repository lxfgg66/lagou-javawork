/*
	ʵ��˫ɫ��齱��Ϸ�н���������ɣ��н������� 6 ���������� 1 �����������ɡ� 
	���к������Ҫ��������� 6 �� 1~33 ֮�䲻�ظ���������롣 �����������Ҫ��������� 1 �� 1~16 ֮���������롣
*/

import java.util.Random;
import java.util.Arrays;

public class DoubleColorBall {
	
	public static void main(String args[]) {
		
		// 1.���������������ڼ�¼���������������
		int[] red = new int[6];
		int[] blue = new int[1];
		
		// 2.������ɺ������
		Random r = new Random();
		for(int i = 0;i < 6;i++) {		//jΪ�Ѿ�ȷ���ĺ�������±꣬iΪ��Ҫ���ɵĺ������
			red[i] = r.nextInt(33) + 1; // ������ķ�ΧΪ[1,34)�е�����
			for(int j = 0;j < i;j++) {
				if(red[i] == red[j]) {
					red[i] = r.nextInt(33) + 1;
					j = 0;
				}
			}
		}			
		
		// 3.��������������
		blue[0] = r.nextInt(16) + 1; // ������ķ�ΧΪ[1,17)�е�����
		// 4.��ӡ���ɵĺ���
		System.out.println("�������Ϊ��" + Arrays.toString(red));
		System.out.println("�������Ϊ��" + Arrays.toString(blue));
	}
}