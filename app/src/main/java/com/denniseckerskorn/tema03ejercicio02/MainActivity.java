package com.denniseckerskorn.tema03ejercicio02;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denniseckerskorn.tema03ejercicio02.modelos.MathUtils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etNumber = findViewById(R.id.etNumber);
        Button bCalculate = findViewById(R.id.bCalculate);
        TextView tvResult = findViewById(R.id.tvResult);

        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long result = MathUtils.factorial(Integer.parseInt(String.valueOf(etNumber.getText())));
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}