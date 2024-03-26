public class ExerciciosArrays {

    public int[][] exercicio1a (){
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

    public int[][] exercicio1d(){
        int[][] array = new int[9][6];

        for(int i = 0; i < 6; i++){
            for(int x = 0; x < 9; x++){
                if (x == 0 || x == 2 || x == 4 || x == 6 || x == 8){
                    array[x][i] = -1;
                }else {
                    array[x][i] = 0;
                }
            }
        }

        return array;
    }

}
