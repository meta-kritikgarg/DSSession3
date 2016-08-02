package binarytree;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void testIsEmpty() {
		BinaryTree bt = new BinaryTree();
		assertEquals(true, bt.isEmpty());
		bt.insert(23);
		assertNotEquals(true, bt.isEmpty());
	}

	@Test
	public void testInsert() {
		BinaryTree bt = new BinaryTree();
		bt.insert(23);
		bt.insert(34);
		assertEquals(false, bt.isEmpty());
	}

	@Test
	public void testPreorder() {
		BinaryTree bt = new BinaryTree();
		bt.insert(23);
		bt.insert(34);
		bt.insert(12);
		bt.insert(11);
		bt.preorder();
	}

	@Test
	public void testPostorder() {
		BinaryTree bt = new BinaryTree();
		bt.insert(23);
		bt.insert(34);
		bt.insert(12);
		bt.insert(11);
		bt.preorder();
	}

	@Test
	public void testIsMirror() {
		BinaryTree bt = new BinaryTree();
		bt.insert(12);
		BinaryTree bt2 = new BinaryTree();
		bt.insert(12);
		bt.preorder();
	}

}
