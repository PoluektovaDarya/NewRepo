package com.example.tableau;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Integer countFirst = 0;
    Integer countSecond = 0;

    TextView addSleep;
    TextView addEat;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSleep(View view) {
        countFirst++;
        TextView addSleep = findViewById(R.id.countSleep);
        addSleep.setText(countFirst.toString());
    }

    public void onClickEat(View view) {
        countSecond++;
        TextView addEat = findViewById(R.id.countEat);
        addEat.setText(countSecond.toString());
    }

    public void throwOff(View view) {
        countFirst = 0;
        countSecond = 0;
        TextView addSleep = findViewById(R.id.countSleep);
        addSleep.setText(countFirst.toString());
        TextView addEat = findViewById(R.id.countEat);
        addEat.setText(countSecond.toString());
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("eat", countFirst);
        outState.putInt("sleep", countSecond);
    }
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        countFirst = savedInstanceState.getInt("eat");
        countSecond = savedInstanceState.getInt("sleep");
    }
}
