package basic;
import java.util.Iterator;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


/* @author Deniz Tanaci
* This class is used to test the methods of the SinglyLinkedList class with jUnit 
*/


class SinglyLinkedListTest {

	SinglyLinkedList<Integer> l; // the singly linked list object we will use to test our code

	/**
	 * @BeforeEach before the setUp() method indicates that this code will run
	 *             before each test
	 *             In this case, we instantiate the object l of type
	 *             SinglyLinkedList<Integer>
	 */
	@BeforeEach
	public void setUp() {
		l = new SinglyLinkedList<Integer>();
	}

	// mark all tests with @Test
	@Test
	void testConstructor() {
		assertTrue(l.isEmpty());
	}

	/**
	 * Note this technically is testing both addFirst
	 * and getFirst at the same time.
	 */
	@Test
	void testAdd() {
		l.add(1);
		assertEquals(l.get(0), 1);

		l.add(2);
		assertEquals(l.get(0), 2);

		l.add(3);
		assertEquals(l.get(0), 3);
	}
	// testing removal
	@Test
	void testRemove() {
		l.add(1);
		l.add(2);
		int compare = l.get(1);
		l.remove();
		assertEquals(l.get(0), compare);

	}
	// testing size
	@Test
	void testSize() {
		l.add(1);
		l.add(2);
		assertEquals(l.size(), 2);

	}
	// testing clear
	@Test
	void testClear() {
		l.add(1);
		l.add(2);
		l.clear();
		assertEquals(l.size(), 0);

	}
	// testing isEmpty
	@Test
	void testIsEmpty() {
		l.add(1);
		l.remove();
		assertTrue(l.isEmpty());

	}



	// the convention is to name methods as test+name of method to test + any
	// particular subcase
	// e.g., here, test the get method, specifically what happens when requesting an
	// index out of bounds
	@Test
	void testGetRange() {
		assertThrows(IndexOutOfBoundsException.class, () -> {
			l.get(1);
		});
	}

}
