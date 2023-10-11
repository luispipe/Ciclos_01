package com.example.ciclos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

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
        //Defino un arreglo con 100 posiciones vacias
        int [] pares= new int[100];
        // {0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        System.out.println(Arrays.toString(pares));
        //Ciclo For para llenar un arreglo con los 100 primeros números pares
        int flag=0;
        for (int i=0;i<pares.length;i++){
            flag=flag+2;
            pares[i]=flag;
            System.out.println("i:"+i+" Flag:"+flag+" valor:"+pares[i]);
        }
        System.out.println(Arrays.toString(pares));
        flag=0;
        for (int i=pares.length-1;i>=0;i--){
            flag=flag+2;
            pares[i]=flag;
            System.out.println("i:"+i+" Flag:"+flag+" valor:"+pares[i]);
        }
        System.out.println(Arrays.toString(pares));

        System.out.println("----------------------------");

        //Defino un arreglo con 100 posiciones vacias
        int [] impares= new int[100];
        // {0,0,0,0,0,0,0,0,0,0,0,0,0,0}
        System.out.println(Arrays.toString(impares));
        //Ciclo For para llenar un arreglo con los 100 primeros números pares
        flag=-1;
        for (int i=0;i<impares.length;i++){
            flag=flag+2;
            impares[i]=flag;
            System.out.println("i:"+i+" Flag:"+flag+" valor:"+impares[i]);
        }
        System.out.println(Arrays.toString(impares));

        flag=1;
        for (int i=0;i<impares.length;i++){
            impares[i]=flag;
            System.out.println("i:"+i+" Flag:"+flag+" valor:"+impares[i]);
            flag=flag+2;
        }
        System.out.println(Arrays.toString(impares));

        //Ciclo For para llenar un arreglo con 100 valores aleatorios entre 1-5000
        int random=0;
        int max= 2000;
        int min=1;
        int [] aleatorios= new int[1000];
        for (int i=0; i<aleatorios.length;i++){
            // generar un aleatorio que incluya los dos valores limite
            random= (int)(Math.random()*(max-min+1))-min;
            aleatorios[i]=random;
            //aleatorios[i]=(int)(Math.random()*(max-min+1))-min;
            System.out.println("i:"+i+" Random:"+aleatorios[i]);
        }
        System.out.println(Arrays.toString(aleatorios));

        //Arreglos de arreglos --> Matriz
        /*
        *    |1  3  5  7  9 |
        *    |2  4  6  8  10|
        *    |1  2  3  5  7 |
        *    |10 20 30 40 50|
        *
        * [0][0]--> 1 [0][1]-->3 [0][2]-->5 [0][3]-->7 [0][4]-->9
        * [1][0]--> 2 [1][1]-->4 [1][2]-->6 [1][3]-->8 [1][4]-->10
        * [2][0]--> 1 [2][1]-->2 [2][2]-->3 [2][3]-->5 [2][4]-->7
        * [3][0]--> 10 [3][1]-->20 [3][2]-->30 [3][3]-->40 [3][4]-->50
         *
        * */
        //Matriz   --> el tamaño de la matriz es igual a multiplicar sus filas * columnas
        int [][] matrizAleatoria= new int[4][5];
        // cuando se calcula el .length de una matriz el resultado es el tamaño de filas
        random=0;
        for (int i=0;i<matrizAleatoria.length;i++){
            for (int j=0;j<matrizAleatoria[0].length;j++){
                random= (int)(Math.random()*(max-min+1))-min;
                matrizAleatoria[i][j]=random;
            }
            System.out.println(Arrays.toString(matrizAleatoria[i]));
        }
/*   i=0  j=0  [0][0]= 100;
*    i=0  j=1  [0][1]= 50;
*    i=0  j=2  [0][2]= 4;
*    i=0  j=3  [0][3]= 1522;
*    i=0  j=4  [0][4]= 369;
*   Termina ciclo de j
*     i=1  j=0  [1][0]= 60;
 *    i=1  j=1  [1][1]= 875;
 *    i=1  j=2  [1][2]= 1999;
 *    i=1  j=3  [1][3]= 3;
 *    i=1  j=4  [1][4]= 256;
 *   Termina ciclo de j
 *    i=2  j=0  [2][0]= 2;
 *    i=2  j=1  [2][1]= 970;
 *    i=2  j=2  [2][2]= 1423;
 *    i=2  j=3  [2][3]= 800;
 *    i=2  j=4  [2][4]= 1000;
 *   Termina ciclo de j
 *    i=3  j=0  [3][0]= 59;
 *    i=3  j=1  [3][1]= 1750;
 *    i=3  j=2  [3][2]= 375;
 *    i=3  j=3  [3][3]= 951;
 *    i=3  j=4  [3][4]= 5;
 *   Termina ciclo de j
 *   Termina ciclo i porque 4 no es menor que 4
 *      |100  50     4    1522  369  |
 *      |60   875    1999  3    256  |
 *      |2    970    1423  800  1000 |
 *      |59   1750   375   951   5   |
* */
        // estrutura para definir una lista
        /* 1. llamar clase Arraylist
           2. entre < > indicar el tipo de dato de la lista
        *  3. nombre de la lista
           4. instancias la lista es decir colocar = y decir que es una nueva lista
             new ArrayList<>();
        * */

        ArrayList<Integer> aleatoriosList= new ArrayList<>();
        for (int i=1;i<600;i++){
            random= (int)(Math.random()*(max-min+1))-min;
            aleatoriosList.add(random);
        }

        System.out.println(aleatoriosList.size());

        //hacer una piramide de * de un tamaño n
        /*
        *                 *
        *                ***
        *               *****
        *              *******
        *             *********
        * */
        String asterisco="*";
        for (int i=0;i<5;i++){
            String piramide="";
            //Ajustar piramide o centrar los asteriscos
            for (int j=0;j<5-i-1;j++){
                piramide+= " ";
            }
            //Agregamos asteriscos
            for (int k=0; k<2*i+1;k++){
                piramide+="*";
            }
            System.out.println(piramide);
        }






    }

    public void random(int min, int max){
        int aleatorio2= ((int)(Math.random()*(max-min+1)))+min;
        visualizar.setText(aleatorio2+"");
    }




}