package whacamole.example.com;

import android.graphics.Canvas;
import android.view.MotionEvent;

public interface Drawable {

	public void draw (Canvas canvas);
	public boolean press(MotionEvent evt);
	
}
