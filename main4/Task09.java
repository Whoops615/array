package by.pth.home02.main4;

/*
 * 9. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
 */

public class Task09 {

	public static void main(String[] args) {

		primeNumber(6,8,9);

	}

	public static void primeNumber(int a, int b, int c) {

		int ab = maxDelitel(a, b);
		int bc = maxDelitel(b, c);

		int del3 = 0;

		if (ab % bc == 0 | bc % ab == 0) {
			if (ab >= bc) {
				del3 = bc;
			} else {
				del3 = ab;
			}
		}

		if (del3 == 1) {
			System.out.println("Числа: " + a + " " + b + " " + c + " являются взаимно простыми");
		} else {
			System.out.println("Числа: " + a + " " + b + " " + c + "  не являются взаимно простыми");
		}
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

}
