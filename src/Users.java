/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
abstract  class Users {
  protected int UserID;
  protected String Name;
  protected String Email ;
  protected String PasswordHash ;
  protected String Role;
  

    public Users(int UserID, String Name, String Email, String PasswordHash, String Role) {
        this.UserID = UserID;
        this.Name = Name;
        this.Email = Email;
        this.PasswordHash = PasswordHash;
        this.Role = Role;
      
    } 

    public int getUserID() {
        return UserID;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getPasswordHash() {
        return PasswordHash;
    }

    public String getRole() {
        return Role;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPasswordHash(String PasswordHash) {
        this.PasswordHash = PasswordHash;
    }

    public void setRole(String Role) {
        this.Role = Role;
    }

    public abstract void showRole();
    
}
