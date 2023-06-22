package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView welcome_text , result_text;
    Button btn;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate() is called" , Toast.LENGTH_LONG).show();
        welcome_text = findViewById(R.id.welcome_textView);
        result_text = findViewById(R.id.result_textView);
        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.editText);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double kilos_entered = Double.parseDouble(editText.getText().toString());
                result_text.setText(""+convertToPounds(kilos_entered));
            }
        });
    }

    @Override
    protected  void onStart(){
        super.onStart();
        Toast.makeText(this,"onStart() is called" , Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"onResume() is called" , Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        Toast.makeText(this,"onRestart() is called" , Toast.LENGTH_LONG);
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Toast.makeText(this,"onPause() is called" , Toast.LENGTH_LONG);
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Toast.makeText(this,"onStop() is called" , Toast.LENGTH_LONG);
    }

    public double convertToPounds(double kilos){
        double pound_result = kilos * 2.20462;
        return pound_result;
    }
}