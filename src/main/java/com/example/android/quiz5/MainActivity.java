package com.example.android.quiz5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    }

    public void submit(View view) {
        score = 0;

        RadioGroup question1 = (RadioGroup) findViewById(R.id.question1);
        switch (question1.getCheckedRadioButtonId()) {
            case R.id.turku_button:
                score += 0;
                break;
            case R.id.oulu_button:
                score += 0;
                break;
            case R.id.helsinki_button:
                score++;
                break;
        }

        EditText question2 = (EditText) findViewById(R.id.question2b);
        String answer2 = question2.getText().toString();
        answer2 = answer2.trim();
        if (answer2.equalsIgnoreCase("Santa Claus")) {
            score++;
        }else {
            score += 0;
        }

        CheckBox spruce = (CheckBox) findViewById(R.id.cb_spruce);
        boolean spruceChecked = spruce.isChecked();

        CheckBox mountain = (CheckBox) findViewById(R.id.cb_mountain);
        boolean mountainChecked = mountain.isChecked();

        CheckBox lake = (CheckBox) findViewById(R.id.cb_lake);
        boolean lakeChecked = lake.isChecked();

        CheckBox numberSix = (CheckBox) findViewById(R.id.cb_numberSix);
        boolean numberSixChecked = numberSix.isChecked();

        if (spruceChecked && !mountainChecked && !lakeChecked && numberSixChecked) {
            score++;
        }

        RadioGroup question4 = findViewById(R.id.question4);
        switch (question4.getCheckedRadioButtonId()) {
            case R.id.kent_button:
                score += 0;
                break;
            case R.id.him_button:
                score++;
                break;
            case R.id.mew_button:
                score += 0;
                break;
        }

        EditText question5 = (EditText) findViewById(R.id.question5b);
        String answer5 = question5.getText().toString();
        answer5 = answer5.trim();
        if (answer5.equalsIgnoreCase("Blue and white")) {
            score++;
        } else {
            score += 0;
        }


        TextView scoreView = (TextView) findViewById(R.id.answerView);
        scoreView.setText("You got: " + score + "/5 points");

        Toast.makeText(this, "Your score is: " + score + " points!", Toast.LENGTH_SHORT).show();
    }

    public void reset(View view) {
        score = 0;

        RadioGroup question1 = (RadioGroup) findViewById(R.id.question1);
        question1.clearCheck();
        EditText question2 = (EditText) findViewById(R.id.question2b);
        question2.setText("");
        CheckBox spruce = (CheckBox) findViewById(R.id.cb_spruce);
        spruce.setChecked(false);
        CheckBox mountain = (CheckBox) findViewById(R.id.cb_mountain);
        mountain.setChecked(false);
        CheckBox lake = (CheckBox) findViewById(R.id.cb_lake);
        lake.setChecked(false);
        CheckBox numberSix = (CheckBox) findViewById(R.id.cb_numberSix);
        numberSix.setChecked(false);
        RadioGroup question4 = (RadioGroup) findViewById(R.id.question4);
        question4.clearCheck();
        EditText question5 = (EditText) findViewById(R.id.question5b);
        question5.setText("");
        TextView scoreView = (TextView) findViewById(R.id.answerView);
        scoreView.setText("");
    }
}






