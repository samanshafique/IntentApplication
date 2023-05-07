package com.example.intentapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DataDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_display);

        TextView textView;



            textView = findViewById(R.id.text_view_summary);

            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                String data = extras.getString("key");
                textView.setText(data);
            }
    }
}







//
//public class Second extends AppCompatActivity {
//    private TextView mTextViewSummary;
//
//    public static Intent newIntent(Context packageContext, Bundle bundle) {
//        Intent intent = new Intent(packageContext, Second.class);
//        intent.putExtras(bundle);
//        return intent;
//    }
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_second);
//
//        mTextViewSummary = findViewById(R.id.text_view_summary);
//
//        Bundle bundle = getIntent().getExtras();
//        String username = bundle.getString("username");
//        boolean isValidCredentials = bundle.getBoolean("isValidCredentials");
//
//        if (isValidCredentials) {
//            mTextViewSummary.setText("Login successful. Welcome " + username + "!");
//        } else {
//            mTextViewSummary.setText("Login failure.");
//        }
//    }
//
//}
//

// Calculation
//    public void calc(View view) {
//        EditText harga = (EditText) findViewById(R.id.editText2);
//        EditText discount = (EditText) findViewById(R.id.editText);
//        TextView result = (TextView) findViewById(R.id.textView3);
//        double harga1 = Double.parseDouble(harga.getText().toString());
//        double disc = Double.parseDouble(discount.getText().toString());
//
//        double  total = harga1 - (harga1*disc);
//
//        result.setText(harga1 + " is " + total + " after discount " + disc);
//    }
