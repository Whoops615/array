package by.pth.home02.main7;

/*
 * 32. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
 */

public class Task32 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		System.out.println("По возрастанию:");
		increaseLine(mas);
		Method.print1(mas);

		System.out.println("По убыванию: ");
		decreaseLine(mas);
		Method.print1(mas);

	}

	public static void increaseLine(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas[i].length - 1; k++) {

					if (mas[i][k] > mas[i][k + 1]) {
						int temp;
						temp = mas[i][k];
						mas[i][k] = mas[i][k + 1];
						mas[i][k + 1] = temp;
					}
				}
			}
		}
	}

	public static void decreaseLine(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas[i].length - 1; k++) {

					if (mas[i][k] < mas[i][k + 1]) {
						int temp;
						temp = mas[i][k];
						mas[i][k] = mas[i][k + 1];
						mas[i][k + 1] = temp;
					}
				}
			}
		}
	}

}
