
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
public class Database {
    private ArrayList<Bird> list = new ArrayList<Bird>();

    public void add(Bird bird){
        list.add(bird);
    }
    public void observe (String birdName){
        boolean noThatBird = true;
        for (Bird bird : list){
            if (bird.getName().equals(birdName)){
                bird.observation();
                noThatBird = false;
            }
            if (noThatBird){
                System.out.println("Is not a bird!");
            }
        }
    }
    public void statistics(){
        for (Bird bird: list){
            System.out.println(bird);
        }
    }
    public void birdResults(String name){
        for (Bird bird : list){
            if(bird.getName().equals(name)){
                System.out.println(bird);
            }
        }
    }
}
