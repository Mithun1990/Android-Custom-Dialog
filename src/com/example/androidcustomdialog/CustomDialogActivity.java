package com.example.androidcustomdialog;

import java.util.Calendar;

import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomDialogActivity extends Activity {
	private Dialog mDialog;
	private Button mBtn1, mBtn2;
	private ImageView mIm;
	private Button mBtnShowDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_dialog);
		mBtnShowDialog = (Button) findViewById(R.id.buttonShow);

		mBtnShowDialog.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				showCustomDialog();

			}
		});

	}

	protected void showCustomDialog() {
		// TODO Auto-generated method stub
		mDialog = new Dialog(CustomDialogActivity.this);
	
		mDialog.setContentView(R.layout.custom_dialog);
		mDialog.setTitle("Custom Dialog");
		
		
		mBtn1 = (Button) mDialog.findViewById(R.id.button1);
		mBtn2 = (Button) mDialog.findViewById(R.id.button2);
		mIm = (ImageView) mDialog.findViewById(R.id.imageView1);

		mBtn1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Toast toast = Toast.makeText(CustomDialogActivity.this,
						"You Pressed Button 1", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();

			}
		});

		mBtn2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Toast toast = Toast.makeText(CustomDialogActivity.this,
						"You Pressed Button 2", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();

			}
		});

		mIm.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {

				Toast toast = Toast.makeText(CustomDialogActivity.this,
						"You Pressed ImageView ", Toast.LENGTH_LONG);
				toast.setGravity(Gravity.CENTER, 0, 0);
				toast.show();

			}
		});

		mDialog.show();

	}
}
