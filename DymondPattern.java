import java.util.Scanner;

public class DymondPattern {
    public static void dymond(int rows){
        for(int i=0;i<rows;i++){
            for(int k=0;k<rows-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<rows;i++){

            for(int k=0;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*rows-(2*i)-1);j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of you want to print");
        int rows=sc.nextInt();
        DymondPattern.dymond(rows);
    }
}
