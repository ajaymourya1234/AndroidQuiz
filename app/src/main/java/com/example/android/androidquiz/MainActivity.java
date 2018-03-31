package com.example.android.androidquiz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //boolean variables for deciding whether choice selected is true or false
    boolean a = false, b = false, c = false, d = false, e = false, f = false, g = false, h = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //checking whether the user selected correct answer on question no 1 then set a=true or else set a=false
    public void question1(View v) {
        //Declaring and defining RadioGroups
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if (rb.getId() == R.id.john_radio_button) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();

            a = true;
        } else {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            a = false;

        }
    }

    //checking whether the user selected correct answer on question no 2 then set b=true or else set b=false
    public void question2(View v) {
        //Declaring and defining RadioGroups
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group_2);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if (rb.getId() == R.id.linux_radio_button) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
            b = true;

        } else {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            b = false;

        }

    }

    //checking whether the user selected correct answer on question no 3 then set c=true or else set c=false
    public void question3(View v) {
        //Declaring and defining RadioGroups
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group_3);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if (rb.getId() == R.id.wifi_radio_button) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
            c = true;
        } else {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            c = false;
        }

    }

    //checking whether the user selected correct answer on question no 4 then set d=true or else set d=false
    public void question4(View v) {
        //Declaring and defining RadioGroups
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group_4);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if (rb.getId() == R.id.padding_radio_button) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
            d = true;
        } else {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            d = false;
        }
    }

    //checking whether the user selected correct pair of answers on question no 5 then set e=true or else set e=false
    public void question5(View v) {
        //Declaring and defining CheckBoxes
        CheckBox java = (CheckBox) findViewById(R.id.java_checkbox);
        CheckBox xml = (CheckBox) findViewById(R.id.xml_checkbox);
        CheckBox python = (CheckBox) findViewById(R.id.py_checkbox);
        CheckBox jfx = (CheckBox) findViewById(R.id.jfx_checkbox);
        if (java.isChecked() && xml.isChecked() && !(python.isChecked() || jfx.isChecked())) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
            e = true;
        } else if (python.isChecked() || jfx.isChecked()) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            e = false;
        }

    }

    //checking whether the user selected correct pair answers on question no 6 then set f=true or else set f=false
    public void question6(View v) {
        //Declaring and defining CheckBoxes
        CheckBox res = (CheckBox) findViewById(R.id.resources_checkbox);
        CheckBox dalvik = (CheckBox) findViewById(R.id.dalvik_checkbox);
        CheckBox cache = (CheckBox) findViewById(R.id.cache_checkbox);
        CheckBox none = (CheckBox) findViewById(R.id.none_checkbox);
        if ((res.isChecked() && dalvik.isChecked()) && !(cache.isChecked() || none.isChecked())) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
            f = true;
        } else if ((cache.isChecked() || none.isChecked())) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
            f = false;
        }

    }

    //checking whether the user has entered the correct answer on question no 7 then set g=true or else set g=false
    public void question7(View v) {
        //Declaring and defining EditText
        final EditText osName = (EditText) findViewById(R.id.edit_text_view);
        final String name = osName.getText().toString().toUpperCase();
        osName.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View view, int keyCode, KeyEvent event) {

                if (keyCode == KeyEvent.KEYCODE_ENTER && name.equalsIgnoreCase("android")) {
                    Toast.makeText(MainActivity.this,
                            "Your Answer Is Correct", Toast.LENGTH_SHORT).show();
                    osName.setImeOptions(EditorInfo.IME_ACTION_DONE);
                    g = true;
                    return true;
                } else {
                    Toast.makeText(MainActivity.this,
                            "Your Answer Is Wrong", Toast.LENGTH_SHORT).show();
                    g = false;
                    return false;
                }
            }
        });
    }

    //checking whether the user selected correct answer on question no 1 then set h=true or else set h=false
    public void question8(View v) {
        Log.v("main", "entered");
        //Declaring and defining RadioGroups
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group_5);
        RadioButton rb = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
        if (rb.getId() == R.id.no_radio_button) {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Correct", Toast.LENGTH_LONG).show();
            h = true;
        } else {
            Toast.makeText(MainActivity.this,
                    "Your Answer Is Wrong", Toast.LENGTH_LONG).show();
            h = false;
        }


    }

    //the report method assigns color to each questions layout depending on whether the user has entered correct or wrong answers
    public void report(View v) {
        //Declaring and defining Linearlayout that is for each qestions layout
        LinearLayout l1 = (LinearLayout) findViewById(R.id.question1_linear_layout);
        LinearLayout l2 = (LinearLayout) findViewById(R.id.question2_linear_layout);
        LinearLayout l3 = (LinearLayout) findViewById(R.id.question3_linear_layout);
        LinearLayout l4 = (LinearLayout) findViewById(R.id.question4_linear_layout);
        LinearLayout l5 = (LinearLayout) findViewById(R.id.question5_linear_layout);
        LinearLayout l6 = (LinearLayout) findViewById(R.id.question6_linear_layout);
        LinearLayout l7 = (LinearLayout) findViewById(R.id.question7_linear_layout);
        LinearLayout l8 = (LinearLayout) findViewById(R.id.question8_linear_layout);

        if (a == true) {
            //set question1_linear_layout to background clour red
            l1.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question1_linear_layout to background clour green
            l1.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (b == true) {
            //set question2_linear_layout to background clour red
            l2.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question2_linear_layout to background clour green
            l2.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (c == true) {
            //set question3_linear_layout to background clour red
            l3.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question3_linear_layout to background clour green
            l3.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (d == true) {
            //set question4_linear_layout to background clour red
            l4.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question4_linear_layout to background clour green
            l4.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (e == true) {
            //set question5_linear_layout to background clour red
            l5.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question5_linear_layout to background clour green
            l5.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (f == true) {
            //set question6_linear_layout to background clour red
            l6.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question6_linear_layout to background clour green
            l6.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (g == true) {
            //set question7_linear_layout to background clour red
            l7.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question7_linear_layout to background clour green
            l7.setBackgroundColor(Color.parseColor("#F44336"));
        }
        if (h == true) {
            //set question8_linear_layout to background clour red
            l8.setBackgroundColor(Color.parseColor("#00E676"));
        } else {
            //set question8_linear_layout to background clour green
            l8.setBackgroundColor(Color.parseColor("#F44336"));
        }


        TextView msg = (TextView) findViewById(R.id.message_text);
        msg.setText("Thank You");
    }

}
