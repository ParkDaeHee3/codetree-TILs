import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);

        int a,b; 

        a = sc.nextInt();
        b = sc.nextInt();
    
        
        
        for( int i = 1; i<=b; ){
            if(i%2!=0 && i<b){
                i*=2;
                System.out.print(i+" ");
            }
            else if(i%2==0 && i<b ){
                i+=3;
                System.out.print(i+" ");
            }
        
        }
        
      
        

    }
}