import java.util.Scanner;

public class teste{
    public static void main(String[] args){
        
        Scanner scanner = new Scanner (System.in);
        
    
       System.out.println("Insira 1 para Celsius e 2 para Farenheit:");
       double a = scanner.nextDouble();
        
        System.out.println("Informe a temperatura da água");
        double b = scanner.nextDouble();
        
        
        
        if(a ==1){
            if(b <= 0){
            System.out.println("Água em estado sólido ");
        }
    }
    
     if(a ==1){
            if(b >0 && b<100){
            System.out.println("Água em estado líquido ");
        }
    }
    
     if(a ==1){
            if(b >= 100){
            System.out.println("Água em estado gasoso ");
        }
    }    
    
    if(a ==2){
            if(b <= 32){
            System.out.println("Água em estado sólido ");
        }
    }
    
    if(a ==2){
            if(b >32 && b < 212){
            System.out.println("Água em estado líquido ");
        }
    }
    
    if(a ==2){
            if(b >= 212){
            System.out.println("Água em estado gasoso ");
        }
    }
    
    

        }    
    }

    