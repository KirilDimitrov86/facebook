package com.company.communicatione;

import java.util.Scanner;

public class ConsoleCommunicationManager implements Communication{

    private Scanner scanner;

    public ConsoleCommunicationManager() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void show(String text) {
        System.out.println(text);
    }

    @Override
    public void show(Number number) {

    }

    @Override
    public String getTextInput() {
        return scanner.nextLine();
    }

    @Override
    public int getNumberInput() {
        int n = 0;
        boolean isNumber;

        do {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                isNumber = true;
            } else {
                isNumber = false;
            }
        }while (!(isNumber));
        return n;
    }
}
