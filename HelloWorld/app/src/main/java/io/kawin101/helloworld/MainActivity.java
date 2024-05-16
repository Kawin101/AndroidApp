package io.kawin101.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onBtnClick (View view) {
        TextView txtMessageFirst = findViewById(R.id.textMessageFirstName);
        TextView txtMessageLast = findViewById(R.id.textMessageLastName);
        TextView txtMessageEmail = findViewById(R.id.textMessageEmail);

        EditText editTextFirst = findViewById(R.id.editTextFirstName);
        EditText editTextLast = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);

        txtMessageFirst.setText(String.format("First Name: %s", editTextFirst.getText().toString()));
        txtMessageLast.setText(String.format("Last Name: %s", editTextLast.getText().toString()));
        txtMessageEmail.setText(String.format("Email: %s", editTextEmail.getText().toString()));

    }
}