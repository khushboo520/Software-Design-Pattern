//Khushboo Babariya - 1001668208
////Composite Pattern: Leaf
import java.awt.Graphics;

public class Box extends ShapeElement {

	@Override
	public void Draw(Graphics g) {
		 g.drawRect(positionX,positionY,100, 100);
		 	
	}

}
