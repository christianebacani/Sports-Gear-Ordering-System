import java.util.Scanner;
public class SportsGearOrderingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int price[] = {990,580,680,780,880,780,880,680,780};
        int total = 0;
        boolean transaction = true;
        
        System.out.print("Welcome to Bacani`s Sports Gear and Equipment Shop!\n");
        
        System.out.print("Username : ");
        String username = input.nextLine();
        
        System.out.print("Password : ");
        String password = input.nextLine();
        
        while(transaction){
            
        System.out.print("\n    AVAILABLE SPORTS GEAR\n\n");
        System.out.print("GEARS\t\tPRICE\n\n");
        System.out.print("1.) Sportswear\tP 990\n\n");
        System.out.print("2.) Gloves    \tP 580\n\n");
        System.out.print("3.) Sneakers  \tP 680\n\n");
        System.out.print("4.) Baseball Bat P 780\n\n");
        System.out.print("5.) Soccer Boots P 880\n\n");
        System.out.print("6.) Helmet    \tP 780\n\n");
        System.out.print("7.) Ball      \tP 880\n\n");
        System.out.print("8.) Goggles   \tP 680\n\n");
        System.out.print("9.) Softball  \tP 780\n\n");
        
        System.out.print("Enter your order here : ");
        int order = input.nextInt();
        
        System.out.print("Enter the quantity here : ");
        int quantity = input.nextInt();
        
        total += price[order - 1] * quantity;
        
        System.out.print("Do you want to order more (y/n)?: ");
        input.nextLine();
        String buyMore = input.nextLine();
        
        if(buyMore.equalsIgnoreCase("n")){
            transaction = false;
            System.out.print("The total price is : P " + total + "\n");
            
            System.out.print("Enter your payment here : ");
            int payment = input.nextInt();
            
            int change = payment - total;
            
            System.out.print("Change : P " + change + "\n\n\n");
            
            
        }
        
        }
        
        
        
    }
}
