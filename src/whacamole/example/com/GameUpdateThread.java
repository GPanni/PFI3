package whacamole.example.com;

import android.os.Handler;

public class GameUpdateThread extends Thread {
	
	private boolean running = true;
	
	private Handler handler; 
	
	public GameUpdateThread (Handler _handler){
		
		handler = _handler;
		
	}
	
	
	@Override
	public void run() {
		while (running){
		
		                     //update GameEngine
					       
					         try {
					        	  handler.sendEmptyMessage(0);
								Thread.sleep(400);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
		}
	}
}
