import java.util.Random;

public class Main {

    public static void main(String[] args) {
    }

    /*
    Problem: Write a function that takes as input a two dimensional array and returns the greatest hourglass shaped sum from that array.
     */
    static int hourglassSum(int[][] arr) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                int tempSum = (arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);

                if (tempSum > maxSum){maxSum = tempSum;}
            }
        }
        return maxSum;
    }

}
