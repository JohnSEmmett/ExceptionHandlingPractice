/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandlingpractice;

/**
 *
 * @author jsemm
 */
public class ExceptionHandlingPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /**Person joe = new Person("joe", 44, "888 Sample Address");
       System.out.print(joe.getName() + "\n" 
               + joe.getAge() + "\n" + joe.getAddress());
       
       
       */
       //checking how many objects have been created
       /**Person jack = new Person("Jack", 22, "7777");
       Person abby = new Person("Abby", 21, "8888");
       System.out.println(jack.toString());
       */
     
       Person jack = null;
       try {
           jack = new Person("", 23, "**********");
           System.out.println(jack.toString());
           
       }
       catch(InvalidAge | InvalidName e) {
           System.out.println(e.getMessage());
       }
      
    }
  
}
