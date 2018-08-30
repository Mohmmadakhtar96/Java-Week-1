package com.qa.TestPro.TestProject;

public class TestBlackJack {

	public static int Blackjack(int a, int b) {

		if (a > b) {
			return a;
		}

		else if (a > 21 || b > 21) {
			a = 0;
			b = 0;

			return a+b;
		}

		else {
			return b;
			
		}
		
	}

}
