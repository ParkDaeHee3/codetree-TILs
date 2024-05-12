import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n; 

        n = sc.nextInt();
       
        for(int i=n; n>100 ; i*=2 ){
          
            System.out.print(n+" "+n+" "+n+" "+n+" "+n);
           
            
        }

    }
}