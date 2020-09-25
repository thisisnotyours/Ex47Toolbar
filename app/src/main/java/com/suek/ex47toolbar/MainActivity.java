package com.suek.ex47toolbar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar= findViewById(R.id.toolbar);   //참조변수를 지역변수로 만듦
        //액티비티에게 툴바를 액션바로 사용하겠다고 설정
        setSupportActionBar(toolbar);


        //액션바의 제목글씨가 보이지 않도록 하려면..
        ActionBar actionBar= getSupportActionBar();
        actionBar.setDisplayShowTitleEnabled(false);
    }

    //옵션메뉴(액션바메뉴)를 만드는 작업메소드 (처음 시작시 자동호출)


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.actionbar, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
