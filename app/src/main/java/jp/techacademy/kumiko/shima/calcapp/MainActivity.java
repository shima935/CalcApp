package jp.techacademy.kumiko.shima.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.R.attr.value;
import static jp.techacademy.kumiko.shima.calcapp.R.id.editText1;
import static jp.techacademy.kumiko.shima.calcapp.R.id.editText2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText editText1;
    EditText editText2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button1);
        button.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button.setOnClickListener(this);

        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
    }

    @Override
    public void onClick(View v){

        Intent intent = new Intent(this, SecondActivity.class);

        String value1str = editText1.getText().toString();
        String value2str = editText2.getText().toString();
        double value1 = Double.parseDouble(value1str);
        double value2 = Double.parseDouble(value2str);

        if (v.getId() == R.id.button1){
            double value = value1 + value2;
            intentResult(value);

        }else if(v.getId() == R.id.button2) {
            double value = value1 - value2;
            intentResult(value);

        }else if (v.getId()==R.id.button3){
            double value = value1 * value2;
            intentResult(value);

        }else if (v.getId() == R.id.button4) {
            double value = value1 / value2;
            intentResult(value);

        }
    }

    private void intentResult(double value) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("VALUERESULT", value);
        startActivity(intent);

    }


}
