package ua.lviv1.lgs;

public class Application {
	
	public static void main(String[] args) {
		int int1 = 1;
		int int2 = 2;
		int res1 = int1 ^ int2;
		boolean res2 = int1<0 && int2<3;
		System.out.print(res1);
		System.out.println(res2);
		
		//Example 2 
//		int a = 0;
//		int b = a++; //b = a,  � ��� ���� ���������� ���������  b = a / a++;
//		int c = a++; // c = 1 (a++), � ��� ���� ���������� ������  ���������
//		System.out.println("example2 = " + a + " " + b + " " + c);
		
		
		//int a = 2;
		//int b = --a; // - ������ ��������� �����, � ���� �� ��������� b
		//System.out.println("a = " + a);
		//System.out.println("b = " + b);
		
		
		//System.out.println(" ");
		
		
		//Example 4 ��������� �������� a = (condition) ? if true : if false;
		//int f = 2;		
		//int r = f > 0 ? -3 : 2; //  ? - ���� ����� true ����� ��, �� ���� ?, : - ���� ����� false ����� ��, �� ���� :,
		//System.out.println("r = " + r);
		
		
		//Example 5 ����� ���������
//		boolean j = true;
//		boolean k = false;
//		boolean l = j | k; // 1 + 0 = 1 (�� | = +) 
//		boolean n = j & k; // 1 * 0 = 0 (�� & = *)
//		boolean m = (!j & k) | (j & !k); // (0 * 0) + (1 * 1) = 1
//		boolean o = !j;
//		
//		System.out.println("j = " + j);
//		System.out.println("k = " + k);
//		System.out.println("l = " + l);
//		System.out.println("n = " + n);
//		System.out.println("m = " + m);
//		System.out.println("o = " + o);
//		
//		
//		System.out.println(" ");
		
		
		//Exemple 6 ��������� �������� + string
//		int a = 9;
//		int b = 9;
//		String result = (a >= b) ? "yes" : "no";
//		
//		System.out.println(result); 


//		//Example 7: switch - default �� ����'�������
//		int k1 = 6;
//		switch (k1) {
//		case 1: case 4: case 5: 
//			System.out.println("1, 4, 5");
//		case 6: 
//			System.out.println(6);
//			break;
//		case 9: 
//			System.out.println(9);
//		default:
//			System.out.println("default");
//			break;
//		}
		
		
//		//experiment
//		int i = 7;
//		i++;
//		System.out.println(i++);
		
		
		//Example 8: ARRAYS
//		int [] array1 = new int [10];
//		double [] array2 = new double [10];
//		double [] array3 = {4.5, 78.7, 3.5, 54.6};
//		
//		for (int i = 0; i < array1.length; i++) {
//			array1[i] = i;
//			array2[i] = i*i;
//			System.out.print(array1[i] + " -> "); // ��� ln ���� �� �������� ���� �� ����� �����
//			System.out.println(array2[i]); // � � ln - ��������
//		}
//		
//		for (int i = 0; i < array3.length; i++) {
//			System.out.println(array3[i]);
//		}
		
		
		//Example 9 �������� �������� (Wrappers primitives)
//		Byte a1 = 2;
//		Short a2 = 2;
//		Integer a3 = 2;
//		Long a4 = 2L;
//		
//		int a5 = a1; // ������������, ����������������� ����� � ������� � �������
//		a3 = a5; // ������ � �������� � ������ (��� ���� ����� ����� ���� �������!)
//		
//		Double b1 = 2.2;
//		Float b2 = 2.2F;
		
		
		System.out.println("Max value Byte = " + Byte.MAX_VALUE);
		System.out.println("Min value Byte = " + Byte.MIN_VALUE);
		
		//first commit to gitHub
		
	}

}
