/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Member extends Users{
     private int MemberID;
  
 
  

    public Member(int MemberID,int UserID, String Name, String Email, String PasswordHash, String Role) {
        super( UserID,  Name,  Email,  PasswordHash,  Role);
        this.MemberID = MemberID;
      
        
    }

    public int getMemberID() {
        return MemberID;
    }

     
    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }
@Override
    public void showRole() {
        System.out.println("Member: " +Name + " (ID: " + MemberID + ")");
    }


   
}
