import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDatastructures {

	@Test
	void testStack() {
		Stack st = new Stack();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		assertEquals(4,st.peek());
		st.add(5);
		assertEquals(5,st.get());
		assertEquals(4,st.get());
		st.get();
		assertEquals(2,st.get());
	}

	@Test
	void testQueue() {
		Queue st = new Queue();
		st.add(1);
		st.add(2);
		st.add(3);
		st.add(4);
		assertEquals(1,st.peek());
		st.add(5);
		assertEquals(1,st.get());
		assertEquals(2,st.get());
		st.get();
		assertEquals(4,st.get());
	}
	

	
	@Test
	public void testAddLast() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		assertArrayEquals(new int[] {1,2,3}, list.toArray());
	}

	@Test
	public void testAddLast2() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		assertArrayEquals(new int[] {1}, list.toArray());
	}

	
	@Test
	public void testAddFirst() {
		LinkedList list = new LinkedList();
		list.addFirst(1);
		list.addFirst(2);
		list.addFirst(3);
		assertArrayEquals(new int[] {3,2,1}, list.toArray());
	}

	@Test
	public void testIsEmpty() {
		LinkedList list = new LinkedList();
		list.addFirst(2);
		assertEquals(list.isEmpty(),false);
		list.removeFirst();
		assertEquals(list.isEmpty(),true);
		list.addLast(1);
		assertEquals(list.isEmpty(),false);
		list.removeLast();
		assertEquals(list.isEmpty(),true);
	}
	
	@Test
	public void testClear() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.clear();
		assertArrayEquals(new int[] {}, list.toArray());
	}
	
	@Test
	public void testRemoveFirst() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		int q = list.removeFirst();
		assertEquals(q,1);
		assertArrayEquals(new int[] {2,3}, list.toArray());
	}

	@Test
	public void testRemoveLast() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		int q = list.removeLast();
		assertEquals(q,3);
		assertArrayEquals(new int[] {1,2}, list.toArray());
	}

	@Test
	public void testSet() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.set(1, 5);
		list.set(0, 4);
		list.set(2, 6);

		assertArrayEquals(new int[] {4,5,6}, list.toArray());
	}
	
	@Test
	public void testGet() {
		LinkedList list = new LinkedList();
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);

		assertEquals(1,list.get(0));
		assertEquals(2,list.get(1));
		assertEquals(3,list.get(2));
	}

	
}
