package sample.android.example.com.simpleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt1 = findViewById(R.id.btClickMe);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "CLicked Me!", Toast.LENGTH_SHORT).show();
                Intent int1 = new Intent(MainActivity.this, SecondActivity.class);
                int1.putExtra("User",1);
                startActivity(int1);
            }
        });

    }
}
