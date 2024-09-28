package exercise2;

import java.util.Random;
import javax.swing.JOptionPane;

public class Lotto {
    int[] randNum = new int[3];
    Random random = new Random();
    int arraySum = 0;

    Lotto(){
        for (int i = 0; i < randNum.length; i++) {
            randNum[i] = random.nextInt(9)+1;
        }
    }

    void getArraySum(){
        arraySum =0;
        for (int i = 0; i < randNum.length; i++) {
            arraySum += randNum[i];
        }
    }

    void startGame(){
        getArraySum();
        boolean youWin = false;
        for (int i = 0; i < 5; i++) {
            int userInput = Integer.parseInt(JOptionPane.showInputDialog
                    (null, "Enter Value rangeing between 3 and 27"));
            if(userInput==arraySum){
                JOptionPane.showMessageDialog(null, "Gotcha, You Won !!");
                youWin = true;
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Give it another try!!");
            }

        }
        if(youWin==false){

            JOptionPane.showMessageDialog(null, "Better luck next time! Answer is : "+arraySum);
        }
    }

    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        lotto.startGame();;
    }
}