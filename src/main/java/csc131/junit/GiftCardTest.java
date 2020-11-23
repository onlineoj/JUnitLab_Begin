package csc131.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class GiftCardTest
{
	@Test
	public void getIssuingStore()
	{
		double balance;
		GiftCard card;
		int issuingStore;

		issuingStore = 1337;
		
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getIssuingStore()", issuingStore, card.getIssuingStore());
	}
	
	
	@Test
	public void getBalance()
	{
		double balance;
		GiftCard card;
		int issuingStore;
        
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance);
		assertEquals("getBalance()", balance, card.getBalance(), 0.001d);
		
	}
	
	@Test
	public void deduct()
	{
		double balance;
		GiftCard card;
		GiftCard card2;
		int issuingStore;
		
		issuingStore = 1337;
		balance = 100.00;
		card = new GiftCard(issuingStore, balance); 
		card2 = new GiftCard(issuingStore, balance); 
		
		assertEquals("deduct()", card.deduct(5.0d), card2.deduct(5.0d));
        assertEquals("deduct()", card.deduct(-5.0d), card2.deduct(-5.0d));
        assertEquals("deduct()", card.deduct(300.0d), card2.deduct(300.0d));
       
        
		
	}
	
	
}