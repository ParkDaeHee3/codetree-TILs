import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m,f;

        m =sc.nextInt();
        f =sc.nextInt();

        if((m>=90) && (f>=90 && f<=94 )){
            System.out.println("50000");
        }
        else if(m<=89||f<=89){
            System.out.println(0);
        }
        else{
            System.out.println("100000");
        }

    }
}