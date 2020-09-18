/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */

import java.util.Scanner;

public class Procedures {
    Scanner scanner = new Scanner(System.in);
    private Database data = new Database();
    private boolean condition = true;

    public void menu(){
        System.out.print("? ");
        String choice = reader();
        if (choice.toLowerCase().equals("quit")){
            this.condition = false;
        }
        if (choice.toLowerCase().equals("add")){
            add();
        }
        if (choice.toLowerCase().equals("observation")){
            System.out.print("What was observed:? ");
            data.observe(reader());
        }
        if (choice.toLowerCase().equals("show")){
            System.out.print("What? ");
            data.birdResults(reader());
        }
        if (choice.toLowerCase().equals("statistics")){
            data.statistics();
        }
    }

    public String reader(){
        return scanner.nextLine();
    }

    public void add(){
        System.out.print("Name: ");
        String name = reader();
        System.out.print("Latin Name: ");
        String latinName = reader();
        Bird newBird = new Bird(name, latinName);
        data.add(newBird);
    }
    public boolean condition(){
        return this.condition;
    }
}