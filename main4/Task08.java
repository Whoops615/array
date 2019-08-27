package by.pth.home02.main4;

/*
 * 8. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число,
которое меньше максимального элемента массива, но больше всех других элементов).
 */

public class Task08 {

	public static void main(String[] args) {
		
		int[] mas = new int[10];
		Method.randMas(mas, 20);
		Method.print(mas);
		
		System.out.println("Второе по величине число в массиве: " + max2(mas));
		

	}
	
	public static int max2(int [] mas) {
		
		Method.sortMax(mas);
		int max2 = mas[1];
		return max2;
	}
	


}
