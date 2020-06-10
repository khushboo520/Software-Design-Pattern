//Khushboo Babariya - 1001668208

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame1 extends JFrame{
	   JPanel contentPane;   
	   BorderLayout borderLayout1 = new BorderLayout();
	   Canvas canvas=new Canvas();
	   JPanel jPanel1 = new JPanel();
	   JButton boxButton = new JButton(" Box ");
	   JButton circleButton = new JButton("Circle");
	   JButton undoButton=new JButton(" Undo ");
	   JButton redoButton=new JButton(" Redo ");
	   	   
	   public Frame1(){
		   super();
		      try {
		         setDefaultCloseOperation(EXIT_ON_CLOSE);
		         jbInit();
		      } catch(Exception exception) {
		         exception.printStackTrace();
		      }
	   }

	private void jbInit() {
		
		 contentPane = (JPanel) getContentPane();
         contentPane.setLayout(borderLayout1);
         canvas.setVisible(true);
         setSize(new Dimension(800, 600));
         setTitle("HW2 GUI");
         boxButton.setPreferredSize(new Dimension(100, 40));
         circleButton.setPreferredSize(new Dimension(100,40));
         undoButton.setPreferredSize(new Dimension(100, 40));
         redoButton.setPreferredSize(new Dimension(100, 40));
         jPanel1.setPreferredSize(new Dimension(800	, 50));
         
         contentPane.add(jPanel1, java.awt.BorderLayout.NORTH);
         contentPane.add(canvas, java.awt.BorderLayout.CENTER);
         jPanel1.add(circleButton);
         jPanel1.add(boxButton);
         jPanel1.add(undoButton);
         jPanel1.add(redoButton);
         undoButton.setEnabled(false);
         redoButton.setEnabled(false);
         
		
	}
	
	public JButton getCircle(){
		return circleButton;
	}
	
	public JButton getBox(){
		return boxButton;
	}
	
	public JButton getUndo(){
		return undoButton;
	}
	
	public JButton getRedo(){
		return redoButton;
	}
	
	public Canvas getCanvas(){
		return canvas;
	}
	
	public Graphics getGraphics1(){
		return getGraphics();
	}
	
}
