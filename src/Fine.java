/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Fine {
    private int FineID;
  private int UserID;
  private int Amount;
  private String Status ;
  

    public Fine(int FineID, int UserID, int Amount, String Status) {
        this.FineID = FineID;
        this.UserID = UserID;
        this.Amount = Amount;
        this.Status = Status;
        
    }

    public int getFineID() {
        return FineID;
    }

    public int getUserID() {
        return UserID;
    }

    public int getAmount() {
        return Amount;
    }

    public String getStatus() {
        return Status;
    }

     
    public void setFineID(int FineID) {
        this.FineID = FineID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }
         public void displayInfo() {
        System.out.println("Fine ID: " + FineID + ", User ID: " + UserID + ", Amount: " + Amount + ", Status: " + Status);
    }

}
