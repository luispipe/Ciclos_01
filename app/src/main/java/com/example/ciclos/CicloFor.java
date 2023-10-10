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




    */
}
