package by.pth.home02.main7;

/*
 * 8. Дан двухмерный массив n×m элементов. Определить, сколько раз встречается число 7 среди элементов
массива.
 */

public class Task08 {

	public static void main(String[] args) {

		int n = 5;
		int m = 5;
		int a = 7;

		int[][] mas = new int[n][m];

		Method.masRand(mas, 10);
		Method.print1(mas);

		int result;
		result = count(mas, a);

		System.out.println("Число: " + a + " встречается " + result + " раза.");

	}

	public static int count(int[][] mas, int a) {

		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] == a) {
					count++;
				}

			}
		}
		return count;
	}

}
