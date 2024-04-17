import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble( );
        double b = sc.nextDouble( ); 
        double c = sc.nextDouble( );
        double numbers; 
        numbers = Math.round(a); 
        numbers = Math.round(b);
        numbers = Math.round(c);
        System.out.printf("%.3f\n",a); 
        System.out.printf("%.3f\n",b); 
        System.out.printf("%.3f\n",c); 

    }
}