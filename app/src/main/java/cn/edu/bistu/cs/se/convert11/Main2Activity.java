package cn.edu.bistu.cs.se.convert11;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btn3 = (Button) findViewById(R.id.button3);

        final Intent intent = getIntent();
        final String name = intent.getStringExtra("name");
        final Integer age = intent.getIntExtra("age", 13);
        Toast.makeText(Main2Activity.this,name+age,Toast.LENGTH_LONG).show();
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("result","姓名："+name+" 年龄"+age);
                setResult(0, intent);
                finish();
            }
        });
        Button btn4=(Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(Main2Activity.this,Main3Activity.class);
                intent.putExtra("name","李四");
                intent.putExtra("age",20);

                startActivityForResult(intent,1);
            }
        });


    }
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == 1) {
            String str = data.getStringExtra("result");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();

        }
    }
}
