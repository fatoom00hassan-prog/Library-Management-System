/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ManageBook {
    private int BookID;
  private String Title;
  private String Author;
  private String ISBN;
  private String ShelfLocation ;
  private int CategoryID ;
  private String Status ;
  

    public ManageBook(int BookID, String Title, String Author, String ISBN, String ShelfLocation, int CategoryID, String Status) {
        this.BookID = BookID;
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
        this.ShelfLocation = ShelfLocation;
        this.CategoryID = CategoryID;
        this.Status = Status;
        
    }

    public int getBookID() {
        return BookID;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getShelfLocation() {
        return ShelfLocation;
    }

    public int getCategoryID() {
        return CategoryID;
    }
    public String getStatus() {
        return Status;
    }

     
    public void setBookID(int BookID) {
        this.BookID= BookID;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setShelfLocation(String ShelfLocation) {
        this.ShelfLocation = ShelfLocation;
    }

    public void setCategoryID(int CategoryID) {
        this.CategoryID = CategoryID;
    }
    public void setStatus(String Status) {
        this.Status = Status;
    }
        public void displayInfo() {
        System.out.println("Book ID: " + BookID + ", Title: " + Title + ", Author: " + Author);
    }

}
