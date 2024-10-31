import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); 

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c; 

        a+=8; 
        System.out.printf(a+"\n");

        b*=3; 
        System.out.printf(b+"\n");

        System.out.printf("%d",a*b);


    }
}