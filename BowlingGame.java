package com.bowling;

public class BowlingGame {
	private int[] rolls = new int [21];
    private int currentRoll=0;

	public void roll(int pins) {
		rolls[currentRoll++] = pins;
	}
/**
 * getScore function returns the total score of all 10 frames
 * @return integer
 */
	public int getScore() {
		int score=0;
		int rollIndex = 0;
			for(int frameIndex = 0;frameIndex<10;frameIndex++){
				if(isStrike(rollIndex)){
					score += getStrikeScore(rollIndex);
					rollIndex++;
				}
				else if(isSpare(rollIndex)){
					score+=getSpareScore(rollIndex);
					
					rollIndex += 2;
				}else{
					score += getStardardScore(rollIndex);
					
					rollIndex += 2;
				}
				
			}
		return score;
	}

/**
 * getStrikeScore function returns total score of the frame if it's a strike	
 * @param rollIndex
 * @return integer
 */	
	private int getStrikeScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1]+ rolls[rollIndex+2];
	}
	
	
/**
 * isStrike function returns true if the first roll of the frame returns 10	
 * @param rollIndex
 * @return boolean
 */
	private boolean isStrike(int rollIndex) {
		return rolls[rollIndex]==10;
	}
	
	
/**
 * getStandardScore function returns the score of a standard frame
 * @param rollIndex
 * @return integer
 */
	private int getStardardScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1];
	}
	
	
/**
 * getSpareScore function returns the score of the frame which has a spare 
 * @param rollIndex
 * @return integer
 */
	private int getSpareScore(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1]+ rolls[rollIndex+2];
	}
	
	
/**
 * isSpare function returns boolean value true if the frame returns total of 2 rolls as 10
 * @param rollIndex
 * @return boolean
 */
	private boolean isSpare(int rollIndex) {
		return rolls[rollIndex] + rolls[rollIndex+1] == 10;
	}

}
