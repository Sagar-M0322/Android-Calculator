package com.example.calc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText opr1;
    private EditText opr2;
    private Button btnadd,btnsub,btnmul,btndiv,btnclr;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        opr1 =findViewById(R.id.ed1);
        opr2 =findViewById(R.id.ed2);
        btnadd = findViewById(R.id.btad);
        btnsub=findViewById(R.id.btsub);
        btnmul=findViewById(R.id.btmul);
        btndiv=findViewById(R.id.btdiv);
        btnclr=findViewById(R.id.btclear);
        txtresult=findViewById(R.id.result);


        btnadd.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result= oper1 +oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "enter required number", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result= oper1 -oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "enter required number", Toast.LENGTH_SHORT).show();
                }

            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result= oper1 *oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "enter required number", Toast.LENGTH_SHORT).show();
                }
            }
        });



        btndiv.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if((opr1.getText().length()>0) && (opr2.getText().length()>0)){
                    double oper1 = Double.parseDouble(opr1.getText().toString());
                    double oper2 = Double.parseDouble(opr2.getText().toString());
                    double result= oper1 / oper2;
                    txtresult.setText(Double.toString(result));
                }
                else{
                    Toast.makeText(MainActivity.this, "enter required number", Toast.LENGTH_SHORT).show();
                }

            }
        });



        btnclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                opr1.setText("");
                opr2.setText("");
                txtresult.setText("");
                opr1.requestFocus();
            }
        });
    }
}