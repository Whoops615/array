package by.pth.home02.main7;

public class Task20 {

	public static void main(String[] args) {

		int n = 6;
		int k = n / 2;
		int[][] mas = new int[n][n];

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				if (j < k) {
					if (i >= j & i < k) {
						mas[i][j] = 1;
					}
					if (i + j <= n - 1 & i >= k) {
						mas[i][j] = 1;
					}
				} else {
					if (i <= j & i > k) {
						mas[i][j] = 1;
					}
					if (i + j >= n - 1 & i <= k) {
						mas[i][j] = 1;
					}
				}
			}
		}

		Method.print1(mas);

	}

}
