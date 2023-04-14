package com.example.android55lesson1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	AppCompatButton button;
	EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViews();
		setClicks();
	}

	private void findViews() {
		button = findViewById(R.id.textView);
		editText = findViewById(R.id.editText);
	}

	private void setClicks() {
		button.setOnClickListener(v -> {
			if(!editText.getText().toString().isEmpty()) {
				navigateToSecond(editText.getText().toString());
			}else {
				System.out.println("PLEASE WRITE YOUR NAME!");
			}
		});
	}

	private void navigateToSecond(String name) {
		Intent intent = new Intent(this, SecondActivity.class);
		intent.putExtra("name", name);
		startActivity(intent);
	}
}