/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Gilbert
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x = 12345;
        int reversed = 0;
        
        System.out.println("Original Number: " + x);
        
        while(x != 0){ 
            int remainder = x % 10;
            reversed = reversed * 10 + remainder; 
            x /= 10;
            
            
            
        }
        
        System.out.println("Reversed Number: " + reversed);
    }
    
}
