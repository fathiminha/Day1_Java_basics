/* 5)Reverse the left and right numbers like
You must use only a loop
input  9
output 4 3 2 1 5 9 8 7 6

input 13
output 6 5 4 3 2 1 7 13 12 11 10 9 8 */

import java.util.Scanner;

public class five{
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            int index = (i <= n/2) ? (n/2 -i+1) : i;

            System.out.print(index+ " ");
        }
    }
}