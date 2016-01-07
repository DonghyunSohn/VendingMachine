package com.hanssem.vendingmachine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener listener = new View.OnClickListener()
        {
            @Override
        public void onClick(View v)
            {


            }
        };
        Button button001 = (Button) findViewById(R.id.button001);
        button001.setOnClickListener(listener);

        Button button002 = (Button) findViewById(R.id.button002);
        button002.setOnClickListener(listener);

        Button button003 = (Button) findViewById(R.id.button003);
        button003.setOnClickListener(listener);

        Button button004 = (Button) findViewById(R.id.button004);
        button004.setOnClickListener(listener);

        Button button005 = (Button) findViewById(R.id.button005);
        button005.setOnClickListener(listener);

        Button button006 = (Button) findViewById(R.id.button006);
        button006.setOnClickListener(listener);

        Button button007 = (Button) findViewById(R.id.button007);
        button007.setOnClickListener(listener);

        Button button008 = (Button) findViewById(R.id.button008);
        button008.setOnClickListener(listener);

        Button button009 = (Button) findViewById(R.id.button009);
        button009.setOnClickListener(listener);
    }
}
