import java.util.Scanner;

public class RightAngleTriangle {
    public static void rightTriangle(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows you need to print");
        int rows=sc.nextInt();
        RightAngleTriangle.rightTriangle(rows);//call to the square method
    }
}
