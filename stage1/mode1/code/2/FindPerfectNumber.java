/*
	���ʵ�ִ�ӡ1000���ڵ���������
*/

public class FindPerfectNumber {
	
	public static void main(String args[]) {
		
		// ÿ������������1������ֱ�ӳ�ʼ��Ϊ1
		int sum = 1;
		// ��һ����ǡ�õ�������������֮�ͣ��������Ϊ����,1�϶���������������ֻ�ö�2~1000�����ж�
		for(int i = 2;i <= 1000;i++) {
			// 1. �����������֮��
			for(int j = 2;j < i;j++) {
				if(i % j == 0) {
					sum += j;
				}
			}
			
			// 2.�ж�������֮���Ƿ���������
			if(sum == i) {
				System.out.println("i=" + i); //i=6 i=28 i=496
			}
			
			// 3.����sumΪ1
			sum = 1;
		}
	}
}