package ru.job4j.start;

import ru.job4j.models.*;
import org.junit.Test;
import org.junit.Before;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 * @author Vladimir Prilepskiy
 * @since 14.12.2016
 * @version 1
 */
 public class TrackerTest {
	 
	Tracker tracker = new Tracker();
	Item item = new Item();
	
	int countRows = 5;
	String[] name = new String[countRows];
	String[] description = new String[countRows];
	long[] create = new long[countRows];
	String[] id = new String[countRows];

	/**
	 * Предварительная настройка.
	 */
	@Before
	public void testAdd() {
		for (int i = 0; i < countRows; i++) {
			item = tracker.add(new Item(i + " name", i + " desc", System.currentTimeMillis()));
			name[i] = item.getName();
			description[i] = item.getDescription();
			create[i] = item.getCreate();
			id[i] = item.getId();
			final String result = i + " name";
//			assertThat(item.getName(), is(result));
		}
	}

	/**
	 * Test.
	 */
	@Test
	public void testEditName() {
		tracker.editName(item, "editing name");
		final String result = "editing name";
		assertThat(item.getName(), is(result));
	}

	@Test
	public void testDel() {
		assertThat(tracker.del(item), is(true));
	}
	
	/**
	 * Test.
	 */
	@Test
	public void testEditDescription() {
		tracker.editDescription(item, "editing desc");
		assertThat(item.getDescription(), is("editing desc"));
	}
	
	/**
	 * Test.
	 */
	@Test
	public void testFindById() {
		assertThat(tracker.findById(this.id[0]).getName(), is("0 name"));
	}

	/**
	 * Test.
	 */
	@Test
	public void testFindByName() {
		assertThat(tracker.findByName(this.name[1]).getName(), is("1 name"));
	}
	
	/**
	 * Test.
	 */
	@Test
	public void testFindByDescription() {
		assertThat(tracker.findByDescription(this.description[1]).getDescription(), is("1 desc"));
	}
	
	/**
	 * Test.
	 */
	@Test
	public void testFindByCreate() {
		assertThat(tracker.findByCreate(this.create[0]).getName(), is("0 name"));
	}
	
	/**
	 * Test.
	 */
	@Test
	public void testGetAll() {
		Item items[] = tracker.getAll();
		boolean success = true;
		int index = 0;
		for (Item item : items) {
			if (item.getId() != id[index]) {
				success = false;
				break;
			}
			index++;
		}
		assertThat(success, is(true));
	}	
}