package com.example.stream;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText edittext;
    EditText edittext2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.edittext);
        edittext2 = (EditText) findViewById(R.id.edittext2);
    }

    public void Onbutton1Clicked(View view) {
        String input = edittext.getText().toString();
        String filename = Environment.getExternalStorageDirectory().getAbsolutePath() + '/' + input;//sd카드 폴더
        Toast.makeText(this, "Filename =" + filename, Toast.LENGTH_LONG).show();

        String contents = edittext2.getText().toString();
        writeToFile(filename, contents);
    }

    public void Onbutton2Clicked(View view) {
        String input = edittext.getText().toString();
        String filename = Environment.getExternalStorageDirectory().getAbsolutePath() + '/' + input;//sd카드 폴더
        Toast.makeText(this, "Filename =" + filename, Toast.LENGTH_LONG).show();

        String contents = edittext2.getText().toString();
        readToFile(filename);


    }

    public void writeToFile(String filename, String contents) {
        File file = new File(filename);
        try {
            FileOutputStream filestream = new FileOutputStream(file);
            DataOutputStream outputStream = new DataOutputStream(filestream);
            outputStream.writeUTF(contents);

            outputStream.flush();
            outputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }//of try
    }

    public String readToFile(String filename) {
        File file = new File(filename);
        try {
            FileInputStream filestream = new FileInputStream(file);
            DataInputStream inStream = new DataInputStream(filestream);

            byte[] data = new byte[1024];
            int count = inStream.read(data, 0, 1024);

            String line = new String(data, 0, count, "UTF8");

            edittext2.setText(line);

            inStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }//of try
        return
    }
}
