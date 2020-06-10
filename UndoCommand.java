//Khushboo Babariya - 1001668208
//Command Pattern
import java.util.Stack;

public class UndoCommand  extends Command{
	public  void execute(Picture p){		
		ShapeElement s=p.GetLastShape();
		p.PushReverseShape(s);
		p.PopShape();
		
		
	}
}
