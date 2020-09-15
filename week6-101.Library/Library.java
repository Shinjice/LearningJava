/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gebruiker
 */
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();
    
    public Library(){
        
    }
    
    public void addBook(Book newBook){
        library.add(newBook);
    }
    
    public void printBooks(){
        for(Book books : library){
            System.out.println(books);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book books : library){
            if(StringUtils.included(books.title(), title)){
                found.add(books);
            }
        }     
    return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book books : library){
            if(StringUtils.included(books.publisher(), publisher)){
                found.add(books);
            }
        }     
    return found;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> found = new ArrayList<Book>();
        for(Book books : library){
            if(StringUtils.included(String.valueOf(books.year()),String.valueOf(year))){
                found.add(books);
            }
        }     
    return found;
    }
}
