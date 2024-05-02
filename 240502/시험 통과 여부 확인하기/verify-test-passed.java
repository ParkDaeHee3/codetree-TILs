import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in); 

        int a,score; 
        a = sc.nextInt(); 
        score = (80 - a); 
        if(a>=80){
        System.out.println("pass"); 
        }
        else
        {
            System.out.println(score+" "+"more score");
        }
    }
}