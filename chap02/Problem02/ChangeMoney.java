package chap02.Problem02;

import java.util.Scanner;

public class ChangeMoney {
	public static void main(String[] args) {
		int money;
		int a, b, c, d, e, f, g, h, i;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �׼� �Է�: ");		
		money = sc.nextInt();				//Scanner�� nextInt�� ���� ���� �׼��� int������ money�� ���� 
		
		a = money / 50000;																//�������� ����
		b = (money % 50000) / 10000;													//������ ����
		c = ((money % 50000) % 10000) / 5000;											//��õ���� ����
		d = (((money % 50000) % 10000) % 5000) / 1000;									//õ���� ����
		e = ((((money % 50000) % 10000) % 5000) % 1000) / 500;							//500��¥�� ���� ����
		f = (((((money % 50000) % 10000) % 5000) % 1000) % 500) / 100;					//100��¥�� ���� ����
		g = ((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) / 50;			//50��¥�� ���� ����
		h = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) / 10;	//10��¥�� ���� ����
		i = (((((((money % 50000) % 10000) % 5000) % 1000) % 500) % 100) % 50) % 10;	//1��¥�� ���� ����
		
		System.out.print("�������� "+a+"��, ������ "+b+"��, ��õ���� "+c+"��, õ����"+d+"��, 500��¥�� ����"+e);
		System.out.println("��, 100��¥�� ���� "+f+"��, 50��¥�� ����"+g+"��, 10��¥�� ���� "+h+"��, 1��¥�� ����"+i+"�� �̴�.");
		sc.close();
	}
}