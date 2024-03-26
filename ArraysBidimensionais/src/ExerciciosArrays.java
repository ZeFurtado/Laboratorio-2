public class ExerciciosArrays {

    public int[][] exercicio1a (){
        int index = 0;
        int valor;
        int[][] array = new int[3][10];

        for(int i =0; i < 3; i++){
            valor = 0;
            for(int x = 0; x < 10; x++){
                array[i][x] = valor;
                valor++;
            }
        }

        return array;

    }

}
