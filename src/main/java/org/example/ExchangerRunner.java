package org.example;

import javax.swing.*;

public class ExchangerRunner {

    public static void getMessage(Object position1[],Object position2[]){

        int choice2=JOptionPane.showOptionDialog(null,
                "What Do You Wish To Do",
                "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,null,position2,position1[1]);


        if(choice2==0){

        }else{
            System.exit(1);
        }
    }


    public static void main(String[] args) {

        ExchangeFunctions exchangefunctions = new ExchangeFunctions();

        Object position1[]={"Dollar","Rubl" ,"Lira"};

        Object position2[]={"Try again","Quit"};

        while (true) {

            String input = JOptionPane.showInputDialog(null, "Enter value :");

            System.out.println(input);

            if(exchangefunctions.checked(input)) {

            int choice1=JOptionPane.showOptionDialog(null,
                    "Choose Which Currency You Wish To Convert",
                    "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,null,position1,position1[2]);


            if(choice1==0){

                exchangefunctions.AznToDollar(Double.parseDouble(input));

                ExchangerRunner.getMessage(position1,position2);


            }else if(choice1==1){

                exchangefunctions.AznToRub(Double.parseDouble(input));

                ExchangerRunner.getMessage(position1,position2);

            }else if(choice1==2){

                exchangefunctions.AznToLira(Double.parseDouble(input));

                ExchangerRunner.getMessage(position1,position2);

            }else{
                break;
            }


            }else{

                JOptionPane.showMessageDialog(null,"Invalid Output,try again");

            }

        }
    }


}
