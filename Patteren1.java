import java.util.Scanner;

public class Patteren1 {
    public static void numberpattern(int rows){
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows you need to print");
        int rows=sc.nextInt();
        Patteren1.numberpattern(rows);//call to the square method
    }
}
