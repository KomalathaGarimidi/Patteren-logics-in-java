import java.util.Scanner;

public class TrainglePattern {
    public static void triangle(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows you need to print");
        int rows=sc.nextInt();
        TrainglePattern.triangle(rows);//call to the square method
    }

}
