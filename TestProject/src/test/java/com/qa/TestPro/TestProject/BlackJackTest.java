package com.qa.TestPro.TestProject;

import org.junit.Assert;
import org.junit.Test;

public class BlackJackTest {
	
	@Test
	public void testThis() {
		TestBlackJack b = new TestBlackJack();
		
		Assert.assertEquals(12, TestBlackJack.Blackjack(12,10));
		Assert.assertEquals(21, TestBlackJack.Blackjack(12,21));
		Assert.assertEquals(15, TestBlackJack.Blackjack(12,15));
		
		
		
	}
	
}
