import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
     Scanner sc = new Scanner(System.in);

        int h1,h2; 
        h1 = sc.nextInt(); 
        String n1 = sc.next();
        h2 = sc.nextInt();
        String n2 = sc.next(); 
        
        

       if((h1>=19 && n1.equals("M")) || (h2>=19 && n2.equals("M")) ){
        System.out.println(1);
       }

       else{
       System.out.println(0);
       }
       sc.close();
    }
}