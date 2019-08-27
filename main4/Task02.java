package by.pth.home02.main4;

/*
 * 2. Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
 */

public class Task02 {

	public static void main(String[] args) {

		int maxdel;
		maxdel = maxDelitel(60, 36);
		System.out.println("Наибольший общий делитель: " + maxdel);
		int nok;
		nok = nok(36, 60);
		System.out.println("Наименьшее общее кратное: " + nok);

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
