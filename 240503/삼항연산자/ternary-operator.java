import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a,b; 
        a = sc.nextInt(); 

        b = a<100 ? 1 : 0;
        
        if(b == 0){
        System.out.println("pass");
        }
        else
        {
            System.out.println("failure");
        } 

    }
}