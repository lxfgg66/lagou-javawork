/*
	ʹ��˫��ѭ��ʵ����������Ϸ���̵Ļ���
*/

public class Gobang {
	
	public static void main(String args[]) {
		
		// 1. ����һ���������ڴ洢���
		char[] num = {' ','0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		// 2.��ӡ����
		// 2.1 ��ӡ��һ��
  		for(int k = 0;k < num.length;k++){
			System.out.print(num[k] + " ");
		}
		System.out.println();
		// 2.2 ��ӡ������
		for(int i = 1; i < num.length;i++) {
			// 2.2.1 ��ӡ��һ�����
			System.out.print(num[i] + " ");
			// 2.2.2 ��ӡ�Ӻ�
			for(int j = 0; j < num.length - 1 ;j++) {
				System.out.print("+ ");
			}
			System.out.println();
		}
	}
}