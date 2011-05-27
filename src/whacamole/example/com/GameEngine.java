package whacamole.example.com;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class GameEngine extends View implements Callback{

	
	private int y; 
	
	public int score = 0;
	long starttime;
	
	private List<Drawable> drawables = new ArrayList <Drawable>();
	
	private Handler mHandler;

	public GameEngine(Context context) {
		super(context);
		
		mHandler = new Handler(this);
		
		new GameUpdateThread(mHandler).start();
		
		starttime=System.currentTimeMillis();
		
	
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		super.onDraw(canvas);
		for (Drawable d: drawables){
			d.draw(canvas);
		}
	}

	@Override
	public boolean handleMessage(Message arg0) {
		// TODO Auto-generated method stub
	if (System.currentTimeMillis() - starttime >20000){
		endGame();
     }else{
    	 drawables.add(new Mole( (int)(Math.random()*320), (int)(Math.random()*480)));
    
		invalidate();
		
	}
	return false;
}

		// TODO Auto-generated method stub
		
	

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		if (event.getAction()!=MotionEvent.ACTION_UP)
		for (Drawable d: drawables){
			if (d.press(event)==true)
				score++;
		}
				
	
	return super.onTouchEvent(event);
	
	}
	private void endGame()
	{
		Toast toast=Toast.makeText(this.getContext(), "Score:" + score, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
		toast.show();
	}
}
