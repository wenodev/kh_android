public class DoubleArray {
    public static void main(String[] args) {
        //행렬타입
        int matrix[][] = new int[3][3];

        System.out.println("[result]");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                matrix[i][j] = (i*3) + (j+1);
            }
            System.out.println(
                                matrix[i][0] + " " +
                                matrix[i][1] + " " +
                                matrix[i][2]);
        }

        int tri[][] = new int[3][];
        tri[0] = new int[3];
        tri[1] = new int[2];
        tri[2] = new int[1];





    }
}
