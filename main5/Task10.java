package by.pth.home02.main5;

/*
 * 10. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */

public class Task10 {

	public static void main(String[] args) {

		int[] mas = new int[] { 0, 0, 1, 3, 6, 7, 8, 3, 3, 4 };

		for (int i = 0; i < mas.length; i++) {
			if (mas[i] > i) {
				System.out.print(mas[i] + " ");
			}
		}

	}

}
