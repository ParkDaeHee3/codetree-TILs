import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a,b,odd,even; 

        a = sc.nextInt();
        b = sc.nextInt();
        odd = a*2;
        even = a+3;
        
        
        for( int i = 1; i<=b; i++){
            if(i%2==0 && a<=b){
                System.out.print(a+" ");
                a+=3;
            }
            else if(i%2==1 && a<=b){
                System.out.print(a+" ");
                a*=2;
            }
        
        }
        
      
        

    }
}