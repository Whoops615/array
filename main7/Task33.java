package by.pth.home02.main7;

/*
 * 33. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */

public class Task33 {

	public static void main(String[] args) {

		int[][] mas = new int[5][5];
		Method.masRand(mas, 10);
		Method.print1(mas);

		System.out.println("По возрастанию: ");
		increaseColumn(mas);
		Method.print1(mas);

		System.out.println("По убыванию: ");
		decreaseColumn(mas);
		Method.print1(mas);

	}

	public static void increaseColumn(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas.length - 1; k++) {

					if (mas[k][j] > mas[k + 1][j]) {
						int temp;
						temp = mas[k][j];
						mas[k][j] = mas[k + 1][j];
						mas[k + 1][j] = temp;
					}
				}
			}
		}
	}

	public static void decreaseColumn(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				for (int k = 0; k < mas.length - 1; k++) {

					if (mas[k][j] < mas[k + 1][j]) {
						int temp;
						temp = mas[k][j];
						mas[k][j] = mas[k + 1][j];
						mas[k + 1][j] = temp;
					}
				}
			}
		}
	}

}
