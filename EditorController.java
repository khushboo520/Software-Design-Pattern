//Khushboo Babariya - 1001668208


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.Stack;


//Controller Pattern
public class EditorController {
	
	Frame1 f=new Frame1();
	Picture p=new Picture();
	Graphics g;
	Context context=new Context();
	public void initController() {			
		
		f.setVisible(true);		
		f.getCanvas().addMouseListener(new MouseAdapter() {			
            //@Override
       	  public void mousePressed(MouseEvent e) {
       		f.getUndo().setEnabled(true);
       		State currrentShapeState=context.getState();
       		ShapeElement currrentShape=currrentShapeState.createShape(context);
       		currrentShape.positionX=(int)e.getPoint().getX();
       		currrentShape.positionY=(int)e.getPoint().getY();       	
	       	g= f.getGraphics1();
	       	// Composite pattern applied
	       	currrentShape.Draw(g);
	        p.PushShape(currrentShape);
            
       	  }
         });
		
		f.getCircle().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {   
            	//State Pattern Applied
            	context.setState(new CircleState());        	 
            }
          });
		
		f.getBox().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	//State Pattern Applied
            	context.setState(new BoxState());               	 
            }
          });
		
		f.getUndo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	f.getRedo().setEnabled(true);
            	Graphics gc = f.getCanvas().getGraphics();           
                gc.clearRect(0,0, f.getCanvas().getWidth(), f.getCanvas().getHeight()); 
                //Command Pattern Applied
            	Command cmd=new UndoCommand();
            	cmd.execute(p);
            	p.Draw(g);
            	if(p.getHistory().size() == 0){
            		f.getUndo().setEnabled(false);
            	}
            }
          });
		
		f.getRedo().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Graphics gc = f.getCanvas().getGraphics();           
                gc.clearRect(0,0, f.getCanvas().getWidth(), f.getCanvas().getHeight());
                //Command Pattern Applied
            	Command cmd=new RedoCommand();
            	cmd.execute(p);
            	p.Draw(g);
            	if(p.getReverseHistory().size() == 0){
            		f.getRedo().setEnabled(false);
            	}
            }
          });
		 
	}
}
