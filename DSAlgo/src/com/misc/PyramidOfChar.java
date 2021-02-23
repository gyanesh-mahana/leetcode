package com.misc;

public class PyramidOfChar {

	public void buildPyramid(int h, int w, char ch) {

		int g = (int) Math.ceil((float) h / Math.ceil((float) w / 2));
//		h / (w / 2)
		int temp = g;
		int s = 0;
		while (h > 0) {
			while (temp > 0 && h > 0) {
				for (int k = 0; k < s; k++) {
					System.out.print(" ");
				}
				for (int j = 0; j < w; j++) {

					System.out.print(ch);
				}
				System.out.println();
				h--;
				temp--;
			}

			temp = g;
			s++;
			w = w - 2;

		}
	}

	public void buildPyramidV2(int h, int w, char ch) {
		char[][] pyr = new char[h][w];
		int mid_w = -1;
		if (w % 2 == 0) {
			mid_w = w / 2;
		} else {
			mid_w = (w / 2) + 1;
		}

		int loc = mid_w;
		int fill = 0;

		System.out.println(loc);
		int gap = 1;
		if (h >= w) {
//			gap = (int) Math.ceil((float) h / (w - mid_w));
			gap = h / (w - mid_w);
		} else {
//			gap = (int) Math.ceil((float) (w - mid_w) / h);
			gap = (w - mid_w) / h;
		}
		System.out.println("gap=" + gap);
		for (int i = 0; i < h; i++) {
			if ((i % gap) == 0) {
				// loc shift left

				if (loc < mid_w) {
					fill = fill + 2;
				}

				loc = loc - 1;
			}
			for (int j = 0; j < w; j++) {

				if ((j >= loc) && j <= (loc + fill)) {
//					System.out.println("j val of *="+j);
					pyr[i][j] = ch;
				} else {
					pyr[i][j] = ' ';
				}
				System.out.print(pyr[i][j]);
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PyramidOfChar poc = new PyramidOfChar();
//		poc.buildPyramid(5, 12, '*');
		poc.buildPyramidV2(50, 20, '*');
	}

}
