import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in); 

        int temp1,temp2,temp3; 
        String input1 = "Y";
        String input2 = "N";

        
        String a =sc.next(); 
        temp1 = sc.nextInt();
        String b =sc.next(); 
        temp2 = sc.nextInt();
        String c =sc.next(); 
        temp3 = sc.nextInt(); 

        if( a.equals(input1) && temp1>37 ){
            System.out.println("E"); 
        }
        else if(b.equals(input1) && temp2>37){
                 System.out.println("E"); 
                 }
        else if (c.equals(input1) && temp3>37){
                  System.out.println("E"); 
                }
        else if ((temp1>=37&&temp2>=37)||(temp2>=37&&temp3>=37)||(temp1>=37&&temp3>=37)){
            System.out.println("E"); 
        }
        else{
            System.out.println("N");
        }
    }
    
}