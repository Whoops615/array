package by.pth.home02.main4;

/*
 * 13. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются
цифры числа N.
 */

public class Task13 {

	public static void main(String[] args) {

		int n = 123456789;
		System.out.println("Число: " + n);
		int size;
		size = sizeMas(n);
		System.out.println("Размер массива: " + size);

		int[] mas = new int[size];
		getMas(mas, size, n);

		Method.print(mas);

	}

	public static int sizeMas(int a) {

		int b;
		int count = 0;
		while (a > 0) {
			b = a % 10;
			a = (a - b) / 10;
			count++;
		}

		return count;
	}

	public static void getMas(int[] mas, int size, int n) {
		int a = n;
		int b;
		int count = 0;
		while (a > 0) {
			b = a % 10;
			mas[count] = b;
			a = (a - b) / 10;
			count++;

		}
	}

}
