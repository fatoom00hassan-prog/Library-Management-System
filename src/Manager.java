/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class Manager extends Users{
    
  private int ManagerID;
  private double Salary;
 
  

    public Manager(int ManagerID, int Salary,int UserID, String Name, String Email, String PasswordHash, String Role) {
        super( UserID,  Name,  Email,  PasswordHash,  Role);
        this.ManagerID = ManagerID;
        this.Salary = Salary;
        
    }

    public int getManagerID() {
        return ManagerID;
    }

    public double getSalary() {
        return Salary;
    }

   

     
    public void setManagerID(int ManagerID) {
        this.ManagerID = ManagerID;
    }

    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

       @Override
    public void showRole() {
        System.out.println("Manager: " + Name + " (ID: " + ManagerID + "), Salary: " + Salary);
    }

    
}
