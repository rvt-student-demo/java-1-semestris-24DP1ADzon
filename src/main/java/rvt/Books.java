package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {
    String title;
    String publicationYear;
    int pages;

    public Books(String title, String publicationYear, int pages){
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    String getTitle(){
        return this.title;
    }

    String getPublicationYear(){
        return this.publicationYear;
    }

    int getPages(){
        return this.pages;
    }

    void printEverything(){
        System.out.println(this.title + ", " + this.pages + " pages, " + this.publicationYear);
    }

    void printName(){
        System.out.println(this.title);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        ArrayList<Books> books = new ArrayList<>();

        String title;
        String publicationYear;
        int pages;

        while(true){
            System.out.print("Title: ");
            title = scanner.nextLine();

            if(title.equals("")){
                break;
            }
            
            System.out.print("\n");
            System.out.print("Pages: ");
            pages = Integer.valueOf(scanner.nextLine());
            System.out.print("\n");
            System.out.print("Publication year: ");
            publicationYear = scanner.nextLine();
            System.out.print("\n");

            Books newBook = new Books(title, publicationYear, pages);
            books.add(newBook);

        }
        
        System.out.print("What information will be printed? ");
        String infoType = scanner.nextLine();

        if(infoType.equals("everything")){
            for(int i = 0; i < books.size(); i++){
                books.get(i).printEverything();
            }    
        } else{
            for(int i = 0; i < books.size(); i++){
                books.get(i).printName();
            } 
        }
    }
}