package com.example.notbad;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class History extends AppCompatActivity{

    TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.history);
        StringBuffer buf = new StringBuffer();
        try {
            InputStream in = openFileInput("History.txt");
            if (in != null) {
                InputStreamReader tmp = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(tmp);
                String str;
                while ((str = reader.readLine()) != null) {
                    buf.append(str + "\n");
                }
                in.close();
            }
        } catch (java.io.FileNotFoundException e) {}
          catch (Throwable t) {}
        textView = findViewById(R.id.histroyText);
        textView.setText(buf);





    }

}
