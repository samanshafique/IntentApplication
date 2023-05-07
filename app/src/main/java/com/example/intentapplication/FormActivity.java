package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import android.os.Bundle;

public class FormActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton selectedRadioButton;
    Button buttonSubmit;
    private EditText messageEditText1;
    private EditText messageEditText2;

    CheckBox cb1, cb2, cb3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        // layout instances
        buttonSubmit = (Button) findViewById(R.id.btnSubmit);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);

        messageEditText1 = findViewById(R.id.editText1);
        messageEditText2 = findViewById(R.id.edit_text2);


        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message1 = messageEditText1.getText().toString();
                String message2 = messageEditText2.getText().toString();



                selectedRadioButton  = (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
                // get RadioButton text
                String yourVote = selectedRadioButton.getText().toString();

                String selectedCheckboxes = "";

                if (cb1.isChecked()) {
                    selectedCheckboxes += cb1.getText().toString() + ", ";
                }
                if (cb2.isChecked()) {
                    selectedCheckboxes += cb2.getText().toString() + ", ";
                }
                if (cb3.isChecked()) {
                    selectedCheckboxes += cb3.getText().toString() + ", ";
                }


                Toast.makeText(FormActivity.this, "Name : "+message1 +"\n Email : "+message2 +"\n Selected Radio Button is:" + yourVote + "\n CheckBox Choices: \n "+ selectedCheckboxes , Toast.LENGTH_LONG).show();
// Create the toast message

            }

        });


    }
}




//    String toastMessage = "Message 1: " + message1 + "\nMessage 2: " + message2;
//                    Toast.makeText(MainActivity6.this, toastMessage, Toast.LENGTH_SHORT).show();



