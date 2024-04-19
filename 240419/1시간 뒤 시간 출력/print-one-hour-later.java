import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
         sc.useDelimiter(":"); //() 소괄호 안에 특정 문자를 입력해서 '':' 기준으로 잘라서 입력 받겠다는 뜻
        
        int h = sc.nextInt();
        int m = sc.nextInt(); 

        System.out.println(h+1+":"+m);
        

        
    }
}