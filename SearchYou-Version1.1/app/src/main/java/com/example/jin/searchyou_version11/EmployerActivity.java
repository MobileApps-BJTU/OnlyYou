package com.example.jin.searchyou_version11;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class EmployerActivity extends ActionBarActivity {


    private GridView gridListView;
    private List<HashMap<String, String>> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employer);

        findVidwByIds();
        fillData();
        SimpleAdapter sa = new SimpleAdapter(this, data, R.layout.item_main, new String[]{"key", "title_1"}, new int[]{R.id.key, R.id.title_1});

        gridListView.setAdapter(sa);

        Button button = (Button)findViewById(R.id.createRec);
		
		button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNewActivity = new Intent(getApplicationContext(), NewRecruActivity.class);
                startActivity(openNewActivity);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_employer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void findVidwByIds() {
        gridListView = (GridView) findViewById(R.id.candidateHolder);
    }

    public void fillData() {

        data = new ArrayList<HashMap<String, String>>();


        HashMap<String, String> map = new HashMap<String, String>();
        map.put("key","Tom" );
        map.put("title_1","BJTU" );
        data.add(map);

        map = new HashMap<String, String>();
        map.put("key","Lily" );
        map.put("title_1","BJTU" );
        data.add(map);
    }
}
