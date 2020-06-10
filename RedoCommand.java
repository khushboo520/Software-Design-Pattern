//Khushboo Babariya - 1001668208
//Command Pattern
import java.util.Stack;

public class RedoCommand extends Command{
	
	public  void execute(Picture p){
				ShapeElement s=p.GetLastReverseShape();
	    p.PushShape(s);
		p.PopReserveShape();
		
	}

}
