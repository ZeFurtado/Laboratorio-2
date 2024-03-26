public class ExerciciosArrays {

    public int[][] exercicio1a (){
        int index = 0;
        int valor = 0;
        int[][] array = new int[3][10];

        do{
            array[index][0] = valor;
            index++;
            valor++;
        }while(index <= array.length);

        return array;

    }

}
