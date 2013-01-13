package com.yetra.turing.util;

import java.util.Arrays;

import com.yetra.turing.api.ICell;

public final class BasicUtils {

	private BasicUtils() {
	}

	public static String toString(Iterable<ICell> cells, boolean reverse) {
		StringBuilder bld = new StringBuilder();
		for (ICell cell : cells)
			if (reverse)
				bld.insert(0, toString(cell));
			else
				bld.append(toString(cell));

		return bld.toString();
	}

	public static String toString(ICell cell) {
		return cell.getSymbol() + "";
	}

	public static double nextRandom2(double min, double max) {
		double difference = max - min;
		double random = Math.random() * difference;
		return min + random;
	}

	public static String toString(String[] set) {
		String text = Arrays.toString(set);
		return "{" + text.substring(1, text.length() - 1) + "}";
	}

	public static String toString(char[] set) {
		String text = Arrays.toString(set);
		return "{" + text.substring(1, text.length() - 1) + "}";
	}
}