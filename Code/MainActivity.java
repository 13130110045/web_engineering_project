package com.icourse.CollegeLifeManager;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
public class MainActivity extends Activity {
	
	//�˵�ѡ��
	public static final int HELP = Menu.FIRST;
	public static final int EXIT = Menu.FIRST + 1;
	public static final int SCORE = Menu.FIRST + 2; 
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        setTitle("��ѧ�����������");
        find_and_modify_button();
        Toast.makeText(MainActivity.this,  
                "��ӭʹ�ô�ѧ�����������", Toast.LENGTH_SHORT).show();
    }

	private void find_and_modify_button() {
		// TODO Auto-generated method stub
		Button btn_course = (Button) findViewById(R.id.btn_course);
		btn_course.setOnClickListener(course_listener);
		Button btn_diary = (Button) findViewById(R.id.btn_diary);
		btn_diary.setOnClickListener(diary_listener);
	}
	private Button.OnClickListener course_listener = new OnClickListener()
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, course_activity.class);
			startActivity(intent);
		}
	};
	private Button.OnClickListener diary_listener = new OnClickListener()
	{
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(MainActivity.this, diary_activity.class);
			startActivity(intent);
		}
	};


	@Override
	/*
	 * menu.findItem(EXIT_ID);�ҵ��ض���MenuItem
	 * MenuItem.setIcon.��������menu��ť�ı���
	 */
	public boolean onCreateOptionsMenu(Menu menu) {
		super.onCreateOptionsMenu(menu);
		menu.add(0, HELP, 0, "����").setIcon(R.drawable.helps);
		menu.add(0, EXIT, 0, "�˳�").setIcon(R.drawable.exit);
		menu.add(0, SCORE, 0, "����").setIcon(R.drawable.score);
		return true;
	}
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case HELP: 
			 Intent help_intent = new Intent();
			 help_intent.setClass(MainActivity.this, help_activity.class);
			 startActivity(help_intent);
		break;
		case SCORE:
			 Intent score_intent = new Intent();
			 score_intent.setClass(MainActivity.this, score_activity.class);
			 startActivity(score_intent);
		break;
		case EXIT: 
			finish();
		 break;

		}
		return super.onOptionsItemSelected(item);
	}

}