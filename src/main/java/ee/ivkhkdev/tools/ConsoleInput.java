package ee.ivkhkdev.tools;

import ee.ivkhkdev.interfaces.Input;

import java.util.Scanner;
public class ConsoleInput implements Input {
    private Scanner scanner;

    public ConsoleInput(Scanner scanner) {
        this.scanner = scanner;
    }

    @Override
    public String nextLine(){
        return scanner.next();}

    @Override
    public int nextInt(){return scanner.nextInt();}
}
