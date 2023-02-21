public class Main {

        public static int[] countPositivesSumNegatives(int[] input) {

            float contadorprom =0;
            int contadorpares=0;
            int contadorsumimp=0;

            for (int i=0; i < input.length; i++){
               int promedio =  input[i];
                int resultado1 = input[i];
                int suma = 0;


                 if(input[i] %2 == 0){
                   contadorpares = input.length;

                } else {
                     suma += input[i];
                     contadorsumimp = suma;
                }

                contadorprom = promedio / input.length;
                //entra un arreglo de enteros y retorna en la primera posicion el promedio de todo el arreglo
                //la segunda,  posicion de contador de numeros pares
                //tercero suma de numeros impares

            }


            return new int[] {(int) contadorprom, contadorpares, contadorsumimp};
        }
    }