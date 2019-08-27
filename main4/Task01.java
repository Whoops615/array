package by.pth.home02.main4;

/*
 * 1. Треугольник задан координатами своих вершин. Написать метод для вычисления его площади.
 */

public class Task01 {

	public static void main(String[] args) {

		double square;
		square = getSquare(10, 3, 5, -1, 6, -4);
		System.out.println("Площадь треуголльника: " + square);

	}

	public static double getSquare(int x1, int y1, int x2, int y2, int x3, int y3) {

		double a;
		double b;
		double c;
		double pr;
		double pl;
		double p;

		a = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow(y1 - y2, 2));
		b = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow(y1 - y3, 2));
		c = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow(y3 - y2, 2));
		pr = a + b + c;
		p = pr / 2;
		pl = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		return pl;
	}

}
