package concrete;

import framework.Item;
import framework.ItemCreator;

public class MpCreator extends ItemCreator {

	@Override
	protected void requestItemsInfo() {
		System.out.println("���� ���� ��������");

	}

	@Override
	protected void createItemLog() {
		System.out.println("���� ���� �α� �����");

	}

	@Override
	protected Item createItem() {
		
		Item item = new HpPotion() 
				
		return item;
	}

}
