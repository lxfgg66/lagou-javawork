/*
	�����������ݹ��򣬵��Ѵ洢Ԫ�������ﵽ�������� 80%ʱ������ 1.5 ���� 
	���磬�������� 10��������� 8 ��Ԫ��ʱ������������ݣ������� 10 �� 15��
*/
import java.util.Scanner;
import java.lang.System;
import java.util.Arrays;

public class DynamicArray {
	
	public static void main(String args[]) {
		
		// 1.����һ����ʼ����Ϊ5������
		int[] arr = new int[5];
		int i = 0;
		
		// 2.�û�����������������
		Scanner sc = new Scanner(System.in);
		System.out.println("������Ϊ5�����������ݣ�");
		do{
			// 2.1 �û�����һ����
			arr[i] =sc.nextInt();
			// 2.2 �ж��Ƿ�ﵽ��������80%�����ﵽ��������1.5��
			if(i >= 0.8 * arr.length - 1) { //4 7
				// 2.2.1 ��ʾ������������
				System.out.println("�Ѵﵽ��������80%����������...");
				// 2.2.2 ����һ�������飬��СΪԭ�����1.5��
				int[] temp = new int[(int)Math.ceil(arr.length * 1.5)];
				// 2.2.3 ��ԭ��������ݿ�����������
				System.arraycopy(arr,0,temp,0,(int)Math.ceil(arr.length * 0.8));
				// 2.2.4 ��������ĵ�ַ��arr
				arr = temp;
				// 2.2.5 ��ʾ�������
				System.out.println("����Ϊ��" + Arrays.toString(arr) + ",�����Ƿ�����");
				System.out.println("������ɡ�\n������Ϊ" + arr.length + ",��������룺"); //������Ϊ8����������룺
																						//������Ϊ12����������룺
			}
			i++;
		}while(true);
	}
}