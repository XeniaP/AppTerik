package com.terik.xenia.terik.helper;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.terik.xenia.terik.R;

public class DashboardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_consulta__usuarios, menu);
        return true;
    }
}