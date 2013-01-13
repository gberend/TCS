package com.yetra.turing.impl;

import com.yetra.turing.api.ICell;
import com.yetra.turing.api.ITape;

public class Cell implements ICell {
	private final ITape tape;
	private final char symbol;

	public Cell(ITape tape, char symbol) {
		this.tape = tape;
		this.symbol = symbol;
	}

	public Cell(ITape tape) {
		this(tape, tape.getMachine().getBlank());
	}

	@Override
	public ITape getTape() {
		return tape;
	}

	@Override
	public char getSymbol() {
		return symbol;
	}

	@Override
	public String toString() {
		return "Cell [symbol=" + symbol + "]";
	}
}