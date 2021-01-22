package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private CheckBox milkcheckbox,saltcheckbox,sugarcheckbox;
    private Button show;
    private TextView resultshow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        milkcheckbox = (CheckBox) findViewById(R.id.milk);
        saltcheckbox = (CheckBox) findViewById(R.id.salt);
        sugarcheckbox = (CheckBox)findViewById(R.id.sugar);

        show = (Button)findViewById(R.id.Show_Button);

        resultshow = (TextView) findViewById(R.id.text_show);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder build = new StringBuilder();

                if (milkcheckbox.isChecked())
                {
                    String value = milkcheckbox.getText().toString();

                    build.append(value + " is ordered "+"\n");
                }
                if (saltcheckbox.isChecked())
                {
                    String value = saltcheckbox.getText().toString();

                    build.append(value + " is ordered "+"\n");
                }
                if (sugarcheckbox.isChecked())
                {
                    String value = sugarcheckbox.getText().toString();

                    build.append(value + " is ordered "+"\n");
                }

                resultshow.setText(build);
            }
        });


    }
}