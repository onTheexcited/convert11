package cn.edu.bistu.cs.se.convert11;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Button btn5 = (Button) findViewById(R.id.button5);

        final Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final Integer age = intent.getIntExtra("age", 13);
        Toast.makeText(Main3Activity.this,name+age,Toast.LENGTH_LONG).show();
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("result","姓名："+name+" 年龄"+age);
                setResult(1, intent);
                finish();
            }
        });
        Button btn6 = (Button) findViewById(R.id.button6);

        final Intent intents = getIntent();
        final String names = intent.getStringExtra("name");
        final Integer ages = intent.getIntExtra("age", 20);
        Toast.makeText(Main3Activity.this,name+age,Toast.LENGTH_LONG).show();
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intents.putExtra("result","姓名："+names+" 年龄"+ages);
                setResult(1, intents);
                finish();
            }
        });


    }

}
