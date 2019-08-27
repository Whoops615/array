package by.pth.home02.main5;

/*
 * 13. Определить количество элементов последовательности натуральных чисел, кратных числу М и заключенных в
промежутке от L до N.
 */

public class Task13 {

	public static void main(String[] args) {

		int L = 20;
		int N = 40;
		int M = 4;
		int size = N - L;

		int[] mas = new int[size];
		
		fillMas(mas, L);
		Method.print(mas);
		System.out.println("\n------------------------------");
		
		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] % M == 0) {
				count++;
			}
		}
		System.out.println("Количесво кратных М: " + count);

	}

	public static void fillMas(int[] mas, int x) {
		for (int i = 0; i < mas.length; i++) {
			mas[i] = x;
			x++;
		}
	}

}
