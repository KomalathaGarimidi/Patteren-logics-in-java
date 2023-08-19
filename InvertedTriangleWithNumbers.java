import java.util.Scanner;

public class InvertedTriangleWithNumbers {
    public static void NUmberPattern(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of you want to print");
        int rows=sc.nextInt();
        InvertedTriangleWithNumbers.NUmberPattern(rows);
    }
}
