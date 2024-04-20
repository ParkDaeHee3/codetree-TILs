import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
         
        int length = sc.nextInt();
        int width = sc.nextInt();

        length = length + 8; // 위에서 length와 width의 변수를 먼저 선언 해주지 않으면 
        width = width *3;  // 오류가 발생한다. 
      

        System.out.println(length); 
        System.out.println(width); 
        System.out.println(length*width); 
        
    }
}