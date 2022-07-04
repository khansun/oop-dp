package labexam17;


import java.util.ArrayList;

public class Tree {
	int value;
	ArrayList<Tree> children = new ArrayList<Tree>(100);
	
	Tree(int nodeValue){
			this.value = nodeValue;
		}
	public void addChil(Tree child) {
			this.children.add(child);
		// TODO Auto-generated method stub

	}
		int countDescendent() {
			int descendents;
			if (children.isEmpty()) {
				descendents = 0;
			}
			else {
					descendents = children.size();
					int more =0;
					for(int i= 0 ; i< children.size(); i++)
						more+= children.get(i).countDescendent();
					descendents = descendents+more;
			}
			return descendents;
				
		}
			
}
	


