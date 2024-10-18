import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in); 
        sc.useDelimiter("-"); //특수 문자 기준으로 입력 받기 

        int m = sc.nextInt();
        int d = sc.nextInt();
        int y = sc.nextInt(); 

        System.out.println(y+"."+m+"."+d);


    }
}