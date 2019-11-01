class Cal{

    int matrix[][];
    int sum = 0;

    Cal(int n1, int n2, int n3, int n4){
        matrix[0][0] = n1;
        matrix[0][1] = n2;
        matrix[1][0] = n3;
        matrix[1][1] = n4;
    }

    void setMatrix(){
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                sum += matrix[i][j];
            }
        }
    }
    int getMatrix(){
        return sum;
    }
}

public class HW8 {
    public static void main(String[] args) {
        Cal cal = new Cal(1,2,3,4);
        cal.setMatrix();
        System.out.println(cal.getMatrix());

    }
}


/*
    문제6. class를 활용하여
    2 by 2 행렬의 덧셈을 구현하시오.
 */