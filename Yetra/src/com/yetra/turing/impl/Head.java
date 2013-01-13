package com.yetra.turing.impl;

import com.yetra.turing.api.HeadKind;
import com.yetra.turing.api.ICell;
import com.yetra.turing.api.ICellIterator;
import com.yetra.turing.api.IHead;
import com.yetra.turing.api.ITape;

public class Head implements IHead {
	private final ITape tape;
	private final HeadKind kind;
	private final ICellIterator iterator;

	public Head(ITape tape, HeadKind kind) {
		this.tape = tape;
		this.kind = kind;
		iterator = tape.getCellIterator();
	}

	@Override
	public ITape getTape() {
		return tape;
	}

	@Override
	public HeadKind getKind() {
		return kind;
	}

	@Override
	public ICell moveLeft() {
		if (!iterator.hasPrevious())
			throw new IllegalAccessError("Can't move over left boundary!");
		return iterator.previous();
	}

	@Override
	public ICell moveRight() {
		if (!iterator.hasNext())
			throw new IllegalAccessError("Can't move over right boundary!");
		return iterator.next();
	}

	@Override
	public ICell stayStill() {
		return iterator.current();
	}

	@Override
	public String toString() {
		return "Head [tape=" + tape + ", current=" + stayStill() + "]";
	}
}