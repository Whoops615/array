package by.pth.home02.main4;

/*
 * 3. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task03 {

	public static void main(String[] args) {

		int maxdel4;
		maxdel4 = maxDel4(60, 12, 24, 6);

		System.out.println("Наибольший делитель для 4 чисел: " + maxdel4);

	}

	public static int maxDel4(int a, int b, int c, int d) {

		int ab = maxDelitel(a, b);
		int bc = maxDelitel(b, c);
		int cd = maxDelitel(c, d);
		int del3 = 0;
		int del4 = 0;

		if (ab % bc == 0 | bc % ab == 0) {
			if (ab >= bc) {
				del3 = bc;
			} else {
				del3 = ab;
			}
		}
		if (del3 % cd == 0 | cd % del3 == 0) {
			if (del3 >= cd) {
				del4 = cd;
			} else {
				del4 = del3;
			}
		}
		return del4;
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
