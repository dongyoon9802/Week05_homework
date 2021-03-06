package com.example.week05_homework;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private Double num;
    private Character mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("탁상용 계산기");

        text = findViewById(R.id.txt_input);
    }
    public void OnClick(View view){
        String output = text.getText().toString();
        switch (view.getId()){
            case R.id.btn_num0:
                text.setText(output+'0');
                break;
            case R.id.btn_num1:
                text.setText(output+'1');
                break;
            case R.id.btn_num2:
                text.setText(output+'2');
                break;
            case R.id.btn_num3:
                text.setText(output+'3');
                break;
            case R.id.btn_num4:
                text.setText(output+'4');
                break;
            case R.id.btn_num5:
                text.setText(output+'5');
                break;
            case R.id.btn_num6:
                text.setText(output+'6');
                break;
            case R.id.btn_num7:
                text.setText(output+'7');
                break;
            case R.id.btn_num8:
                text.setText(output+'8');
                break;
            case R.id.btn_num9:
                text.setText(output+'0');
                break;
            case R.id.btn_plus:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 먼저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                num = Double.parseDouble(output);
                mark = '+';
                text.setText("");
                break;
            case R.id.btn_minus:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 먼저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                num = Double.parseDouble(output);
                mark = '-';
                text.setText("");
                break;
            case R.id.btn_mul:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 먼저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                num = Double.parseDouble(output);
                mark = '*';
                text.setText("");
                break;
            case R.id.btn_div:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 먼저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                num = Double.parseDouble(output);
                mark = '/';
                text.setText("");
                break;
            case R.id.btn_dot:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 먼저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                text.setText(output+'.');
                break;
            case R.id.btn_c:
                num = 0.0;
                text.setText("");
                break;
            case R.id.btn_ok:
                if(text.getText().toString().length()<=0){
                    Toast.makeText(getApplicationContext(),"숫자를 마저 입력하시오",Toast.LENGTH_SHORT).show();
                    break;
                }
                if(mark=='*'){
                    num = num*Double.parseDouble(output);
                }
                else if(mark=='+'){
                    num = num+Double.parseDouble(output);
                }
                else if(mark=='-'){
                    num = num-Double.parseDouble(output);
                }
                else if(mark=='/'){
                    num = num/Double.parseDouble(output);
                }

                text.setText(num.toString());
                num=0.0;
                break;
        }
    }
}