package rmit.cosc2543.taskplanner;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TodayTasksActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today_tasks);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_today_tasks, menu);
        return true;
    }
}
