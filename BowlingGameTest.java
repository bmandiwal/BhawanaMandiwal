package com.bowling;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {
	
	BowlingGame game;
	
	@Before
	public void initialize(){
		game= new BowlingGame();
	}
/**
 * Test run for a gutter game
 */
	@Test
	public void canRollGutterGame(){		
		rollMany(0,20);		
		assertEquals(0,game.getScore());
	}
	
/**
 * Test run for rolling all ones	
 */
   @Test
   public void canRollAllOnes(){	   
	   rollMany(1,20);
	   assertEquals(20,game.getScore());
   }
  
/**
 * Test run for rolling spares 
 */
   @Test
   public void canRollSpares(){
	   game.roll(4);
	   game.roll(6);
	   game.roll(7);
	   rollMany(0,17);
	   assertEquals(24,game.getScore());
	   
   }
   
/**
 * Test run for rolling strikes
 */
   @Test
   public void canRollStrikes(){
	   game.roll(10);
	   game.roll(5);
	   game.roll(6);
	   rollMany(0,16);
	   assertEquals(32,game.getScore());
   }
   
/**
 * Test run for rolling perfect game
 */   
   @Test
   public void canRollPerfectGame(){
	   rollMany(10,12);
	   assertEquals(300,game.getScore());
	   
   }
 
/**
 * rollMany function creates the rolls array with each element having number of pins rolled     
 * @param pins
 * @param rolls
 */
   private void rollMany(int pins, int rolls){
	   for(int i=0; i<rolls; i++){
		   game.roll(pins);
	   }
	   
   }
   
}