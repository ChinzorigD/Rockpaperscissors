import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose rock, paper or scissors: ");
        String MyChoose = scanner.nextLine();
        if(MyChoose.equals("r")||MyChoose.equals("rock")){
            MyChoose="rock";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        } else if (MyChoose.equals("p")||MyChoose.equals("paper")) {
            MyChoose="paper";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        } else if (MyChoose.equals("s")||MyChoose.equals("scissors")) {
            MyChoose="scissors";
            System.out.print("The player choose is: ");
            System.out.println(MyChoose);
        }else {
            System.out.println("Invalid Input. Try Again...");
            return;
        }
        System.out.print("The computer choose is: ");
        String[] choose={"rock","paper","scissors"};
        Random rand=new Random();
        int computerRandomNumber=rand.nextInt(4);

        String computerMove="";
        switch (computerRandomNumber){
            case 1:
                computerMove="rock";
                break;
            case 2:
                computerMove="paper";
                break;
            case 3:
                computerMove="scissors";
                break;
        }
        System.out.println(computerMove);
    if((MyChoose.equals("rock")&&computerMove.equals("scissors"))||
        (MyChoose.equals("paper")&&computerMove.equals("rock"))||
        (MyChoose.equals("scissors")&&computerMove.equals("paper"))){
        System.out.println("You win");
        }
        else if ((MyChoose.equals("scissors")&&computerMove.equals("rock"))||
        (MyChoose.equals("rock")&&computerMove.equals("paper"))||
        (MyChoose.equals("paper")&&computerMove.equals("scissors"))) {
        System.out.println("You lose");
        }
        else{
            System.out.println("This game is draw.");
        }
    }
}

