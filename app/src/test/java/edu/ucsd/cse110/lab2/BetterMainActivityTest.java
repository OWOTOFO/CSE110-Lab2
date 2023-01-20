package edu.ucsd.cse110.lab2;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest extends AppCompatActivity {
    @Test
    public void PartThreeTest(){
        var scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.moveToState(Lifecycle.State.STARTED);

        scenario.onActivity(activity -> {
            var one = activity.findViewById(R.id.btn_one);
            var plus = activity.findViewById(R.id.btn_plus);
            var equal = activity.findViewById(R.id.btn_equals);
            TextView result = (TextView)activity.findViewById(R.id.display);
            one.performClick();
            plus.performClick();
            one.performClick();
            equal.performClick();

            assertEquals(result.getText().toString(),"2");
        });
    }
}
