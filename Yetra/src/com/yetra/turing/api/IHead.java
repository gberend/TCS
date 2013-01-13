package com.yetra.turing.api;

public interface IHead {

	ITape getTape();

	HeadKind getKind();

	ICell moveLeft();

	ICell moveRight();

	ICell stayStill();
}