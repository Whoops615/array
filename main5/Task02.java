package by.pth.home02.main5;

/*
 * 2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */

public class Task02 {

	public static void main(String[] args) {

		int[] mas = new int[] { 0, 0, 1, 0, 0, 0, 0, 1 };
		int n = numberOfElements(mas);
		int[] mas2 = new int[n];
		int count = 0;

		for (int i = 0; i < mas.length; i++) {

			if (mas[i] == 0) {
				mas2[count] = i;
				System.out.print(mas2[count] + " ");
				count++;
			}
		}

	}

	public static int numberOfElements(int[] mas) {

		int amount = 0;
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] == 0) {
				amount++;
			}
		}
		return amount;
	}

}
