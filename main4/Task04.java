package by.pth.home02.main4;

/*
 * 4. Написать метод(методы) для нахождения наименьшего общего кратного трех натуральных чисел.
 */

public class Task04 {

	public static void main(String[] args) {

		int nok3;
		nok3 = nok3(15, 4, 6);
		System.out.println("Наибольшее общее кратное: " + nok3);

	}

	public static int nok3(int a, int b, int c) {

		int nokab = nok(a, b);
		int nok3 = (nokab * c) / maxDelitel(nokab, c);

		return nok3;
	}

	public static int maxDelitel(int a, int b) {
		int del1;
		int del2;
		int _maxdel = 0;

		for (int i = 1; i <= a; i++) {
			if (a % i == 0) {
				del1 = i;
				for (int j = 1; j <= b; j++) {
					if (b % j == 0) {
						del2 = j;
						if (del1 == del2) {
							_maxdel = del1;
						}
					}
				}
			}
		}
		return _maxdel;
	}

	public static int nok(int a, int b) {

		int _nok = (a * b) / maxDelitel(a, b);
		return _nok;
	}

}
