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
public class Person{
    //Fields
    private String name;
    private double age;
    private String address;
    private static int counter;
    //Constructor
    public Person(String n, double a, String addy) throws InvalidAge, InvalidName {
        /* We will handle two exceptions here. 
        First, we will deal with the Age exception, which will handle a negative
        age. We must do this in both the constructor and the mutators
        Second, we will deal with the InvalidName exception which will handle
        an empty or null string.
        ****** In order to use an exception you must implement a Try and Catch
        block to your main pogram when trying to create an object. ********
        */
        this.age = a;
       
        if(a < 0) {
           throw new InvalidAge("ERROR: Please enter a valid age" 
                   + "\nGiven Age: " + age);
           } else {
           System.out.println("Age was Accepted");
       }  
         this.name = n;
         
        if(n.isEmpty()) {
           throw new InvalidName("ERROR: Name Field is blank");
       } else {
           
      
       System.out.println("Name was accepted");
        
       this.address = addy;
       counter++;
       System.out.println("Person Object Created");
       }
    }
    //Mutators
    //Getters
    public String getName() {
        return "Name: " + name;
    }
    public String getAge() {
        return "Age: " + age;
    }
    public String getAddress() {
        return address;
    }
    //Setters
    public void setName(String nn) throws InvalidName {
        name = nn;
        if(nn.isEmpty())
            
            throw new InvalidName("Name cannot be set to blank");
           
            }
    public void setAge(double aa) throws InvalidAge {
        age = aa;
        if(aa < 0) {
            throw new InvalidAge("Age is Invalid Cannot be less than 0" 
                    + "\nAge: " + aa);
        } else {
            System.out.println("Age Succesfully Changed" + "\nNew Age: " + aa);
        }
    }
    public void setAddress(String ad) {
        address = ad;
    }
    public int getCount(int c) {
        return counter;
    }
    @Override
    public String toString() {
        String m = new String();
        return m = "Name: " + name + "\nAge: " + age + "\nAddress: " 
                 + address + "\nNumber of objects: " + counter;
    }
    public int compareTo(Object j) {
        int count = 0;
        Person pp = (Person) j;
        if(name == pp.name || age == pp.age || address == pp.address)
            count = 0;
        else if(name != pp.name || age != pp.age || address != pp.address)
            count = 1;
        return count;
    }
}

