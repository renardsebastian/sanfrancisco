package view;

import controller.GameController;

public class Main{
    public static void main(String args[]){
        GameController gc = GameController.getInstance();
        gc.showDebrief();
        gc.inicializaCaso();

    }
}