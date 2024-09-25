package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {
    // Add tests for the BinaryTree class here

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals("1 2 3 4 5 6 7", tree.levelOrderTraversal());
    }
    
    @Test
    public void testLevelOrderTraversal2() { // empty
    	BinaryTree tree = new BinaryTree();
    	assertEquals("", tree.levelOrderTraversal());
    }
    
    
    @Test 
    public void invert() {
    	BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.invert();
        assertEquals("1 3 2", tree.levelOrderTraversal());
    }
    
    @Test 
    public void height() { // empty
    	BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.getHeight());
        
    }
    @Test 
    public void height2() { // balanced
    	BinaryTree tree = new BinaryTree();
    	 tree.add(1);
         tree.add(2);
         tree.add(3);
        assertEquals(1, tree.getHeight());
        
    }
    @Test 
    public void height3() { // unbalanced
    	BinaryTree tree = new BinaryTree();
    	tree.add(1);
        tree.add(2);
        assertEquals(1, tree.getHeight());
        
    }
    
}





