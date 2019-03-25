package com.example.notbad;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    static String solution;
    Button num1;
    Button num2;
    Button num3;
    Button num4;
    Button num5;
    Button num6;
    Button num7;
    Button num8;
    Button num9;
    Button num0;
    Button plus;
    Button divide;
    Button equal;
    Button multiplication;
    Button subtraction;
    Button dot;
    Button history;
    Button back;
    Button clean;
    Button route;
    TextView input;
    String answer;
    TextView historyTextView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calculator);
        route = (Button) findViewById(R.id.vroute);
        route.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this,HCalculator.class);
                startActivity(intent);
            }
        });

        history = (Button) findViewById(R.id.vhistory);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calculator.this,History.class);
                startActivity(intent);
            }
        });

        input = (TextView) findViewById(R.id.vinput);
        num0 = (Button) findViewById(R.id.vnum0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"0";
                input.setText(input.getText() + "0");
            }
        });
        num1 = (Button) findViewById(R.id.vnum1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"1";
                input.setText(input.getText() + "1");
            }
        });
        num2 = (Button) findViewById(R.id.vnum2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"2";
                input.setText(input.getText() + "2");
            }
        });
        num3 = (Button) findViewById(R.id.vnum3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"3";
                input.setText(input.getText() + "3");
            }
        });
        num4 = (Button) findViewById(R.id.vnum4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"4";
                input.setText(input.getText() + "4");
            }
        });
        num5 = (Button) findViewById(R.id.vnum5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"5";
                input.setText(input.getText() + "5");
            }
        });
        num6 = (Button) findViewById(R.id.vnum6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"6";
                input.setText(input.getText() + "6");
            }
        });
        num7 = (Button) findViewById(R.id.vnum7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"7";
                input.setText(input.getText() + "7");
            }
        });
        num8 = (Button) findViewById(R.id.vnum8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"8";
                input.setText(input.getText() + "8");
            }
        });
        num9 = (Button) findViewById(R.id.vnum9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+"9";
                input.setText(input.getText() + "9");
            }
        });
        plus = (Button) findViewById(R.id.vpuls);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+ " +";
                input.setText(input.getText() + "+");
            }
        });
        subtraction = (Button) findViewById(R.id.vsubtraction);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+ " -";
                input.setText(input.getText() + "-");
            }
        });
        multiplication = (Button) findViewById(R.id.vmultiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+" *";
                input.setText(input.getText() + "*");
            }
        });
        divide = (Button) findViewById(R.id.vdivide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+" /";
                input.setText(input.getText() + "/");
            }
        });
        dot = (Button) findViewById(R.id.vdot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                solution = solution+".";
                input.setText(input.getText() + ".");
            }
        });


        clean = (Button) findViewById(R.id.vclean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input.getText() + "";
                if(s.length() == 0){
                    return;
                }
                else{
                    input.setText("");
                }
            }
        });

        equal = (Button) findViewById(R.id.vequal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                historyTextView = (TextView) findViewById(R.id.histroyText);
               historyTextView.append(input.getText() + "\n");

            }
        });
        back = (Button) findViewById(R.id.vback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                answer = (String) input.getText();
                if(answer.length() == 0){
                    return;
                }
                answer = answer.substring(0,answer.length()-1);
                input.setText(answer);
            }
        });
    }
}
