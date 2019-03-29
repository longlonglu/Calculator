package com.example.notbad;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class History extends AppCompatActivity{

    TextView textView;
    File tempFile;
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


//        File cDir = getBaseContext().getCacheDir();
//        tempFile = new File(cDir.getPath() + "/" + "History.txt") ;
//        String strLine="";
//        StringBuilder text = new StringBuilder();
//        try {
//            FileReader fReader = new FileReader(tempFile);
//            BufferedReader bReader = new BufferedReader(fReader);
//            while( (strLine=bReader.readLine()) != null  ){
//                text.append(strLine+"\n");
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }catch(IOException e){
//            e.printStackTrace();
//        }

        textView = findViewById(R.id.histroyText);
        textView.setText(buf);





    }

}
