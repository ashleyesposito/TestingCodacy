/*
* File: homeworkTwoa.java
* Author: A. Esposito

*/

package homework4a;

import java.util.*;

/**
 *
 * @author Ashley
 */
public class Homework4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     // Start of scanner 
     Scanner scanner = new Scanner(System.in); // initiate scanner
     //Multi Dimensional Array of all state information
     String[][] stateInformation = {
         {"Alabama","Yellowhammer","Camelia"},
         {"Alaska","Willow Ptarmigan","Forget-me-not"},
         {"Arizona","Cactus Wren","Saguaro Cactus Blossom"},
         {"Arkansas","Mockingbird","Apple Blossom"},
         {"California","California Valley Quail","Golden Poppy"},
         {"Colorado","Lark Bunting","Columbine"},
         {"Connecticut","American Robin","Mountain Laurel"},
         {"Delaware","Blue Hen Chicken","Peach Blossom"},
         {"Florida","Mockingbird","Orange Blossom"},
         {"Georgia","Brown Thrasher","Cherokee Rose"},
         {"Hawaii","Nene (Hawaiian Goose)","Hibiscus"},
         {"Idaho","Mountain Bluebird","Syringa"},
         {"Illinois","Cardinal","Native Violet"},
         {"Indiana","Cardinal","Peony"},
         {"Iowa","Eastern Goldfinch","Wild Rose"},
         {"Kansas","Western Meadowlark","Native Sunflower"},
         {"Kentucky","Kentucky Cardinal","Goldenrod"},
         {"Louisiana","Pelican","Magnolia"},
         {"Maine","Chickadee","White Pine Cone and Tassel"},
         {"Maryland","Baltimore Oriole","Black-eyed Susan"},
         {"Massachusetts","Chickadee","Mayflower"},
         {"Michigan","Robin","Apple Blossom"},
         {"Minnesota","Common Loon","Pink and White Lady's Slipper"},
         {"Mississippi","Mockingbird","Magnolia"},
         {"Missouri","Bluebird","Hawthorn"},
         {"Montana","Western Meadowlark","Bitterroot"},
         {"Nebraska","Western Meadowlark","Goldenrod"},
         {"Nevada","Mountain Bluebird","Sagebrush"},
         {"New Hampshire","Purple Finch","Purple Lilac"},
         {"New Jersey","Eastern Goldfinch","Purple Violet"},
         {"New Mexico","Roadrunner","Yucca Flower"},
         {"New York","Bluebird","Rose"},
         {"North Carolina","Cardinal","Dogwood"},
         {"North Dakota","Western Meadowlark","Wild Prarie Rose"},
         {"Ohio","Cardinal","Scarlet Carnation"},
         {"Oklahoma","Scissor-Tailed Flycatcher","Mistletoe"},
         {"Oregon","Western Meadowlark","Oregon Grape"},
         {"Pennsylvania","Ruffed Grouse","Mountain Laurel"},
         {"Rhode Island","Rhode Island Red","Violet"},
         {"South Carolina","Carolina Wren","Yellow Jessamine"},
         {"South Dakota","Ring-Necked Pheasant","American Pasqueflower"},
         {"Tennessee","Mockingbird","Bluebonnet"},
         {"Texas","Mockingbird","Iris"},
         {"Utah","California Gull","Sego Lily"},
         {"Vermont","Hermit Thrush","Red Clover"},
         {"Virginia","Cardinal","Dogwood"},
         {"Washington","Willow Goldfinch","Western Rhododendron"},
         {"West Virginia","Cardinal","Big Rhododendron"},
         {"Wisconsin","Robin","Wood Violet"},
         {"Wyoming","Meadowlark","Indian Paintbrush"},
         {"Washington D.C.","Woodthrush","American Beauty Rose"}};
         //Start of loop to locate state information
         while(true){
             //Ask for user input
            System.out.println("Please enter the state you would like information on: ");
            //Scan user input and trim extra spaces before or after entry
            String state = scanner.nextLine().trim();
            //Ignore case from data entry and loop to allow to run repeatedly
            //until user enters NONE in which case it will exit the program
            if(state.equalsIgnoreCase("NONE"))
                
            //catch entry other than exit
            
            else{
                //Print State Information held in multidimensional array
                for(int row=0,column=0;row<stateInformation.length;row++){
                    if(stateInformation[row][0].equalsIgnoreCase(state)){
                        System.out.println("State: " + stateInformation[row][column]);
                        System.out.println("State Bird: " + stateInformation[row][column+1]);
                        System.out.println("State Flower: " + stateInformation[row][column+2]);
                    }
                }
            }
         }   
    }    
 }


    

