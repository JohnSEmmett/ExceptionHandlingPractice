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
public class InvalidAge extends Exception {
    public InvalidAge(String message) {
        super(message);
    }
}
