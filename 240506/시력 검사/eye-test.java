import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); 

        double a,b; 
        a = sc.nextDouble();
        b = sc.nextDouble(); 

        if(a>=1.0 && b>=1.0){
            System.out.println("High");
        }
         if(a<1.0 && a>=0.5 && b<1.0 && b>=0.5){
            System.out.println("middle");
        }
         if(a<0.5&& b<0.5) {
            System.out.println("Low");
        }
        


    }
}