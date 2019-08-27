package by.pth.home02.main5;

/*
 * 4. Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

public class Task04 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 8 };
		boolean a = true;

		for (int i = 0; i < mas.length - 1; i++) {

			if (mas[i] < mas[i + 1]) {
				a = true;
			} else {
				a = false;
				break;
			}

		}

		if (a == true) {
			System.out.println("Является возрастающей");
		} else {
			System.out.println("Не является возрастающей");
		}

	}

}
