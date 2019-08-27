package by.pth.home02.main6;

/*
 * 2. Даны две последовательности
a1 < a2< an и b1 < b2 < bm . Образовать из них новую последовательность чисел
так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */

public class Task02 {

	public static void main(String[] args) {

		int[] mas1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] mas2 = new int[] { 2, 3, 4, 5, 6, 7, 9, 18 };

		int[] mas = new int[mas1.length + mas2.length];

		int j1 = 0;
		int j2 = 0;
		for (int i = 0; i < mas.length; i++) {
			if (j1 < mas1.length) {
				mas[i] = mas1[j1];
				j1++;
			} else {
				mas[i] = mas2[j2];
				j2++;
			}

		}
		sort(mas);
		Method.print(mas);

	}

	public static void sort(int[] mas) {
		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas.length - 1; j++) {

				if (mas[j] > mas[j + 1]) {
					int temp;
					temp = mas[j];
					mas[j] = mas[j + 1];
					mas[j + 1] = temp;
				}
			}
		}

	}

}
