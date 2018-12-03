/*
 * File: KitchenAidMix.java
 * Ashley Esposito
 * September 26th, 2015
 * Java Program to capture Kitchen Aid blender speeds
 *  class to represent any household item of your choice 
 * (toaster, fan, hair dryer, piano ...) Your class should 
 * have a constructor, one additional method and at least 
 * one member variable (e.g. boolean isOn to turn the item 
 * on or off). Be sure you demonstrate your class works 
 * properly by constructing an instance of it and calling your method. 
 */

package kitchenaid;

/**
 *
 * @author Ashley
 */
public class KitchenAidMix {
    public static void main(String[] args){
        KitchenAid myMixer = new KitchenAid(true,6,"green");
        // Call Default Headphone settings from HeadPhone
        
        System.out.println("Is the mixer on? true/false: " + myMixer.isIsOn());
        System.out.println("Your mixer is: " + myMixer.getMixerColor());
        System.out.println("The current mixer speed is: " + myMixer.getSpeed());
        
    }
}
