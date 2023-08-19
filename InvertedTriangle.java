import java.util.Scanner;

public class InvertedTriangle {
    public static void invertedTrianglePatteren(int rows){
        for(int i=0;i<rows;i++){
            for(int j=i;j<rows;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of you want to print");
        int rows=sc.nextInt();
        InvertedTriangle.invertedTrianglePatteren(rows);

    }
}
