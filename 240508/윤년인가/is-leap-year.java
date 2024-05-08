import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in); 

        int y; 
        y = sc.nextInt();

        if(4%y==0){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        if(100%y==0&&400%y==1){
            System.out.println("false");
        }
      
    }
}