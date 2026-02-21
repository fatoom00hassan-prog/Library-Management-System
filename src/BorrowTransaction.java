
import java.sql.Date;
import java.sql.Timestamp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class BorrowTransaction {
   
  private int TransactionID;
  private int UserID;
  private int BookID;
  private Timestamp BorrowDate;
  private Timestamp ReturnDate ;
  private String Status ;
  

    public BorrowTransaction(int TransactionID, int UserID, int BookID, Timestamp BorrowDate, Timestamp ReturnDate, String Status) {
        this.TransactionID = TransactionID;
        this.UserID = UserID;
        this.BookID = BookID;
        this.BorrowDate = BorrowDate;
        this.ReturnDate = ReturnDate;
        this.Status = Status;
        
    }
    // Overloaded constructor (Polymorphism) - Allows borrow transactions without a return date
    public BorrowTransaction(int transactionId, int userId, int bookId, Timestamp borrowDate, String status) {
        this(transactionId, userId, bookId, borrowDate, null, status);
    }

    public int getTransactionID() {
        return TransactionID;
    }

    public int getUserID() {
        return UserID;
    }

    public int getBookID() {
        return BookID;
    }

    public Timestamp getBorrowDate() {
        return BorrowDate;
    }

    public Timestamp getReturnDate() {
        return ReturnDate;
    }

    public String getStatus() {
        return Status;
    }

     
    public void setTransactionID(int TransactionID) {
        this.TransactionID = TransactionID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public void setBorrowDate(Timestamp BorrowDate) {
        this.BorrowDate = BorrowDate;
    }

    public void setReturnDate(Timestamp ReturnDate) {
        this.ReturnDate = ReturnDate;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
     public void displayInfo() {
        System.out.println("Transaction ID: " + TransactionID + ", Book ID: " + BookID + ", User ID: " + UserID);
    }

}
