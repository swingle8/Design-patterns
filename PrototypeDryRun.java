package demo3;

public class PrototypeDryRun{
	public static void main (String [] args) throws CloneNotSupportedException {
		PrototypeEntertainment movie = PrototypeEntertainmentFactory.getInstance("Movie");
		movie.setName("Radhe");
		System.out.println(movie.getName());
		
		PrototypeEntertainment shows = PrototypeEntertainmentFactory.getInstance("Shows");
		shows.setName("Roadies");
		System.out.println(shows.getName());
		
		PrototypeEntertainment album = PrototypeEntertainmentFactory.getInstance("Album");
		album.setName("Mohit Chauhan");
		System.out.println(album.getName());
	}
}