package pl.lublin.wsei.java.cwiczenia;

import pl.lublin.wsei.java.cwiczenia.mylib.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("piotr Gołabek");;
        System.out.println(acc.getName());
    }
}
