import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in); 

        int a; 
        
        a = sc.nextInt();

        if(a==2)
           {
            System.out.println("28");
        }
        else if(a==4||a==6||a==9||a==11){
            System.out.println("30");
        } 
        else{
            System.out.println("31");
        }
}
}