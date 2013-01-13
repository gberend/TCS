package com.yetra.turing.api;

import java.util.ListIterator;

public interface ICellIterator extends ListIterator<ICell> {

	ICell current();
}