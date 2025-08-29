package com.example.calculadora;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText textito1, textito2;
    Button botoncitos,botoncitor,botoncitom,botoncitod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        textito1 = findViewById(R.id.texto1);
        textito2 = findViewById(R.id.texto2);

        botoncitos = findViewById(R.id.bots);
        botoncitos.setOnClickListener(this);

        botoncitor = findViewById(R.id.botr);
        botoncitor.setOnClickListener(this);

        botoncitom = findViewById(R.id.botm);
        botoncitom.setOnClickListener(this);

        botoncitod = findViewById(R.id.botd);
        botoncitod.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) //un view es un objeto cualquiera
    {
        String cadenita = ((Button)v).getText().toString();
        Clasesita objetito = new Clasesita();
        objetito.setDatito1(Integer.parseInt(textito1.getText().toString()));
        objetito.setDatito2(Integer.parseInt(textito2.getText().toString()));
        if(cadenita.equals("+"))
            Toast.makeText(this, "la suma es: " + objetito.sumita(), Toast.LENGTH_SHORT).show();
        if(cadenita.equals("-"))
            Toast.makeText(this, "la resta es: " + objetito.restita(),
                    Toast.LENGTH_SHORT).show();
        if(cadenita.equals("*"))
            Toast.makeText(this, "la multi es: " + objetito.multiplicadita(), Toast.LENGTH_SHORT).show();
        if(cadenita.equals("/"))
            Toast.makeText(this, "La division es: " + objetito.divisioncita(), Toast.LENGTH_SHORT).show();

    }
}