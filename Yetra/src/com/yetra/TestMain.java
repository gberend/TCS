package com.yetra;

import com.yetra.turing.api.HeadKind;
import com.yetra.turing.api.IHead;
import com.yetra.turing.api.IMachine;
import com.yetra.turing.api.ITape;
import com.yetra.turing.api.TapeKind;
import com.yetra.turing.impl.Head;
import com.yetra.turing.impl.Machine;
import com.yetra.turing.impl.Tape;

public class TestMain {

	public static void main(String[] args) {
		String[] Q = new String[] { "q0", "q1", "qe" };
		char[] Σ = new char[] { '|' };
		char[] Γ = new char[] { '|', '0', '1', '⊔' };

		TuringRow[] δ = new TuringRow[] {
				new TuringRow("q0", '|', "q1", '⊔', 'R'),
				new TuringRow("q0", '⊔', "qe", '1', 'S'),
				new TuringRow("q1", '|', "q0", '⊔', 'R'),
				new TuringRow("q1", '⊔', "qe", '0', 'S') };

		IMachine τ = new Machine(Q, Σ, Γ, "q0", '⊔');
		System.out.println(τ);

		ITape tape = new Tape(τ, TapeKind.NoBounds, "|||⊔||⊔|q0|||⊔|||||");
		IHead head = new Head(tape, HeadKind.ReadWrite);
		IHead head3 = new Head(tape, HeadKind.Read);

		System.out.println(head);
		System.out.println(head.moveLeft());
		System.out.println(head.moveRight());
		System.out.println(head.moveRight());

		System.out.println(head3);
		System.out.println(head3.moveLeft());
		System.out.println(head3.moveLeft());
		System.out.println(head3.moveRight());
		System.out.println(head3.moveRight());
		System.out.println(head3.moveRight());
		System.out.println(head3.moveRight());

		System.out.println();
		System.out.println(head.stayStill());
		System.out.println(head3.stayStill());

	}
}