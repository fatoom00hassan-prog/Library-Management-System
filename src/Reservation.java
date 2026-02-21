
import java.sql.Timestamp;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Reservation {
     private int ReservationID;
  private int UserID;
  private int BookID;
  private Timestamp ReservationDate;
 

    public Reservation(int ReservationID, int UserID, int BookID, Timestamp ReservationDate) {
        this.ReservationID = ReservationID;
        this.UserID = UserID;
        this.BookID = BookID;
        this.ReservationDate = ReservationDate;
       
        
    }

    public int getReservationID() {
        return ReservationID;
    }

    public int getUserID() {
        return UserID;
    }

    public int getBookID() {
        return BookID;
    }

    public Timestamp getReservationDate() {
        return ReservationDate;
    }
  
    public void setReservationID(int ReservationID){
        this.ReservationID = ReservationID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setBookID(int BookID) {
        this.BookID = BookID;
    }

    public void setReservationDate(Timestamp ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

       public void displayInfo() {
        System.out.println("Reservation ID: " + ReservationID + ", Book ID: " + BookID + ", User ID: " + UserID);
    }

     
}
