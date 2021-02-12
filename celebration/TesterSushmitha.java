package com.xworkz.celebration;

	import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

	public class TesterSushmitha {

		public static void main(String[] args) {

			Set<String> favouritePlaces = new HashSet<String>();
			favouritePlaces.add("Paris");
			favouritePlaces.add("Mauritius");
			favouritePlaces.add(null);
			favouritePlaces.add(null);
			favouritePlaces.add("Bali");
			favouritePlaces.add("Munnar");
			favouritePlaces.add("La");
			favouritePlaces.add("Aus");
			favouritePlaces.add("Paris");
			favouritePlaces.add("Tirupati");
			favouritePlaces.add("Malasyia");
			favouritePlaces.add("Shivamoga");
			favouritePlaces.add("Goa");
			favouritePlaces.add("Malasyia");

			System.out.println(favouritePlaces.size());
			System.out.println(favouritePlaces);
			favouritePlaces.forEach(e->System.out.println(e));
			
			System.out.println("created linked list");
			favouritePlaces=new LinkedHashSet<String>();
			favouritePlaces.add("Mysore");
			favouritePlaces.add("Hampi");
			favouritePlaces.add("Badami");
			favouritePlaces.add("Bijapur");
			favouritePlaces.forEach(e->System.out.println(e));
			
		}

}
