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
        DecimalFormat dF = new DecimalFormat( "#.##" );
        double dollar =input*0.59;
        double value = dollar;
        double f= Double.parseDouble(dF.format(value));
        JOptionPane.showMessageDialog(null,"Amount of dollar "+ f+"$");
    }
    public  void AznToRub(double input){
        double rub =input*41.21;
        JOptionPane.showMessageDialog(null,"Amount of ruble "+ rub+"₽");
    }

    public  void AznToLira(double input){
        double lir =input*11.07;
        JOptionPane.showMessageDialog(null,"Amount of lira "+ lir+"₺");
    }


}
