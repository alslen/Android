package com.example.project4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 맴버 변수(MainActivity 클래스의)
//    EditText edit1,edit2;
//    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
//    String num1, num2;
//    Float result;
//    TextView textResult;

    String num1, num2;
    Float result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        // 지역변수(onCreate 메소드의)
        // 1. 바인딩

       EditText edit1 = findViewById(R.id.Edit1);
       EditText edit2 = findViewById(R.id.Edit2);

        Button btnAdd = findViewById(R.id.BtnAdd);
        Button btnSub = findViewById(R.id.BtnSub);
        Button btnMul = findViewById(R.id.BtnMul);
        Button btnDiv = findViewById(R.id.BtnDiv);
        Button btnMod = findViewById(R.id.BtnMod);

        TextView textResult = findViewById(R.id.TextResult);



        // 2. 이벤트 처리 : 버튼들에 대해서

//        btnAdd.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) + Integer.parseInt(num2);
//                textResult.setText("계산 결과 : "+result.toString());
//
//                return false;
//            }
//        });
//
//        btnSub.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) - Integer.parseInt(num2);
//                textResult.setText("계산 결과 : "+result.toString());
//
//                return false;
//            }
//        });
//
//        btnMul.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) * Integer.parseInt(num2);
//                textResult.setText("계산 결과 : "+result.toString());
//
//                return false;
//            }
//        });
//
//        btnDiv.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View view, MotionEvent motionEvent) {
//                num1 = edit1.getText().toString();
//                num2 = edit2.getText().toString();
//                result = Integer.parseInt(num1) / Integer.parseInt(num2);
//                textResult.setText("계산 결과 : "+result.toString());
//
//                return false;
//            }
//        });

        // 클릭 이벤트를 이용했음
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
//                if(num1.isEmpty() || num2.isEmpty()){
//                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
//                }
                if(num1.equals("") || num2.equals("")) {
                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) + Float.parseFloat(num2);
                    //textResult.setText("계산 결과 : "+result.toString());
                    //textResult.setText("계산 결과 : "+result);
                    textResult.setText(String.valueOf(result));
                }

            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) - Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) * Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();
                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    if(num2.equals("0")) {
                    //if(Float.parseFloat(num2) == 0){
                        Toast.makeText(MainActivity.this, "0으로 나눌 수 없습니다", Toast.LENGTH_SHORT).show();
                    } else {
                        result = Float.parseFloat(num1) / Float.parseFloat(num2);
                         result = (int)(result*100)/100.0f;

                        textResult.setText("계산 결과 : "+result.toString());
                    }
                }
            }
        });
        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this,"숫자를 입력해주세요",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Float.parseFloat(num1) % Float.parseFloat(num2);
                    textResult.setText("계산 결과 : "+result.toString());
                }
            }
        });

    }
}