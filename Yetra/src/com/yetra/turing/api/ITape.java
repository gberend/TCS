package com.yetra.turing.api;

/**
 * A typically doubly infinite tape on which the input and output of a Turing
 * machine is performed
 */
public interface ITape {

	TapeKind getKind();

	IMachine getMachine();

	ICellIterator getCellIterator();
}