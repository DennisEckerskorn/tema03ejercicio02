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
        //Se establece la actividad:
        setContentView(R.layout.activity_main);

        //Enlaces de los elementos de la interfaz de usuario:
        EditText etNumber = findViewById(R.id.etNumber);
        Button bCalculate = findViewById(R.id.bCalculate);
        TextView tvResult = findViewById(R.id.tvResult);

        //Comportamiento del boton al hacer click:
        bCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Llamada al método estático de otra clase (MathUtils):
                long result = MathUtils.factorial(Integer.parseInt(String.valueOf(etNumber.getText())));
                //Muestra el resultado del calculo:
                tvResult.setText(String.valueOf(result));
            }
        });
    }
}