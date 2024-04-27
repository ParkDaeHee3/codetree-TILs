import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요. 

        Scanner sc = new Scanner(System.in); 

        int h,w; 
        double b;
        
        h = sc.nextInt(); 
        w = sc.nextInt(); 
        b =((10000*w)/(h*h)); 
        
    
        if(b<25){
        System.out.println(String.format("%.0f",b));
        }

        if(b>25)
        
         System.out.println(String.format("%.0f",b));
        System.out.println("obesity");
        }  
}