package view;

import controller.GameController;
import java.util.Arrays;

public class Main{
    public static void main(String args[]){
        GameController gc = GameController.getInstance();

        gc.inicializaCaso();

        System.out.println(getSeparador());
        gc.showDebrief();
        System.out.println(getSeparador());

        gc.percorreCenas();

    }
    public static String getSeparador(){
        char c[] = new char[100];  Arrays.fill(c,'-');
        return new String(c);
    }
}