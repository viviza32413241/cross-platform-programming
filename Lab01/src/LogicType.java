public class LogicType {
    public static void main(String[] args){
        boolean [][] resultArray = new boolean[4][4];

        boolean b1 = true;
        boolean b2 = false;

        for (int i = 0; i<4; i++){
            for (int j = 0; j<4; j++){
                if (i == 0){
                    resultArray [i][j] = b1 && b2; //AND
                }
                else if (i == 1){
                    resultArray[i][j] = b1 || b2; //OR
                }
                else if (i == 2){
                    resultArray[i][j] = b1 ^ b2; //XOR
                }
                else{
                    resultArray[i][j] = !b1; //NOT
                }
            System.out.println("Результат для [" + i + "][" + j + "] - " + resultArray[i][j]);
            }
        }
    }
}
