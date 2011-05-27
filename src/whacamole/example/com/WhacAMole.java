package whacamole.example.com;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class WhacAMole extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new GameEngine(this));

	}
}
