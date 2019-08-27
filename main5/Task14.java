package by.pth.home02.main5;

/*
 * 14. Дан одномерный массив A[N]. Найти: max(a2,a4,...,a2k) + min(a1,a3,...,a2k+1)
 */

public class Task14 {

	public static void main(String[] args) {

		int[] mas = new int[10];
		Method.randMas(mas);
		Method.print(mas);
		System.out.println("\n---------------------------");
		int maxeven = mas[max(mas)];
		int minodd = mas[min(mas)];
		System.out.println(maxeven + " " + minodd);
		System.out.println("---------------------------");
		int result;
		result = maxeven + minodd;
		System.out.println("Результат: " + result);

	}

	public static int max(int[] mas) {
		int max = mas[0];
		int indexmax = 0;

		for (int i = 0; i < mas.length - 2; i = i + 2) {
			if (max > mas[i + 2]) {

			} else {
				max = mas[i + 2];
				indexmax = i + 2;
			}
		}
		return indexmax;
	}

	public static int min(int[] mas) {
		int min = mas[1];
		int indexmin = 1;
		for (int i = 1; i < mas.length - 2; i = i + 2) {
			if (min < mas[i + 2]) {

			} else {
				min = mas[i + 2];
				indexmin = i + 2;
			}
		}
		return indexmin;
	}

}
