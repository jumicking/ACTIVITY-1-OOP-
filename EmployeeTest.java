/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EmployeeTest;



/**
 *
 * @author MALILONG_CpE121
 */
    public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Jumayks", 0001, "Computer Science", 6500.0);
        Employee emp2 = new Employee("Myc", 0002, "Mechanical Engineering", 8000.0);
        Employee emp3 = new Employee("Jumss", 0003, "Electronics Engineering", 4000.0);

     
        emp1.displayEmployeeInfo();
        emp2.displayEmployeeInfo();
        emp3.displayEmployeeInfo();
      

    
    }
}


