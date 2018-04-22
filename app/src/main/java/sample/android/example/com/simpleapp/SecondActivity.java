package sample.android.example.com.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        int i = getIntent().getIntExtra("User",0);
        Toast.makeText(this, "User" + i, Toast.LENGTH_SHORT).show();
        Button bt2 = findViewById(R.id.btClickedMe);
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SecondActivity.this, "You Clicked Me Again", Toast.LENGTH_SHORT).show();
                Intent int2 = new Intent(SecondActivity.this, MainActivity.class);

            }
        });
    }
}
