package concrete;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("물약 정보 가져오기");

	}

	@Override
	protected void createItemLog() {
		System.out.println("물약 정보 로그 남기기");

	}

	@Override
	protected Item createItem() {
		
		Item item = new HpPotion() 
				
		return item;
	}

}
