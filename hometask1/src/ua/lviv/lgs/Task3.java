package ua.lviv.lgs;

public class Task3 {
	
public static void main(String[] args) {
		
		int [] array1 = {3, 6, 56, 453, 6433, 9876, 35, 76, 354, 23};
		int max = array1[0];
		int min = array1[0];
		
		for (int i = 1; i < array1.length; i++) {
			if (max < array1[i])
				max = array1[i];
			else if (min > array1[i])
				min = array1[i];
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

	}


}
