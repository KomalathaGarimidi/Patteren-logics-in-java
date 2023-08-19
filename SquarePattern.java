import java.util.Scanner;

public class SquarePattern {
    public static void square(int rows,int cols){
        for(int i=0;i<rows;i++){//outer loop for rows
            for(int j=0;j<cols;j++){// Inner loop for cols
                System.out.print("* ");// to print the star
            }
            System.out.println(); // to get a new line after completing the inner loop every time
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//To accept the input from the user
        System.out.println("Enter the no of rows you need to print");
        int rows=sc.nextInt();
        System.out.println("Enter the no of columns you want to print");
        int cols=sc.nextInt();
        SquarePattern.square(rows,cols);//call to the square method
    }
}
