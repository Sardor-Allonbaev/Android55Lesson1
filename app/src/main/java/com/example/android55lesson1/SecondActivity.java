package com.example.android55lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

	TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_second);

		textView = (TextView) findViewById(R.id.textView);
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		textView.setText(name);
	}
}