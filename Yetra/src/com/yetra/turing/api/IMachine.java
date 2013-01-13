package com.yetra.turing.api;

public interface IMachine {

	/**
	 * The states
	 */
	String[] getQ();

	/**
	 * Input alphabet
	 */
	char[] getΣ();

	/**
	 * Tape symbols
	 */
	char[] getΓ();

	/**
	 * Start state
	 */
	String getQ0();

	/**
	 * Empty symbol
	 */
	char getBlank();
}