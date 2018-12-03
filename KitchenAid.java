/*
 * File: KitchenAid.java
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
public class KitchenAid {

    /**
     * @param args the command line arguments
     */
    private boolean isOn = true;
    private int speed;
    private String mixerColor;

    
    public KitchenAid(boolean isOn, int speed, String mixerColor){
        this.isOn=isOn;
        this.speed=speed;
        this.mixerColor=mixerColor;
    }
     public KitchenAid(){
        this(false,2,null);
       }

    public boolean isIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMixerColor() {
        return mixerColor;
    }

    public void setMixerColor(String mixerColor) {
        this.mixerColor = mixerColor;
    }
    
    
}
