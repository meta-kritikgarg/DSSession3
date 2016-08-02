package binarytree;
/**
 * 
 * @author Kritik
 *
 */

public class BinaryTree {
	
	BinaryNode root;
	
	public BinaryTree() {
		root = null;
	}

	/**
	 * to check if tree is empty
	 * @return Boolean
	 */
    public boolean isEmpty() {
        return root == null;
    }
    
    /**
     * to insert data
     * @param data
     */
    public void insert(int data) {
        root = insert(root, data);
    }

    /**
     * to insert data recursively
     * @param node {@link BinaryNode}
     * @param data E
     * @return {@link BinaryNode}
     */
    private BinaryNode insert(BinaryNode node, int data) {
        if (node == null) {
            node = new BinaryNode(data);
        }
        else {
            if (data <= node.getData()) {
                node.left = insert(node.left, data);
            }
            else {
                node.right = insert(node.right, data);
            }
        }
        return node;
    }
    

    /* Function for preorder traversal */
    public void preorder() {
        preorder(root);
    }
    private void preorder(BinaryNode root) {
        if (root != null) {
            System.out.println(root.getData());
            preorder(root.getLeft());             
            preorder(root.getRight());
        }
    }
    
    /* Function for postorder traversal */
    public void postorder() {
        postorder(root);
    }
    private void postorder(BinaryNode root) {
        if (root != null) {
            postorder(root.getLeft());             
            postorder(root.getRight());
            System.out.println(root.getData());
        }
    }     
    
    public boolean isMirror(BinaryNode root) {
		if(areMirror(root.getLeft(), root.getRight())) {
			return true;
		}
		else {
			return false;
		}
	}
    
    private boolean areMirror(BinaryNode left, BinaryNode right) {
    	if((left.data==right.data) && areMirror( left.getLeft(), right.getRight()) && areMirror(left.getRight(), right.getLeft()) ) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
    
/*    public BinaryTree getMirror() {
		BinaryTree mirror = new BinaryTree();
		mirror.root.left = root.right;
		mirror.root.right = root.left;
	}*/

}
