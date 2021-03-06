package com.example.nitinpandit.aicte_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.R.*;
import android.view.View;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.new_member:
                Intent intent = new Intent(Home.this, Member.class);
                startActivity(intent);
                return true;

        }
        return false;
    }

    public void familyDetails(View view)
    {
        Intent intent = new Intent(Home.this, MemberList.class);
        startActivity(intent);
    }

    public void addMember(View view)
    {
        Intent intent = new Intent(Home.this, Member.class);
        startActivity(intent);
    }
}
