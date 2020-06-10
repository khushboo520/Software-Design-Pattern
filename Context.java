//Khushboo Babariya - 1001668208
//State Pattern
public class Context {
	 private State state;

	   public Context(){
	      state = null;
	   }

	   public void setState(State state){
	      this.state = state;		
	   }

	   public State getState(){
	      return state;
	   }
}
