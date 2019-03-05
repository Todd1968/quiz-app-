package com.example.android.myquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.ArrayList;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
/** Called when Activity is first created**/

    int score = 0;
    int question = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //question 1 = new Question("What represents Alabama football?", "Elephant", "Eagle", "Tide");questionList.add(q1);
        //question 2 = new Question("Who is the greatest Alabama coach?", "Bryant", "Saban", "Wade");questionList.add(q2);
        //question 3 = new Question("What is the name of the band?", "Dixie Band", "Million Dollar Band" , "Big AL");questionList.add(q3);
        // question 4 = new Question("What is an Alabama football greating?", "Roll Tide");questionList.add(q4);

        //Checkbox answers for first question//
            CheckBox elephantCheckBox = (CheckBox)findViewById(R.id.elephant_checkbox); boolean elephant = elephantCheckBox.isChecked();
            CheckBox eagleCheckBox = (CheckBox)findViewById(R.id.eagle_checkbox); boolean eagle = eagleCheckBox.isChecked();
            CheckBox tideCheckBox = (CheckBox)findViewById(R.id.tide_checkbox); boolean tide = tideCheckBox.isChecked();

        if (elephantCheckBox.isChecked() && tideCheckBox.isChecked()&& !eagleCheckBox.isChecked()) { score += 1; }

        //Checkbox answers for second question//
            CheckBox bryantCheckBox = (CheckBox)findViewById(R.id.bryant_checkbox); boolean bryant = bryantCheckBox.isChecked();
            CheckBox sabanCheckBox = (CheckBox)findViewById(R.id.saban_checkbox); boolean saban = sabanCheckBox.isChecked();
            CheckBox wadeCheckBox  = (CheckBox)findViewById(R.id.wade_checkbox); boolean wade = wadeCheckBox.isChecked();

        if (bryantCheckBox.isChecked() && sabanCheckBox.isChecked()&& !wadeCheckBox.isChecked()) { score += 1; }

        //Radio Button answers for third question//
            RadioButton radioButton = (RadioButton) findViewById(R.id.radio_button2);
            boolean isradioButton2Checked = radioButton.isChecked();
            if (isradioButton2Checked )
            {
                score += 1;
            }

         //Text answer for question 4//
            EditText answerField = (EditText) findViewById(R.id.answer_field);
            String userString = answerField.getText().toString();
            String answer = "roll tide";
            boolean isAnswerTrue = "roll_tide".equals(userString);
        if(isAnswerTrue ) { score += 1; }

        // Toast message with score
             {
                if (score == 4) {
                    Toast.makeText(getActivity(), "Yea Alabama!", Toast.LENGTH_LONG).show();}

                else { Toast.makeText(this, "Nice work You get "+ score , Toast.LENGTH_SHORT).show();

                    }
                }


    }}
