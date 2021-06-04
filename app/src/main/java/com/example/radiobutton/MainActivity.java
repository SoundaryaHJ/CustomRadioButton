package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button apply;
    TextView selected;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup= findViewById(R.id.radioGroup);
        selected=(TextView) findViewById(R.id.selected);
        apply= findViewById(R.id.apply);

        apply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton= findViewById(radioId);

                selected.setText("Your choice:" + radioButton.getText());

            }
        });
    }
    public void checkButton(View v)
    {
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton= findViewById(radioId);
        Toast.makeText(this, "Selected Radio Button:"+ radioButton.getText(), Toast.LENGTH_SHORT).show();
    }
}