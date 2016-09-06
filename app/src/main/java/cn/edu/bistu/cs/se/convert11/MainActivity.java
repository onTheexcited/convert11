package cn.edu.bistu.cs.se.convert11;

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
        Button btn=(Button) findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name","张三");
                intent.putExtra("age",13);

                startActivityForResult(intent,0);
            }
        });
        Button btn2=(Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent=new Intent(MainActivity.this,Main3Activity.class);
                intent.putExtra("name","张三");
                intent.putExtra("age",13);

                startActivityForResult(intent,1);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode,int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0 && resultCode == 0) {
            String str = data.getStringExtra("result");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();

        }
        if (requestCode == 1 && resultCode == 1) {
            String str = data.getStringExtra("result");
            Toast.makeText(this, str, Toast.LENGTH_LONG).show();
        }
    }
}



