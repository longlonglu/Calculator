package com.example.notbad;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.EmptyStackException;
import java.util.Stack;
//factorial

public class Calculator extends Fragment {
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
    Button sin;
    Button cos;
    Button tan;
    Button factorial;
    Button power;
    Button negative;
    Button pi;
    Button left;
    Button right;
    TextView input;
    String answer;
    String solution = " ";

    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator,container,false);
        history = (Button) view.findViewById(R.id.vhistory);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),History.class);
                startActivity(intent);
            }
        });

        input = (TextView) view.findViewById(R.id.vinput);
        num0 = (Button) view.findViewById(R.id.vnum0);
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "0)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "0)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "0)"); }
                else {input.setText("0");}
                solution = solution + "0";
            }
        });

        num1 = (Button) view.findViewById(R.id.vnum1);
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "1)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "1)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "1)"); }
                else {input.setText(input.getText() + "1");}
                solution = solution + "1";
            }
        });

        num2 = (Button) view.findViewById(R.id.vnum2);
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "2)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "2)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "2)"); }
                else {input.setText(input.getText() + "2");}
                solution = solution+"2";
            }
        });

        num3 = (Button) view.findViewById(R.id.vnum3);
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "3)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "3)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "3)"); }
                else {input.setText(input.getText() + "3");}
                solution = solution+"3";

            }
        });

        num4 = (Button) view.findViewById(R.id.vnum4);
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "4)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "4)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "4)"); }
                else {input.setText(input.getText() + "4");}
                solution = solution+"4";
            }
        });

        num5 = (Button) view.findViewById(R.id.vnum5);
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "5)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "5)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "5)"); }
                else {input.setText(input.getText() + "5");}
                solution = solution+"5";
            }
        });

        num6 = (Button) view.findViewById(R.id.vnum6);
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "6)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "6)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "6)"); }
                else {input.setText(input.getText() + "6");}
                solution = solution+"6";
            }
        });

        num7 = (Button) view.findViewById(R.id.vnum7);
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "7)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "7)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "7)"); }
                else {input.setText(input.getText() + "7");}
                solution = solution+"7";
            }
        });

        num8 = (Button) view.findViewById(R.id.vnum8);
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "8)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "8)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "8)"); }
                else {input.setText(input.getText() + "8");}
                solution = solution+"8";
            }
        });

        num9 = (Button) view.findViewById(R.id.vnum9);
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((solution.charAt(solution.length()-1)) == 'S'){ input.setText(input.getText() + "9)"); }
                if((solution.charAt(solution.length()-1)) == 'C'){ input.setText(input.getText() + "9)"); }
                if((solution.charAt(solution.length()-1)) == 'T'){ input.setText(input.getText() + "9)"); }
                else {input.setText(input.getText() + "9");}
                solution = solution+"9";
            }
        });

        power = (Button) view.findViewById(R.id.vpower);
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("^")){ return; }
                solution = solution+"^";
                input.setText(input.getText() + "^");
            }
        });

        factorial = (Button) view.findViewById(R.id.vfactorial);
        factorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("!")){ return; }
                solution = solution+"!";
                input.setText(input.getText() + "!");
            }
        });

        negative = (Button) view.findViewById(R.id.vnegative);
        negative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("_")){ return; }
                solution = solution+"_";
                input.setText(input.getText() + "-");
            }
        });

        pi = (Button) view.findViewById(R.id.vpi);
        pi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("#")){ return; }
                solution = solution+"1*#";
                input.setText(input.getText() + "PI");
            }
        });
        sin = (Button) view.findViewById(R.id.vsin);
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("S")){ return; }
                solution = solution+"1*S";
                input.setText(input.getText() + "sin(");
            }
        });
        cos = (Button) view.findViewById(R.id.vcos);
        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("C")){ return; }
                solution = solution+"1*C";
                input.setText(input.getText() + "cos(");
            }
        });
        tan = (Button) view.findViewById(R.id.vtan);
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("T")){ return; }
                solution = solution+"1*T";
                input.setText(input.getText() + "tan(");
            }
        });
        left = (Button) view.findViewById(R.id.left);
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals("(")){ return; }
                solution = solution+"(";
                input.setText(input.getText() + "(");
            }
        });
        right = (Button) view.findViewById(R.id.vright);
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = solution.charAt(solution.length()-1) + "";
                if(temp.equals(")")){ return; }
                solution = solution+")";
                input.setText(input.getText() + ")");
            }
        });

        plus = (Button) view.findViewById(R.id.vpuls);
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
                if(temp.equals("_")){ return; }
                if(temp.equals("#")){ return; }
                if(temp.equals("^")){ return; }
                if(temp.equals("S")){ return; }
                if(temp.equals("C")){ return; }
                if(temp.equals("T")){ return; }
                else{ solution = solution+"+"; input.setText(input.getText() + " + "); }
            }
        });

        subtraction = (Button) view.findViewById(R.id.vsubtraction);
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
                if(temp.equals("_")){ return; }
                if(temp.equals("#")){ return; }
                if(temp.equals("^")){ return; }
                if(temp.equals("S")){ return; }
                if(temp.equals("C")){ return; }
                if(temp.equals("T")){ return; }
                else{ solution = solution+"-"; input.setText(input.getText() + " - "); }
            }
        });

        multiplication = (Button) view.findViewById(R.id.vmultiplication);
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
                if(temp.equals("_")){ return; }
                if(temp.equals("#")){ return; }
                if(temp.equals("^")){ return; }
                if(temp.equals("S")){ return; }
                if(temp.equals("C")){ return; }
                if(temp.equals("T")){ return; }
                else{ solution = solution+"*"; input.setText(input.getText() + " * "); }
            }
        });

        divide = (Button) view.findViewById(R.id.vdivide);
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
                if(temp.equals("_")){ return; }
                if(temp.equals("#")){ return; }
                if(temp.equals("^")){ return; }
                if(temp.equals("S")){ return; }
                if(temp.equals("C")){ return; }
                if(temp.equals("T")){ return; }
                else{ solution = solution+"/"; input.setText(input.getText() + " / "); }
            }
        });

        dot = (Button) view.findViewById(R.id.vdot);
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
                if(temp.equals("_")){ return; }
                if(temp.equals("#")){ return; }
                if(temp.equals("^")){ return; }
                if(temp.equals("S")){ return; }
                if(temp.equals("C")){ return; }
                if(temp.equals("T")){ return; }
                else{ solution = solution+"."; input.setText(input.getText() + "."); }
            }
        });

        clean = (Button) view.findViewById(R.id.vclean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = input.getText() + "";
                if(s.length() == 0){ solution = ""; return; }
                else{ solution = " "; input.setText(""); }
            }
        });

        equal = (Button) view.findViewById(R.id.vequal);
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = answer(solution) + "";
                if(answer(solution) == 0.123456789){input.setText("Invalid Input"); solution = ""; return;}

                try {
                    FileOutputStream fos =getActivity().openFileOutput("History.txt", getActivity().MODE_PRIVATE | Context.MODE_APPEND);
                    OutputStreamWriter out = new OutputStreamWriter(fos);
                    out.write(input.getText() + " = " + s +"\n");
                    out.close();
                }
                catch (Throwable t) { }
                input.setText(s);
                solution = s+"";
            }
        });

        back = (Button) view.findViewById(R.id.vback);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    answer = (String) input.getText();
                    answer = answer.substring(0,answer.length()-1);
                    solution = solution.substring(0,solution.length()-1);
                    if(solution.length() == 0){solution = " ";}
                    input.setText(answer);
                }catch (StringIndexOutOfBoundsException e){
                    return;
                }

            }
        });
        return view;
    }

    public double answer(String input){
        if(input.length() <1) return 0.123456789;
        double answer = 0.123456789;
        input = infixToPostfix(input);
        String[] temp = input.split(" ");
        Stack<Double> number = new Stack<>();
        for(int i = 0; i < temp.length; i++){
            if(isNumber(temp[i])){ double positive = Double.parseDouble(temp[i]);  number.push(positive); }
            else if(temp[i].equals("_#")){ number.push(-Math.PI); }
            else if(temp[i].equals("#")){ number.push(Math.PI); }

            else if(temp[i].contains("S")){
                try{
                    double value = 0;
                    if(temp[i].contains("#")){
                        if(temp[i].contains("_")){ value = - Math.PI; }
                        else { value = Math.PI; }
                    }
                    else value = Double.parseDouble(temp[i].substring(1));
                    value = Math.sin(value);
                    number.push(value);
                }catch (NumberFormatException e){ return 0.123456789; }
            }

            else if(temp[i].contains("C")){
                try{
                    double value = 0;
                    if(temp[i].contains("#")){
                        if(temp[i].contains("_")){value = - Math.PI; }
                        else { value = Math.PI; }
                    }
                    else value = Double.parseDouble(temp[i].substring(1));
                    value = Math.cos(value);
                    number.push(value);
                }catch (NumberFormatException e){ return 0.123456789; }
            }

            else if(temp[i].contains("T")){
                try{
                    double value = 0;
                    if(temp[i].contains("#")){
                        if(temp[i].contains("_")){ value = - Math.PI; }
                        else { value = Math.PI; }
                    }
                    else value = Double.parseDouble(temp[i].substring(1));
                    value = Math.tan(value);
                    number.push(value);
                }catch (NumberFormatException e){ return 0.123456789; }
            }

            else if(temp[i].contains("!")){
                try{
                    String str = temp[i];
                    str = str.substring(0, str.length() - 1);
                    int value = Integer.parseInt(str);
                    for(int j = value-1; j > 0; j--){ value = value * (value-j); }
                    number.push(value+0.0);
                    answer = value;
                }catch (NumberFormatException e){ return 0.123456789; }
            }

            else if(temp[i].contains("_")){
                try{
                    double negative = - Double.parseDouble(temp[i].substring(1));
                    number.push(negative);
                }catch (NumberFormatException e){ return 0.123456789; }

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
                        for(int j = 0; j < Math.abs(second)-1; j++){ answer = answer * tempValue; }
                        if(second < 0){ answer = 1 / answer; }
                        number.push(answer);
                    }
                }catch (EmptyStackException e){ return 0.123456789; }
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
            if (isNumber(c) || isDot(c) || c.equals("_") || c.equals("#") || c.equals("C") || c.equals("S") || c.equals("T") || c.equals("!")){ result = result + c; }

            else if (c.equals("(")){
                stack.push(c);
                result = result + " ";
            }

            else if (c.equals(")")) {
                result = result + " ";
                while (!stack.isEmpty() && !stack.peek().equals("(") && !stack.peek().equals(")")){ result = result + stack.pop(); }
                if(!stack.isEmpty()){ stack.pop(); }
            }

            else {
                result = result + " ";
                while (!stack.isEmpty() && checkOperator(c) <= checkOperator(stack.peek())){ result = result + stack.pop() + " "; }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()){ result = result + " " + stack.pop(); }

        return result;
    }

    public boolean isNumber(String s){
        try{
            Double.parseDouble(s);
            return true;
        }catch (NumberFormatException e){ return false; }
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
