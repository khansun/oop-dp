package labexam17;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    public void in() {
    	Tree root = new Tree(2);
   	Tree child1 = new Tree(5);
  	Tree child2 = new Tree(6);
	Tree grandchild1 = new Tree(1);
  	root.addChil(child1);
   	root.addChil(child2);
   	child1.addChil(grandchild1);
    	
    	
    	assertEquals(3, root.countDescendent());
    }
}
