//Khushboo Babariya - 1001668208
//Composite Pattern: Composition of leaves
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class Picture extends ShapeElement{
	private Stack<ShapeElement> history=new Stack<ShapeElement>();
	private  Stack<ShapeElement> reverseStack=new Stack<ShapeElement>();
	
	@Override
	public void Draw(Graphics g) {
		// Iterator pattern applied 
        Iterator iterator = history.iterator(); 
          while (iterator.hasNext()) { 
       	 ShapeElement ele=(ShapeElement) iterator.next(); 
       	  ele.Draw(g);
        } 
			
	}
	
	public void PushShape(ShapeElement shape){
		history.push(shape);
	}
	
	public void PopShape(){
		history.pop();
	}
	
	public ShapeElement GetLastShape(){
		return history.peek();
	}
	
	public Stack<ShapeElement> getHistory(){
		return this.history;
	}

	
	public void PushReverseShape(ShapeElement shape){
		reverseStack.push(shape);
	}
	
	public void PopReserveShape(){
		reverseStack.pop();
	}
	
	public ShapeElement GetLastReverseShape(){
		return reverseStack.peek();
	}
	
	public Stack<ShapeElement> getReverseHistory(){
		return this.reverseStack;
	}

}
