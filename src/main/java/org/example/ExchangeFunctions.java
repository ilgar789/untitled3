package org.example;

import javax.swing.*;
import java.text.DecimalFormat;

public class ExchangeFunctions {

    public boolean checked(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0) ;
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
    public  void AznToDollar(double input){

        double dollar =ExchangeFunctions.doubleFormat(input,0.59);
        JOptionPane.showMessageDialog(null,"Amount of dollar "+ dollar+"$");

    }
    public  void AznToRub(double input){

        double rub =ExchangeFunctions.doubleFormat(input,41.21);
        JOptionPane.showMessageDialog(null,"Amount of ruble "+ rub+"₽");

    }

    public  void AznToLira(double input){

        double lir =ExchangeFunctions.doubleFormat(input,11.07);
        JOptionPane.showMessageDialog(null,"Amount of lira "+ lir+"₺");

    }

    public static double doubleFormat(double a ,double b){

        String result = String.format("%8.2f", a*b).replace(',', '.');
        double formatDouble=Double.parseDouble(result);
        return formatDouble;

    }

}
