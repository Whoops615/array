package by.pth.home02.main6;

/*
 * 3. Сортировка выбором. Дана последовательность чисел
a1 < a2 ... an .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший элемент
и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура повторяется.
Написать алгоритм сортировки выбором.
 */

public class Task03 {

	public static void main(String[] args) {

		int[] mas = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < mas.length / 2; i++) {

			int temp;
			temp = mas[i];
			mas[i] = mas[max(mas, i)];
			mas[max(mas, i)] = temp;
			Method.print(mas);
		}
	}

	public static int max(int[] mas, int j) {
		int max = mas[j];
		int indexmax = 0;

		for (int i = j; i < mas.length - 1; i++) {

			if (max > mas[i + 1]) {

			} else {
				max = mas[i + 1];
				indexmax = i + 1;
			}
		}
		return indexmax;
	}

}
