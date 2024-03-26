public class Main {

    public static void main(String[] args){
        ExerciciosArrays exerciciosArrays = new ExerciciosArrays();

        int[][] array = exerciciosArrays.exercicio1a();

        System.out.println("//// Exercicio 1A");
        for(int i = 0; i < 3;i++ ){
            for (int x = 0;x < 10; x++ ){
                System.out.print(array[i][x]);
            }
            System.out.println();
        }

    }


}
