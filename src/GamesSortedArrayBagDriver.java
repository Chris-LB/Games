
public class GamesSortedArrayBagDriver {

	public static void main(String[] args) {
		Games witcher = new Games("The Witcher", 2015);
		Games godOfWar = new Games("God of War", 2018);
		Games mincraft = new Games("Minecraft", 2010);
		Games assassinsCreed = new Games("Assassins Creed Odyssey",2018);
		
		System.out.println(witcher.equals(godOfWar));
		GamesSortedArrayBag entry1 = new GamesSortedArrayBag(14);
		GamesSortedArrayBag entry2 = new GamesSortedArrayBag(12);
		entry1.add("The Witcher" , 2015);
		entry1.add("God of War", 2018);
		entry1.add("Uncharted", 2016);
		entry1.add("Red dead Redmption", 2018);
		entry1.add("Batman Arkham Knight", 2015);
		entry1.add("The Last of US ", 2013);
		entry1.add("Marvels Spider Man", 2018);
		entry1.add("Assassins Creed Odyssey", 2018);
		entry1.add("Horizon zero dawn", 2017);
		entry1.add("Ghost of Tushima", 2020);
		entry1.add("Ghost of Tushima", 2020);
		System.out.println(entry1.toString());
		System.out.println(entry1.grab(1));
        entry2.add("The Witcher", 2015);
        entry2.add("God of war", 2018);
        entry2.add("Uncharted", 2016);
        entry2.add("Red Dead Redemption", 2018);
        entry2.add("Horizon zero dawn", 2017);
        entry2.add("Batman Arkham knight", 2015);
        entry2.add("Ghost of Tushima", 2020);
        entry2.add("Assassins Creed Odyssey", 2018);
        entry2.add("Marvels Spider Man", 2018);
        entry2.add("The Last of US ", 2013);
        System.out.println(entry2.toString());
        System.out.println(entry2.size());
        System.out.println(entry2.indexOf(witcher));
        //System.out.println(entry2.countOfOccurance("Uncharted"));
        entry2.remove(witcher);
        System.out.println(entry2.toString());
        System.out.println(entry2.size());
        entry2.replace(assassinsCreed,mincraft );
        System.out.println(entry2.toString());
        System.out.println(entry2.size());
        System.out.println(GamesSortedArrayBag.sameContents(entry1,entry2));
        
	}

}
