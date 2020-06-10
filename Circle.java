//Khushboo Babariya - 1001668208
//Composite Pattern: Leaf
import java.awt.Graphics;


public class Circle extends ShapeElement {

	@Override
	public void Draw(Graphics g) {
		g.drawOval(positionX, positionY, 100, 100);
		 	
	}

	

}
