package com.bowling;
public class ExecutePinBowlingGame {
/**
 * This java main function passes the input provided, to the BowlingGame class
 * function getScore to get the game score	
 * @param args
 */
	public static void main(String[] args) {
		int[] rollsArray = new int[21];	
		BowlingGame execGame = new BowlingGame();
		
		int number=0;
		for(int i=0;i<args.length;i++){										
				if(isInteger(args[i]) ){
					number=Integer.parseInt(args[i]);
				}
				if(number<=10){					
					rollsArray[i]=number;									
				}
		}	
		
		for(int pins=0;pins<rollsArray.length;pins++){		
			execGame.roll(rollsArray[pins]);	
		}
		
		System.out.println(execGame.getScore());				
	}
/**
 * isInteger function is defined to check whether a given input if of type integer or not
 * @param String
 * @return boolean
 */
	
	public static boolean isInteger(String input){
		
		try{
			Integer.parseInt(input);
		    return true;
		}
		catch (Exception e){
			e.getMessage();
			return false;
		}
	}

}
