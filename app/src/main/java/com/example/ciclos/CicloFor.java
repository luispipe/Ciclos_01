package com.example.ciclos;

public class CicloFor {

    /*
     * Un ciclo es una estructura que nos permite iterar
     * o repetir una acción 1 o más veces de acuerdo a una
     * condición
     *
     * */

        /* Estructura ciclo FOR
           1. Palabra reservada for, seguido de parentesis
           2. Dentro del parentesis se define la variable iteradora
              tipo de dato --> el 80%  de las veces int
              nombre --> el 100%  de las veces es i
              valor --> dependiendo del enunciado se indica el valor por lo general
              se inicia desde el primer elemento o el último
           3. Dentro del parentesis se define la condición de cierre el ciclo y por lo general
              usamos los operadores lógicos >,<,,>=,<=,=,!=,||,&&



           4. Dentro del parentesis se define la actualización del ciclo
           5. Se cierra parentesis y se abren llaves donde se colocora la lógica
           Nota: los 3 elementos del for se separan por ;

           EJ: Sumatoria de un número
               £ 5 --> 5+4+3+2+1
               £ n --> n+n-1+n-2+...1

          ++ --> +1
          -- --> -1
          += --> var +=4 --> var= var +4
          -= --> var -=4 --> var= var -4

           int count=0;
           for(int i=1;i<=n;i++){
              count=count+i;
             //count+=i;
           }
           Iter 1 --> i=1  count=1
           Iter 2 --> i=2  count=3
           Iter 3 --> i=3  count=6
           Iter 4 --> i=4  count=10
           Iter 5 --> i=5  count=15
           Iter 6 --> i=6  Rompe el ciclo porque no se cumple la condición

           count=15


           int count=0;
           for(int i=n;i>=1;i--){
              count=count+i;
             //count+=i;
           }
           Iter 1 --> i=5  count=5
           Iter 2 --> i=4  count=9
           Iter 3 --> i=3  count=12
           Iter 4 --> i=2  count=14
           Iter 5 --> i=1  count=15
           Iter 6 --> i=0  Rompe el ciclo porque no se cumple la condición

           count=15
        * */
      /*  int n=100;
        int count=0;
        for(int i=n;i>=1;i--){
            count=count+i;
            System.out.println("i="+i+" Sumatoria="+count);
            //count+=i;
        }

        count=0;
        for(int i=1;i<=n;i++){
            count=count+i;
            System.out.println("i="+i+" Sumatoria="+count);
            //count+=i;
        }

        for (int i=1;i<=100;i++){
            System.out.println(i);
        }

        //Ciclo números Aleatorios
         for (int i=1;i<=10;i++){
            //Math.random() genera aleatorios entre 0 y 1
            double aleatorio=Math.random();
            int min=1;
            int max=5;
            //Math.random()*max genera aleatorios desde 0 hasta <max
            int aleatorio1= (int)(Math.random()*max);
            // (Math.random()*(max-min+1))+min  permite tomar aleatorio de cualquier rango incluyendo los limites
            int aleatorio2= ((int)(Math.random()*(max-min+1)))+min;
            System.out.println(aleatorio);
            System.out.println(aleatorio1);
            System.out.println(aleatorio2);



        }

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
