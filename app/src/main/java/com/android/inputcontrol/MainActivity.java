package com.android.inputcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AnhXa();

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Toppings: ");
                Resources res = getResources();
                if(checkBox1.isChecked()){
                    result.append(res.getString(R.string.cbx_chocolate));
                }
                if(checkBox2.isChecked()){
                    result.append(res.getString(R.string.cbx_sprinkles));
                }
                if(checkBox3.isChecked()){
                    result.append(res.getString(R.string.cbx_nuts));
                }
                if(checkBox4.isChecked()){
                    result.append(res.getString(R.string.cbx_cherries));
                }
                if(checkBox5.isChecked()){
                    result.append(res.getString(R.string.cbx_cookie));
                }

                Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();

            }
        });
    }

    private void AnhXa() {
        checkBox1 = findViewById(R.id.cbx_chocolate);
        checkBox2 = findViewById(R.id.cbx_sprinkles);
        checkBox3 = findViewById(R.id.cbx_nuts);
        checkBox4 = findViewById(R.id.cbx_cherries);
        checkBox5 = findViewById(R.id.cbx_cookie);
        btnShow = findViewById(R.id.btn_show);
    }
}