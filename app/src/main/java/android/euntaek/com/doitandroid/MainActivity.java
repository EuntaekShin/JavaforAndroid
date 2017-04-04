package android.euntaek.com.doitandroid;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView txt02;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText);
        txt02 = (TextView) findViewById(R.id.txt02);
        button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  Toast.makeText(getApplicationContext(),"랄랄랄",Toast.LENGTH_LONG).show();
                String value01= editText.getText().toString();
                String value02 =editText2.getText().toString();


                int input01 = Integer.parseInt(value01);
                int input02 = Integer.parseInt(value02);
                int sum = input01 + input02;

               final int value04 = 100; //상수
                sum = sum+value04;


                txt02.setText(String.valueOf(sum));

            }
        });
    }


    }

