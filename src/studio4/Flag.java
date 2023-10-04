package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(240,227,192);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(173, 216, 230);
		StdDraw.filledEllipse(0.5,0.5,0.4,0.15);
		StdDraw.setPenColor(255,192,203);
		StdDraw.filledRectangle(0.5, 0.5, 0.05, 0.25);
		StdDraw.setPenColor(154,205,50);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.05);
		StdDraw.setPenColor(203,195,227);
		double[] x = {0.2, 0.4, 0.3};
		double[] y = {0.55, 0.55, 0.4};
		StdDraw.filledPolygon(x, y);
		double[] a = {0.8, 0.6, 0.7};
		double[] b = {0.55, 0.55, 0.4};
		StdDraw.filledPolygon(a, b);
	}
}