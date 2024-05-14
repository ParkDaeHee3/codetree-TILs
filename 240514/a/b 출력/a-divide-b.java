import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); 

       double a,b,i; 
      
        a = sc.nextDouble();
        b = sc.nextDouble();
        
        BigDecimal n1 = BigDecimal.valueOf(a);
        BigDecimal n2 = BigDecimal.valueOf(b);
    
        BigDecimal result = n1.divide(n2, 20, RoundingMode.DOWN);
        System.out.println(result);    
    }}