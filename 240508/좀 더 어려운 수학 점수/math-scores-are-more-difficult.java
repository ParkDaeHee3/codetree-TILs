import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int stAm,stAe,stBm,stBe; 
        stAm = sc.nextInt();
        stAe = sc.nextInt();
        stBm = sc.nextInt();
        stBe = sc.nextInt();
        
        if(stAm>stBm ){
            System.out.println("A");
        }
        else if((stAm==stBm)&&stAe>stBe){
            System.out.println("A");
        }
        else{
            System.out.println("B");
        }
        
}
}