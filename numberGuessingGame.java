
import java.util.Scanner;

public class numberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = (int)(Math.random()*100);
        int num = 0;
       try{ do{
            System.out.println("guess your number : ");
            num = sc.nextInt();

            if(myNum == num){
                System.out.println("you guessed it right ");
                exit();
                break;
            }
            else if(myNum > num && num>=0){
                System.out.println("tru again the number is higher");
            }
            else if(myNum < num && num>=0){
                System.out.println("try again the number is lesser");
            }
            else{
                quit();
            }
        } while(num >= 0);
    } catch(Exception e){
       // System.err.println(e);
    }
    sc.close();
        
    }

    private static void exit() {
        System.out.println("game over you won");
    }
    private static void quit() {
        System.out.println("you quit!!");
    }
}
