package com.example.notbad;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.EmptyStackException;
import java.util.Stack;


public class Calculator extends AppCompatActivity {

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
    String solution = "";

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
                if(solution.length() == 0){ return; }
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(".")){ return; }
                if(temp.equals("+")){ return; }
                if(temp.equals("-")){ return; }
                if(temp.equals("*")){ return; }
                if(temp.equals("/")){ return; }
                else{
                    solution = solution+"+";
                    input.setText(input.getText() + " + ");
                }
            }
        });
        subtraction = (Button) findViewById(R.id.vsubtraction);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution.length() == 0){ return; }
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(".")){ return; }
                if(temp.equals("+")){ return; }
                if(temp.equals("-")){ return; }
                if(temp.equals("*")){ return; }
                if(temp.equals("/")){ return; }
                else{
                    solution = solution+"-";
                    input.setText(input.getText() + " - ");
                }
            }
        });
        multiplication = (Button) findViewById(R.id.vmultiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution.length() == 0){ return; }
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(".")){ return; }
                if(temp.equals("+")){ return; }
                if(temp.equals("-")){ return; }
                if(temp.equals("*")){ return; }
                if(temp.equals("/")){ return; }
                else{
                    solution = solution+"*";
                    input.setText(input.getText() + " * ");
                }
            }
        });
        divide = (Button) findViewById(R.id.vdivide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution.length() == 0){ return; }
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(".")){ return; }
                if(temp.equals("+")){ return; }
                if(temp.equals("-")){ return; }
                if(temp.equals("*")){ return; }
                if(temp.equals("/")){ return; }
                else{
                    solution = solution+"/";
                    input.setText(input.getText() + " / ");
                }
            }
        });
        dot = (Button) findViewById(R.id.vdot);
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(solution.length() == 0){ return; }
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(".")){ return; }
                if(temp.equals("+")){ return; }
                if(temp.equals("-")){ return; }
                if(temp.equals("*")){ return; }
                if(temp.equals("/")){ return; }
                else{
                    solution = solution+".";
                    input.setText(input.getText() + " . ");
                }
            }
        });


        clean = (Button) findViewById(R.id.vclean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input.getText() + "";
                if(s.length() == 0){
                    solution = "";
                    return;
                }
                else{
                    solution = "";
                    input.setText("");
                }
            }
        });

        equal = (Button) findViewById(R.id.vequal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                input.setText(answer(solution) + "");
                solution = answer(solution)+"";
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
                solution = solution.substring(0,solution.length()-1);
                input.setText(answer);
            }
        });
    }

    public double answer(String input){
        if(input.length() <1) return -0.0000000000123456789;
        double answer = 0;
        input = infixToPostfix(input);
        String[] temp = input.split(" ");
        Stack<Double> number = new Stack<>();
        for(int i = 0; i < temp.length; i++){
            if(isNumber(temp[i])){
                double positive = Double.parseDouble(temp[i]);
                number.push(positive);
            }
            else if(temp[i].equals("_#")){
                number.push(-Math.PI);
            }

            else if(temp[i].equals("#")){
                number.push(Math.PI);
            }

            else if(temp[i].contains("S")){
                double value = 0;
                if(temp[i].contains("#")){
                    if(temp[i].contains("_")){
                        value = - Math.PI;
                    }
                    else {
                        value = Math.PI;
                    }
                }
                else value = Double.parseDouble(temp[i].substring(1));
                value = Math.sin(value);
                number.push(value);
            }

            else if(temp[i].contains("C")){
                double value = 0;
                if(temp[i].contains("#")){
                    if(temp[i].contains("_")){
                        value = - Math.PI;
                    }
                    else {
                        value = Math.PI;
                    }
                }
                else value = Double.parseDouble(temp[i].substring(1));
                value = Math.cos(value);
                number.push(value);
            }

            else if(temp[i].contains("T")){
                double value = 0;
                if(temp[i].contains("#")){
                    if(temp[i].contains("_")){
                        value = - Math.PI;
                    }
                    else {
                        value = Math.PI;
                    }
                }
                else value = Double.parseDouble(temp[i].substring(1));
                value = Math.tan(value);
                number.push(value);
            }

            else if(temp[i].contains("!")){
                String str = temp[i];
                str = str.substring(0, str.length() - 1);
                int value = Integer.parseInt(str);
                for(int j = value-1; j > 0; j--){
                    value = value * (value-j);
                }
                number.push((double)value);
                answer = value;
            }

            else if(temp[i].contains("_")){
                double negative = - Double.parseDouble(temp[i].substring(1));
                number.push(negative);
            }

            else if(checkOperator(temp[i]) != -1 && !number.isEmpty()){
                try {
                    double second = number.pop();
                    double first = number.pop();
                    if(temp[i].equals("+")){
                        answer = first + second;
                        number.push(answer);
                    }
                    if(temp[i].equals("-")){
                        answer = first - second;
                        number.push(answer);
                    }
                    if(temp[i].equals("*")){
                        answer = first * second;
                        number.push(answer);
                    }
                    if(temp[i].equals("/")){
                        answer = first / second;
                        number.push(answer);
                    }
                    if(temp[i].equals("^")){
                        answer = first;
                        double tempValue = first;
                        for(int j = 0; j < Math.abs(second)-1; j++){
                            answer = answer * tempValue;
                        }
                        if(second < 0){
                            answer = 1 / answer;
                        }
                        number.push(answer);
                    }
                }catch (EmptyStackException e){
                    return -0.0000000000123456789;
                }
                catch (Exception e){}
            }
        }
        return answer;
    }

    public String infixToPostfix(String input) {
        String result = "";
        Stack<String> stack = new Stack<>();
        String[] temp = input.split("");

        for (int i = 0; i<temp.length; i++) {
            String c = temp[i];
            //_ = negative, # - pi
            if (isNumber(c) || isDot(c) || c.equals("_") || c.equals("#") || c.equals("C") || c.equals("S") || c.equals("T") || c.equals("!")){
                result = result + c;
            }

            else if (c.equals("(")){
                stack.push(c);
                result = result + " ";
            }

            else if (c.equals(")")) {
                result = result + " ";
                while (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals(")")){
                    result = result + stack.pop();
                }
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }

            else {
                result = result + " ";
                while (!stack.isEmpty() && checkOperator(c) <= checkOperator(stack.peek())){
                    result = result + stack.pop() + " ";
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){
            result = result + " " + stack.pop();
        }

        return result;
    }

    public boolean isNumber(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }

    public boolean isDot(String s){
        if(s.equals(".")) return true;
        else return false;
    }

    public int checkOperator(String s) {
        switch (s) {
            case "+":
                return 1;
            case "-":
                return 1;
            case "*":
                return 2;
            case "/":
                return 2;
            case  "^":
                return 3;
        }
        return -1;
    }



}
