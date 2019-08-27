package by.pth.home02.main6;

/*
 * 1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */

public class Task01 {

	public static void main(String[] args) {

		int[] mas = new int[7];
		int[] mas2 = new int[4];

		Method.randMas(mas);
		Method.randMas(mas2);

		Method.print(mas);
		Method.print(mas2);
		int k = 3;
		int j = 0;
		int j2 = 0;

		int[] mas3 = new int[11];

		for (int i = 0; i < mas3.length; i++) {
			if (i <= k) {
				mas3[i] = mas[j];
				j++;
			} else if (i > k & i <= k + mas2.length) {
				mas3[i] = mas2[j2];
				j2++;
			} else {
				mas3[i] = mas[j];
				j++;
			}
		}

		Method.print(mas3);

	}

}
