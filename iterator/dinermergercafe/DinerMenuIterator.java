package iterator.dinermergercafe;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] list;
	int position = 0;

	public DinerMenuIterator(MenuItem[] list) {
		this.list = list;
	}

	public MenuItem next() {
		MenuItem menuItem = list[position];
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		return position < list.length && list[position] != null;
	}

	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException(
					"You can't remove an item until you've done at least one next()");
		}
	}
}