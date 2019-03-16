package com.cse427.group02.project01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // Logger for this class.
    private static final String TAG = "MainActivity";
    // The input field where the user enters his name.
    private EditText mNameText;
    // The date picker where the user enters his date of birth.
    private DatePicker mDobPicker;
    // The input field where the user enters his email.
    private EditText mEmailText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Shortcuts to input fields.
        mNameText = (EditText) findViewById(R.id.userNameInput);
        mDobPicker = (DatePicker) findViewById(R.id.dateOfBirthInput);
        mEmailText = (EditText) findViewById(R.id.emailInput);
    }
}
