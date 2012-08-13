package rmit.cosc2543.taskplanner;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TabHost;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Resources res = getResources(); // Resource object to get Drawables
        TabHost tabHost = getTabHost();  // The activity TabHost
        TabHost.TabSpec spec;  // Resusable TabSpec for each tab
        Intent intent;  // Reusable Intent for each tab

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, AllTasksActivity.class);

        // Initialize a TabSpec for each tab and add it to the TabHost
        spec = tabHost.newTabSpec("allTasks").setIndicator("All Tasks", res.getDrawable(R.drawable.all_tasks_icon)).setContent(intent);
        tabHost.addTab(spec);

        // Do the same for the other tabs
        intent = new Intent().setClass(this, TodayTasksActivity.class);
        spec = tabHost.newTabSpec("albums").setIndicator("Today Tasks", res.getDrawable(R.drawable.today_tasks_icon)).setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, OptionActivity.class);
        spec = tabHost.newTabSpec("songs").setIndicator("Option", res.getDrawable(R.drawable.option_icon)).setContent(intent);
        tabHost.addTab(spec);

        tabHost.setCurrentTab(1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
