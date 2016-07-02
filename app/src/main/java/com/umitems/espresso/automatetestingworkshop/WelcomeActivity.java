package com.umitems.espresso.automatetestingworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.umitems.espresso.automatetestingworkshop.databinding.ActivityWelcomeBinding;

public class WelcomeActivity extends AppCompatActivity {
    //ActivityMainBinding binding;
    Button button;
    TextView textView;
    ActivityWelcomeBinding activityWelcomeBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Intent intent=getIntent();

        textView=(TextView)findViewById(R.id.tvWelcome);
        button=(Button) findViewById(R.id.btnHello);
textView.setText(intent.getStringExtra("name"));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("ddd");
            }
        });
    }
}
