package com.yetra.turing.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import com.yetra.turing.api.ICell;
import com.yetra.turing.api.ICellIterator;
import com.yetra.turing.api.IMachine;
import com.yetra.turing.api.ITape;
import com.yetra.turing.api.TapeKind;
import com.yetra.turing.util.BasicUtils;

public class Tape implements ITape {
	private final IMachine machine;
	private final TapeKind kind;
	private final List<ICell> leftSide;
	private ICell middle;
	private final List<ICell> rightSide;

	public Tape(IMachine machine, TapeKind kind, String startConfig) {
		this.machine = machine;
		this.kind = kind;
		leftSide = kind == TapeKind.LeftBound ? null : new LinkedList<ICell>();
		middle = new Cell(this);
		rightSide = kind == TapeKind.RightBound ? null
				: new LinkedList<ICell>();
		// Fill tape with start configuration
		String[] scParts = startConfig.split(machine.getQ0());
		for (int i = scParts[0].length() - 1; i >= 0; i--) {
			char symbol = scParts[0].charAt(i);
			leftSide.add(new Cell(this, symbol));
		}
		for (int i = 0; i < scParts[1].length(); i++) {
			char symbol = scParts[1].charAt(i);
			if (i == 0) {
				middle = new Cell(this, symbol);
				continue;
			}
			rightSide.add(new Cell(this, symbol));
		}
	}

	@Override
	public IMachine getMachine() {
		return machine;
	}

	@Override
	public TapeKind getKind() {
		return kind;
	}

	@Override
	public ICellIterator getCellIterator() {
		return new CellIterator();
	}

	@Override
	public String toString() {
		return BasicUtils.toString(leftSide, true) + "["
				+ BasicUtils.toString(middle) + "]"
				+ BasicUtils.toString(rightSide, false);
	}

	private class CellIterator implements ICellIterator, ListIterator<ICell> {
		private int position;

		public CellIterator() {
			this.position = 0;
		}

		/* Go left */
		@Override
		public boolean hasPrevious() {
			switch (kind) {
			case LeftBound:
				return position > 0;
			default:
				return true;
			}
		}

		@Override
		public ICell previous() {
			if (!hasPrevious())
				throw new IllegalStateException("previous");
			position--;
			return current();
		}

		@Override
		public int previousIndex() {
			return position - 1;
		}

		/* Stay still */
		@Override
		public ICell current() {
			if (position < 0)
				return getFrom(leftSide, Math.abs(position) - 1);
			if (position > 0)
				return getFrom(rightSide, position - 1);
			return middle;
		}

		/* Helper */
		private ICell getFrom(List<ICell> list, int index) {
			while (index >= list.size())
				list.add(new Cell(Tape.this));
			return list.get(index);
		}

		/* Go right */
		@Override
		public boolean hasNext() {
			switch (kind) {
			case RightBound:
				return position < 0;
			default:
				return true;
			}
		}

		@Override
		public ICell next() {
			if (!hasNext())
				throw new IllegalStateException("next");
			position++;
			return current();
		}

		@Override
		public int nextIndex() {
			return position + 1;
		}

		/* Optional, not-implemented methods */
		@Override
		public void add(ICell e) {
			throw new UnsupportedOperationException("add");
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException("remove");
		}

		@Override
		public void set(ICell e) {
			throw new UnsupportedOperationException("set");
		}
	}
}