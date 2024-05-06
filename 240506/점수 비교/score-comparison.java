import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int m1,m2,e1,e2;
        m1 = sc.nextInt();
        e1 = sc.nextInt();
        m2  = sc.nextInt();
        e2 = sc.nextInt(); 
        
        if(m1>m2 && e1>e2){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }
}