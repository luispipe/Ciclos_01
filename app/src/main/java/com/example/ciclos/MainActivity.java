package com.example.ciclos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText inicio,fin;
    private Button start;
    private TextView visualizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicio= findViewById(R.id.etMin);
        fin= findViewById(R.id.etMax);
        start= findViewById(R.id.btnCount);
        visualizar=findViewById(R.id.tvCount);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Capturo el texto sin formato de los editText y lo convierto a String
                String minTx= inicio.getText().toString();
                String maxtTx= fin.getText().toString();
                //Convierto los String en números por medio del metodo parse
                int min= Integer.parseInt(minTx);
                int max= Integer.parseInt(maxtTx);
                random(min,max);
            }
        });

        String texto= "Bienvenidos al curso de desarrollo de aplicaciones" +
                "moviles del programa Atenea";
        //hagan una función que me diga cuantas veces se repite la letra 'a'
        int count=0;
        int count2=0;
        for (int i=0;i<texto.length();i++){
            if(texto.charAt(i)=='a'){
                count++;
            }
            System.out.println("i="+i+" letra="+texto.charAt(i)+" count="+count);

            if (texto.toLowerCase().charAt(i)=='a'){
                count2++;
            }
            System.out.println("i="+i+" letra="+texto.charAt(i)+" count="+count2);
        }

        /* Iter 1--> i=0  if(B==a) count=0
        *  Iter 2--> i=1  if(i==a) count=0
        *  ...
        *  Iter 13--> i=12 if(a==a) count=1;
        * */




    }

    public void random(int min, int max){
        int aleatorio2= ((int)(Math.random()*(max-min+1)))+min;
        visualizar.setText(aleatorio2+"");
    }




}