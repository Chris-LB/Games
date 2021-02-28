
public class GamesSortedArrayBag {
	private int numGames;
	private Games[] games;
	
	public GamesSortedArrayBag(int size) {
		numGames = 0;
		games = new Games[size];
	}
	
	/**
	 * Will add game into the array and sort it in order at the same time.
	 * @param title Will be a string being passed. This will determine the title of the game.
	 * @param year Will be a integer being passed in. That will determine the year of the game.
	 * @return Will return true or false based if the game was added.
	 */
	public boolean add(String title, int year) {
		Games add = new Games(title, year);
		Games temp = null;
		int value = 0;
		boolean isTrue = false;
		if(numGames < games.length) {
			games[numGames] = add;
			numGames++;
		}else {
			isTrue = false;
		}
		int n = numGames;
		for(int i = 0; i <n ; i++) {
			for(int j = i+1; j< n; j++) {
				value = games[i].compareTo(games[j]);
				if(value > 0) {
					temp = games[i];
					games[i]= games[j];
					games[j] = temp;
					isTrue = true;
				}
				
			}
			
		}
		return isTrue;
	}
	
//	public boolean testAdd(String title, int year) {
//		boolean isTrue = false;
//		Games add = new Games(title,year);
//		Games temp = null;
//		if(numGames == 0) {
//			games[numGames] = add;
//			numGames++;
//			isTrue = true;
//		}else {
//			for(int i = 0; i< numGames;) {
//				int value = games[i].compareTo(add);
//				if(value < 0) {
//					//int value = games[i].compareTo(add);
//					temp = grab(i);
//					games[i] = add;
//					i++;
//					games[i] = temp;
//					numGames++;
//					
//				}
//				else {
//					games[numGames] = add;
//					numGames++;
//				}
//			}
//			isTrue = true;
//		}
//		return isTrue;
//	}
	
	
//	public boolean add(String title, int year) {
//		Games adding = new Games(title, year);
//		Games temp;
//		boolean isTrue = false;
//		int value;
//		if(numGames == 0) {
//			games[numGames] = adding;
//			numGames++;
//			isTrue = true;
//		}else if(numGames > 0 && numGames< games.length) {
//			for(int i = 0; i< numGames;) {
//				value = games[i].compareTo(adding);
//				if(value > 0) {
//					i++;
//					games[numGames] = adding;
//					numGames++;
//				}else if(value < 0) {
//					temp = new Games(games[i].toString(),games[i].getYear());
//					games[i] = adding;
//					numGames++;
//					isTrue = true;
//			
//					for( int j=i+1;j<games.length;) {
//						adding = new Games(games[j].toString(),games[j].getYear());
//						games[j] = temp;
//						temp = adding;
//						j++;
//						isTrue = true;
//						return isTrue;
//					}
//				}else if (value == 0) {
//					
//					isTrue = true;
//				}
//			}
//		}
//		
//		return isTrue;
//	}
	/**
	 * Will tell the user the size of the array.
	 * @return A number that tells the user the size of the array.
	 */
	public int size() {
		return numGames;
	}
	
	@Override
	public String toString() {
		String discription = "";
		discription = "";
		discription = "Games                    Year\n";
		discription += "-----------------------------\n";
		for(int i =0;i<numGames;i++) {//Why did the array length not work and the number of things did work
			discription += spaces(games[i].getGame())+games[i].getYear()+" \n";
		}
		return discription;
	}//18 spaces
	
	public String spaces(String str) {
		int length = 25-str.length();
		for(int i =0; i<length;i++) {
			str +=" ";
			
		}
		return str;
		
	}
	
	/**
	 * Will be telling the user at what position the game is stored in the array.
	 * @param game Will be passing a game object.
	 * @return Will return a integer telling the user what position the game was found.
	 */
	public int indexOf(Games game) {
		boolean isTrue = false;
	    int index = -1;
		for(int i = 0; i< numGames;i++) {
			isTrue = games[i].equals(game);
			if(isTrue) {				
				index = i;				
			}//else {
				//index = -1;
				//System.out.print(index);
			//}
			
		}
		return index;
	}
	
	/**
	 * Will remove a certain game in the array.
	 * @param game Is a game object being passed in to remove.
	 * @return A true or false value based on if the game was removed.
	 */
	public boolean remove(Games game) {
		boolean isTrue = false;
		boolean value;
		Games temp;
		for(int i = 0; i< numGames;i++) {
			value = games[i].equals(game);
			if(value) {
				games[i] = null;
				for(int j = i+1; j<numGames; j++) {
					temp = games[j];
					games[i] = temp;
					
				}
				isTrue = true;
				numGames--;
			}
		}
		return isTrue;
	}
	
	/**
	 * Will return the number of times a game is in the array
	 * @param title Is a string being passed to get the game.
	 * @return Will return the number of times a game was in the array.
	 */
	public int countOfOccurance(String title) {
		boolean found = false;
		int numOfTimes = 0;
		for(int i = 0; i< games.length;i++) {
			found = title.equalsIgnoreCase(games[i].getGame());
			if(found) {
				numOfTimes += 1;
			}
		}
		
		return numOfTimes;
	}
	
	/**
	 * Will get a game at a specific index
	 * @param index A number being passed in to get the game at this certain position in the array
	 * @return The game at the index being passed in.
	 */
	public Games grab(int index) {
		String title;
		int num;
		Games found;
		if(index > 0 && index< games.length) {
			 title =  games[index].getGame();
			 num = games[index].getYear();
			 found = new Games(title, num);
		}else {
			Games exception = new Games("Nothing was stored here",0);
			return exception;
		}
		return found;
	}
	/**
	 * Will get the all the years of each game in the array and 
	 * @return return the total value of the years.
	 */
	public int total() {
		int sum = 0;
		for(int i = 0; i<games.length;i++) {
			sum += games[i].getYear();
		}
		return sum;
	}
	
	/**
	 * 
	 * @param inArray passing an object of game that is in the current array.
	 * @param notInArray This game object will be replace that other game object
	 * @return will return true or false if it was replaced.
	 */
	public boolean replace(Games inArray, Games notInArray) {
		boolean isTrue = false;
		Games temp;
		int value;
		for(int i = 0; i<numGames; ) {
			value = games[i].compareTo(inArray);
			if(value == 0) {
				games[i] = notInArray;
				int n = numGames;
				for(int j = 0; j <n ; j++) {
					for(int k = j+1; k< n; k++) {
						value = games[j].compareTo(games[k]);
						if(value > 0) {
							temp = games[j];
							games[j]= games[k];
							games[k] = temp;
							isTrue = true;
						}	
					}
				}
				
				
			}else {
				i++;
			}
		}
		return isTrue;
	}
	/**
	 * Is suppose to conmpare two game array bags and see if they are equal
	 * @param first the first array bag
	 * @param second the second array bag
	 * @return Will return true or false
	 */
	public static boolean sameContents(GamesSortedArrayBag first, GamesSortedArrayBag second) {
		boolean isTrue = false;
		boolean value = false;
		int currentSize = 0;
		int currentSizeTwo = 0;
		GamesSortedArrayBag tempFirst = new GamesSortedArrayBag(first.size());
		GamesSortedArrayBag tempSecond = new GamesSortedArrayBag(second.size());
		//this part will remove dupilcates 
		for(int i = 0; i<first.size()-1;i++) {
			value =first.games[i].equals(first.games[i+1]);
			if(!value) {	
				tempFirst.add(first.games[i].getGame(), first.games[i].getYear());
			}
		}
		for(int i = 0; i<second.size()-1;i++) {
			value =second.games[i].equals(second.games[i+1]);
			if(!value) {
				tempSecond.add(second.games[i].getGame(), second.games[i].getYear());
				//tempSecond.games[m++]=second.games[m];
				//currentSizeTwo++;
			}
		}
		//System.out.println(tempFirst.toString()+"\n");
		//System.out.println(tempSecond.toString());
		//System.out.println(tempFirst.size());
		//System.out.println(tempSecond.size());
		if(tempFirst.size()==tempSecond.size()) {
			//System.out.println("Yes it got here");
			for(int i = 0; i<tempFirst.size()+1;i++) {
				value = tempFirst.games[i].equals(tempSecond.games[i]);
				//System.out.println(value);
				if(value) {
					isTrue = true;
				}else {
					isTrue = false;
					return isTrue;
				}
			}
		}
		return isTrue;
	}
	
	
	
	

}
