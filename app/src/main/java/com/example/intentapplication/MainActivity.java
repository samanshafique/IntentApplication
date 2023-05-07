package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;


import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText mEditTextUsername;
    private EditText mEditTextPassword;
    private Button mButtonLogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setTitle("Resturant App " );
        mEditTextUsername = findViewById(R.id.edit_text_username);
        mEditTextPassword = findViewById(R.id.edit_text_password);
        mButtonLogin = findViewById(R.id.button_login);

        mEditTextUsername.addTextChangedListener(mTextWatcher);
        mEditTextPassword.addTextChangedListener(mTextWatcher);

        mButtonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = mEditTextUsername.getText().toString();
                String password = mEditTextPassword.getText().toString();

                Bundle bundle = new Bundle();
                bundle.putString("username", username);
                bundle.putString("password", password);

                if (isValidCredentials(username, password)) {
                   // bundle.putBoolean("isValidCredentials", true);
                    Intent intent = new Intent(MainActivity.this, Second.class);
                   // intent.putExtra("name", username);
                    startActivity(intent);
                } else {
//                    bundle.putBoolean("isValidCredentials", false);
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }



//                startActivity(Second.newIntent(MainActivity.this, bundle));
            }
        });
    }

    private TextWatcher mTextWatcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String username = mEditTextUsername.getText().toString().trim();
            String password = mEditTextPassword.getText().toString().trim();

            mButtonLogin.setEnabled(!username.isEmpty() && !password.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {
        }
    };

    private boolean isValidCredentials(String username, String password) {
        // Check if username and password are valid
        return username.equals("Saman") && password.equals("123");
    }
}
