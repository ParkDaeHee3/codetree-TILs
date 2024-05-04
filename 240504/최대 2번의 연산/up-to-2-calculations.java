import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a,even,b;
        a = sc.nextInt(); 
        
        even = a%2;
        b = a/2;
        
        if(b!=0){
            System.out.println((b+1)/2);
        }
     


    }
}