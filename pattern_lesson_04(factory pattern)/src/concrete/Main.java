package concrete;

import framework.ItemCreator;
import framework.Item;

public class Main {
	
	public static void main(String[] args) {
		
		ItemCreator creator = new HpCreator();
		
		Item item = creator.create();
		
		item.use();
		
		
		
	}

}
