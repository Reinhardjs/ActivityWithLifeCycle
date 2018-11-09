package com.example.reinhard.ayodevpertemuan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView textView = findViewById(R.id.pesan);
        final EditText input = findViewById(R.id.input);
        Button button = findViewById(R.id.tombol);

        //Bundle bundle = getIntent().getExtras();
        // bundle.getString("PESAN");

        String pesan = getIntent().getStringExtra("PESAN");
        textView.setText(pesan);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("PESAN2", input.getText().toString());

                setResult(RESULT_OK, intent);
            }
        });

    }
}
