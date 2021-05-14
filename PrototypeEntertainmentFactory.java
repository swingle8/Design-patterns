package demo3;

import java.util.HashMap;

public class PrototypeEntertainmentFactory {
	private static HashMap<String, PrototypeEntertainment> map = new HashMap<String, PrototypeEntertainment>();
	private PrototypeEntertainmentFactory () {};
	
	static {
		map.put("Movie", new PrototypeMovie());
		map.put("Shows", new PrototypeShows());
		map.put("Album", new PrototypeAlbum());
	}
	
	public static PrototypeEntertainment getInstance (String type) throws CloneNotSupportedException {
		if (type == "Movie" || type == "Shows" || type == "Album")
			return ((PrototypeEntertainment) map.get(type)).clone();
		return null;
	}
	
}
