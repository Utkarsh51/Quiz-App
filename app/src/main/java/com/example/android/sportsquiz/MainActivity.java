package com.example.android.sportsquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSubmit(View v) {
        int score = 0;
        RadioGroup radioGroup;
        int selectedId;
        CheckBox Option1;
        CheckBox Option2;
        CheckBox Option3;
        /**
         * checks answer of Question 1
         */
        radioGroup = findViewById(R.id.radio_group_question_1);
        selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.answer_1) {
            score += 1;
        }
        /**
         * checks answer of Question 2
         */
        Option1 = findViewById(R.id.answer_2_a);
        Option2 = findViewById(R.id.answer_2_b);
        Option3 = findViewById(R.id.answer_2_c);
        if (Option1.isChecked() && Option2.isChecked() && !(Option3.isChecked())) {
            score = score + 1;
        }
        /**
         * checks answer of Question 3
         */
        radioGroup = findViewById(R.id.radio_group_question_3);
        selectedId = radioGroup.getCheckedRadioButtonId();
        if (selectedId == R.id.answer_3) {
            score += 1;
        }
        /**
         *checks answer of Question 4
         */
        Option1 = findViewById(R.id.answer_4_a);
        Option2 = findViewById(R.id.answer_4_b);
        Option3 = findViewById(R.id.answer_4_c);
        if (Option1.isChecked() && Option2.isChecked() && !(Option3.isChecked())) {
            score += 1;
        }
        /**
         *checks answer of Question 5
         */
        EditText text = findViewById(R.id.answer_5);
        String answer5 = text.getText().toString();
        if (answer5.equals("10")) {
            score += 1;
        }
        /**
         *checks answer of Question 6
         */
        Option1 = findViewById(R.id.answer_6_a);
        Option2 = findViewById(R.id.answer_6_b);
        Option3 = findViewById(R.id.answer_6_c);
        if (Option1.isChecked() && Option3.isChecked() && !(Option2.isChecked())) {
            score += 1;
        }
        Log.i("MainActivity.java", "" + score);
        /**
         *Toast to display the grade
         */
        Toast.makeText(getApplicationContext(), "You scored " + score + "/6 points.", Toast.LENGTH_LONG).show();
    }
}
