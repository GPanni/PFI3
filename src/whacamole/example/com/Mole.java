package whacamole.example.com;

import java.util.Random;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;
import android.view.MotionEvent;

public class Mole implements Drawable {
	
	private int posX, posY;
	private float radius=30;
	Random rand = new Random();
	public Mole(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
	}

	
	int life = 6;


	@Override
	public void draw(Canvas canvas) {
		// TODO Auto-generated method stub
	   if (life>0){
			Paint paint = new Paint();
			paint.setColor(Color.BLUE);
			canvas.drawCircle(posX, posY, (float) radius, paint);
			life--;
		}
	   if (life == 0){
		   
	   }
	   }
	   
	
	@Override
	public boolean press(MotionEvent evt) {
		float dx = (posX - evt.getX());
		float dy = (posY - evt.getY());
		if (life>0)
			if (Math.sqrt(dx*dx+dy*dy)<radius){
			
		
		
		Log.i("TEST", "HIT");
		
			
			life = 0;
		return true;
		}
		return false;
	
	
	}
	public void update(){

	if (life<0){
		if (rand.nextInt(100)>98)
			life=6;
	}
	}
}
