package com.example.braca.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.myfirstapplication.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void products(View view) {
        Intent intent = new Intent(this, ProductsActivity.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        //HolaMundo
        startActivity(intent);
    }

    public void markets(View view)
    {
        Intent intent = new Intent(this, MarketsActivity.class);
        startActivity(intent);
    }

    public void stats(View view)
    {
        Intent intent = new Intent(this, StatsActivity.class);
        startActivity(intent);
    }
}
