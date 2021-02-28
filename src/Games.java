/*
 * Chris Lara-Betancourt 
 * ICS 240 Jaha Roberts 
 * 
 */
public class Games implements Comparable<Games> {
	private String game;
	private int year;
	
	public Games(String game, int num) {
		this.game = game;
		year = num;
	}

	public String getGame() {
		return game;
	}

	public void setGame(String game) {
		this.game = game;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int num) {
		year = num;
	}

	@Override
	public String toString() {
		return "Games [Game = " + game + ",\t Year = " + year + "]";
	}
	/**
	 * 
	 * @param other A game object being passed in to compare 
	 * @return will return true or false if both game are the same.
	 */
	public boolean equals(Games other) {
		if(game.equalsIgnoreCase(other.getGame())&& year == other.getYear()) {
			return true;
		}else {
			return false;
		}
	}
	/**
	 * WIll compare if the game object being passed will come before 
	 * after or is equal to the current game its being compared to.	
	 */
	@Override
	public int compareTo(Games other) {
		int value = 0;
		int compareInt = game.compareTo(other.game);
		if(compareInt<0) {
			value = -1;//original game comes before other game
		}
		else if(compareInt>0) {
			value = 1; //other game comes before original game 
		}
		else if(compareInt==0) {
//			if(year == other.year) {
//				value = 0;//They are equal
//			}
//			else if(year < other.year) {
//				value = -1;//year comes before other year
//			}
//			else if(year > other.year) {
//				value = 1;//other year comes before year
//			}
			value = 0;
		}
		return value;
	}
	
	

}
