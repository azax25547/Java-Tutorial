public class TwoD {
    public static void main(String[] args) {
        int twodD[][] = new int[4][];
        twodD[0] = new int[1];
        twodD[1] = new int[2];
        twodD[2] = new int[3];
        twodD[3] = new int[4];

        int i,j,k=0;
        for(i = 0; i < 4; i++){
            for(j = 0; j < i+1; j++){
                twodD[i][j] = k;
                k++;
            }
        }

        for(i = 0; i < 4; i++){
            for(j = 0; j < i+1; j++){
                System.out.print(twodD[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
