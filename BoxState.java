//Khushboo Babariya - 1001668208
//State Pattern
public class BoxState implements State {

	@Override
	public ShapeElement createShape(Context context) {
		return new Box();
	}

}
