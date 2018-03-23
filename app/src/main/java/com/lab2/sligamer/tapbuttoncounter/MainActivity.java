package com.lab2.sligamer.tapbuttoncounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Justin Freres on 1/27/2018.
 * CIS 262 LAB 2
 * Controller for TapButtonCounter
 */

public class MainActivity extends AppCompatActivity {

    // MODEL
    private Counter count;

    // VIEW
    private TextView countView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*
        CHANGE LAYOUT TO MAIN LAYOUT
        setContentView(R.layout.activity_main);
        */
        setContentView(R.layout.main_layout);

        /* INSTANTIATED NEW COUNTER CLASS */
        count = new Counter();

        /* INSTANTIATED TextView */
        countView = findViewById(R.id.textView);
    }

    /*
    OnClick Event for the Tap Button Counter
    increments the count number in the textview
    */
    public void countTap(View view) {
        count.addCount();
        countView.setText(count.getCount().toString());
    }

    /**
     * This appears to be not need if API > 14?
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * This appears to be not need if API > 14?
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        return id == R.id.action_settings || super.onOptionsItemSelected(item);
    }

}
