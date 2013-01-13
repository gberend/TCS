package com.yetra.turing.api;

/**
 * The kind of a Turing head
 */
public enum HeadKind {

	/**
	 * Only reading symbols is allowed
	 */
	Read,

	/**
	 * Reading and writing symbols is allowed
	 */
	ReadWrite
}