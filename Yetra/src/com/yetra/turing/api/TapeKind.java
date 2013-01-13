package com.yetra.turing.api;

/**
 * The kind of a Turing tape
 */
public enum TapeKind {

	/**
	 * Only right-side infinite
	 */
	LeftBound,

	/**
	 * Only left-side infinite
	 */
	RightBound,

	/**
	 * Doubly infinite
	 */
	NoBounds
}