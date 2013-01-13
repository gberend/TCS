package com.yetra.turing.impl;

import java.util.Arrays;

import com.yetra.turing.api.IMachine;
import com.yetra.turing.util.BasicUtils;

public class Machine implements IMachine {
	private final String[] Q;
	private final char[] Σ;
	private final char[] Γ;
	private final String q0;
	private final char blank;

	public Machine(String[] Q, char[] Σ, char[] Γ, String q0, char blank) {
		this.Q = Q;
		this.Σ = Σ;
		this.Γ = Γ;
		this.q0 = q0;
		this.blank = blank;
		// Checks
		if (Arrays.binarySearch(Q, q0) < 0) {
			String message = String.format("The set of states %s doesn't "
					+ "contain the given start state '%s'!",
					Arrays.toString(Q), q0);
			throw new IllegalArgumentException(message);
		}
	}

	@Override
	public String[] getQ() {
		return Q;
	}

	@Override
	public char[] getΣ() {
		return Σ;
	}

	@Override
	public char[] getΓ() {
		return Γ;
	}

	@Override
	public String getQ0() {
		return q0;
	}

	@Override
	public char getBlank() {
		return blank;
	}

	@Override
	public String toString() {
		int[] δ = new int[0];
		return "τ = (Q=" + BasicUtils.toString(Q) + ", Σ="
				+ BasicUtils.toString(Σ) + ", Γ=" + BasicUtils.toString(Γ)
				+ ", δ=" + Arrays.toString(δ) + ", q0='" + q0 + "', blank='"
				+ blank + "')";
	}
}